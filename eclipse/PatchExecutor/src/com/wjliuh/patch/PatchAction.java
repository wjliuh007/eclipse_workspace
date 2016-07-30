/**
 * 
 */
package com.wjliuh.patch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import nc.bs.sm.accountmanage.ScriptFileReader;
import nc.newinstall.util.ZipFileTool;

/**
 * @author JIE
 *
 */
public class PatchAction {

	private static File patchTempDir = null;

	private static String ncHome = "D:\\nchome\\home";
	private static String patch = "D:\\v65gj\\ria\\uapbd\\patch6.5_mm";
	private static Logger log = Logger.getLogger(PatchAction.class.getName());
	private static String backupPatch = null;
	private static JdbcSession session = null;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ZipException 
	 */
	public static void main(String[] args) throws Exception {
//		if(args.length<3){
//			System.out.println("参数设置异常！");
//		}
//		ncHome = args[0];
//		System.out.println(ncHome);
//		patch= args[1];
//		System.out.println(patch);
//		String dburl = args[2];
		PatchAction p = new PatchAction();
////		p.choseHome();
////		p.chosePatch();
//		p.backOrignPatch();
//		p.createTempDir(); 
//		p.extractToTempDir(new File(patch));
		session = new JdbcSession("c##tst_v65gold:1/20.10.129.21:1521:ora12c");
		p.careateTable(null);
//		p.doPatch();
//		p.deleteTemp(null);
//		p.record();
		log.log(Level.INFO, "执行完成！");
		session.close();

	}
	/**
	 * 创建表
	 * @param ds
	 */
	protected void careateTable(String ds) {
		StringBuilder sql = new StringBuilder();
//		sql.append("CREATE TABLE MM_MQ_RECORD (");
//		sql.append("  FILEMD5 VARCHAR2(50) NOT NULL,");
//		sql.append("  ALLCOUNT INTEGER,");
//		sql.append("  ALREADYCOUNT INTEGER DEFAULT 0,");
//		sql.append("  TS CHAR(19) DEFAULT to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'),");
//		sql.append("  BILLTYPE VARCHAR2(20),");
//		sql.append("  PRIMARY KEY (FILEMD5)");
//		sql.append(");");
		
		sql.append("CREATE TABLE wjliuh_user (");
		sql.append("name VARCHAR2(50) NOT NULL,");
		sql.append("age INTEGER");
		sql.append(");");
		try {
//			session.executeUpdate("drop table mm_mq_record;");
			session.executeUpdate(sql.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private void deleteTemp(String temp) {
		String[] tempTables = new String[]{"TMP_BOM_VID","TEMP_UAPBD_BOMMAR","TEMP_UAPBD_BOMMAR2"};
		for(String tab:tempTables){
			try {
				if(session.executeQuery("select * from user_tables where table_name ='"+tab+"'")>0){
					session.executeUpdate("drop table "+tab);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void record() {
		Properties p = new Properties();
		try {
			p.load(new InputStreamReader(new FileInputStream(patch+"\\setup.ini")));
			String productcode = p.getProperty("code");
			String productname = "基础数据";
			String patchversion = p.getProperty("version");
			
			if(session.executeQuery("select * from user_tables where table_name ='BD_BOM_PATCH_VERSION'")==0){
				createTable();
			}
			StringBuilder sb = new StringBuilder();
			sb.append("insert into BD_BOM_PATCH_VERSION(PATCHVERSION,PK_PATCHVERSION,PRODUCTCODE,PRODUCTNAME,BACKUPPATH) values('");
			sb.append(patchversion).append("','");
			sb.append(System.currentTimeMillis()).append("','");
			sb.append(productcode).append("','");
			sb.append(productname).append("','");
			sb.append(backupPatch).append("')");
			session.executeUpdate(sb.toString());
			System.out.println("本次打补丁记录已经保存到数据库，见表【bd_bom_patch_version】！");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void createTable() {
		StringBuilder sb = new StringBuilder();
		sb.append("create table BD_BOM_PATCH_VERSION(PATCHVERSION    VARCHAR2(100),PK_PATCHVERSION CHAR(20) not null,");
		sb.append("PRODUCTCODE     VARCHAR2(20),PRODUCTNAME     VARCHAR2(500),BACKUPPATH     VARCHAR2(500),TS              CHAR(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'))");
		try {
			session.executeUpdate(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void backOrignPatch() {
		String pub = ncHome+"\\modules\\uapbd\\classes";
		String client = ncHome+"\\modules\\uapbd\\client\\classes";
		String priv = ncHome+"\\modules\\uapbd\\META-INF\\classes";
		backupPatch = ncHome+"\\"+getTimeStmp();
		String pubbackup = backupPatch+"\\"+"public\\classes";
		String clientbackup = backupPatch+"\\"+"client\\classes";
		String privbackup = backupPatch+"\\"+"private\\classes";
		File temp = new File(pubbackup);
		temp.mkdirs();
		temp = new File(clientbackup);
		temp.mkdirs();
		temp = new File(privbackup);
		temp.mkdirs();
		xcopy(pub, pubbackup);
		xcopy(client, clientbackup);
		xcopy(priv, privbackup);
		
		
	}

	private void xcopy(String pub, String pubbackup) {
		try {
			String command  = "xcopy %s\\*.* %s\\/s";
			Process pro = Runtime.getRuntime().exec(String.format(command, pub,pubbackup));
			BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream(),"ISO8859-1"));
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println(new String(line.getBytes("ISO8859-1"),"gbk"));
			}
			br.close();
			pro.destroy();
                                
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private String getTimeStmp() {
		Calendar ca = Calendar.getInstance();
		return ""+ca.get(Calendar.YEAR)+(ca.get(Calendar.MONTH)+1)+ca.get(Calendar.DAY_OF_MONTH)+(ca.get(Calendar.HOUR)*60+ca.get(Calendar.MINUTE));
	}

	private void chosePatch() {
		// TODO Auto-generated method stub
		
	}

	private void choseHome() {
		// TODO Auto-generated method stub
		
	}

	public void createTempDir() {
		System.out.println(System.getProperty("user.home"));
		patchTempDir = new File(System.getProperty("user.home") + File.separator + "patchDir");
		if (patchTempDir.exists()) {
			patchTempDir.delete();
		}
		patchTempDir.mkdirs();
	}

	public void extractToTempDir(File srcPath) throws ZipException, IOException {
		for(File f:srcPath.listFiles()){
			if(!f.getName().endsWith(".jar"))
				continue;
			ZipFileTool zipTool = new ZipFileTool(f);
			ZipEntry[] entrys = zipTool.getEntrys();
			for (int i = 0; i < entrys.length; i++) {
				zipTool.copyZipEntyToDest(entrys[i], patchTempDir.getAbsolutePath());
			}
			
		}

	}
	
	public void doPatch() throws Exception{
		File[] update = patchTempDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if(pathname.getName().equals("update")){
					return true;
				}
				return false;
			}
		});
		doExecutSql(update[0]);

	}

	private void doExecutSql(File file) throws Exception {
		File[] sub = file.listFiles();
		for(File f:sub){
			if(f.isDirectory()){
				doExecutSql(f);
			}else{
				if(f.getName().endsWith(".blob")){
					continue;
				}
				ScriptFileReader sfr = new ScriptFileReader();
				ArrayList sqls = sfr.getSqlsFromFile(f);
				if(sqls.size()>0){
					SqlTool2 tool = new SqlTool2(sqls,log,session);
					tool.deleteData();
					tool.insert();
				}
				

			}
		}
		
	}



}
