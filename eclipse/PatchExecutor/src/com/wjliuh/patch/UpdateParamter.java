package com.wjliuh.patch;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import nc.newinstall.util.DataSourceFactory;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.wjliuh.entity.DataSource;


public class UpdateParamter extends JFrame{
	public UpdateParamter() {
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 6, SpringLayout.EAST, button);
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Home\u8DEF\u5F84\uFF1A");
		springLayout.putConstraint(SpringLayout.SOUTH, button, 4, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, -2, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, button, -2, SpringLayout.NORTH, lblNewLabel);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, button, 6, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField, 89, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, -194, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -4, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 15, SpringLayout.NORTH, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		getContentPane().add(button);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 109, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 520, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, textField);
		getContentPane().add(comboBox);
		
		JLabel label = new JLabel("\u6570\u636E\u5E93\uFF1A");
		springLayout.putConstraint(SpringLayout.NORTH, label, 13, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u4E3B\u673A\uFF1A");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 6, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 4, SpringLayout.EAST, label_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 134, SpringLayout.EAST, label_1);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u7AEF\u53E3\uFF1A");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 6, SpringLayout.SOUTH, comboBox);
		getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 112, SpringLayout.EAST, textField_1);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5B9E\u4F8B\uFF1A");
		getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 3, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, label_3, -5, SpringLayout.WEST, textField_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 330, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, button);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u7528\u6237\u540D\uFF1A");
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 6, SpringLayout.SOUTH, label_1);
		springLayout.putConstraint(SpringLayout.EAST, label_4, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_1);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u5BC6\u7801\uFF1A");
		springLayout.putConstraint(SpringLayout.EAST, label_5, -238, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, label_2, 0, SpringLayout.EAST, label_5);
		springLayout.putConstraint(SpringLayout.SOUTH, label_5, -6, SpringLayout.NORTH, label_3);
		getContentPane().add(label_5);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 3, SpringLayout.SOUTH, textField_5);
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 6, SpringLayout.EAST, label_5);
		springLayout.putConstraint(SpringLayout.NORTH, textField_5, 21, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, button);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("\u5E93\u7C7B\u578B\uFF1A");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		springLayout.putConstraint(SpringLayout.NORTH, label_6, 6, SpringLayout.SOUTH, label_4);
		springLayout.putConstraint(SpringLayout.WEST, label_6, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, label_6, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(label_6);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 3, SpringLayout.SOUTH, textField_4);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField_1);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);
		this.setSize(539, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initAction();
	}

	/***
	 * 初始化按钮动作和下拉列表数据
	 */
	private void initAction() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				jfc.showOpenDialog(button);
				File select = jfc.getSelectedFile();
				textField.setText(select.getAbsolutePath());
				textField.setForeground(Color.BLACK);
				initDataSource();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()==null || textField.getText().trim().length()==0){
					textField.setText("请选择Home路径!");
					textField.setForeground(Color.RED);
					return;
				}
				updateJvmParam();
				updateMaterialOpts();
				careateTable((String)comboBox.getSelectedItem());
				
			}
		});
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==null){
					return;
				}
				Object ojb =((JComboBox)e.getSource()).getSelectedItem();
				List<DataSource> ds = DataSourceFactory.getDataSource(datasource);
				for(DataSource d:ds){
					if(ojb.equals(d.getDataSourceName())){
						textField_1.setText(getDbUrl(d,1));//ip
						textField_2.setText(getDbUrl(d,2));//端口
						textField_3.setText(getDbUrl(d,3));//实例
						textField_4.setText(d.getUser());//用户名
						textField_5.setText(d.getPassword());//密码
						textField_6.setText(d.getDatabaseType());//库类型
					}
				}
				
			}
		});
		
	}

	/**
	 * 解析出数据库IP，端口，用户,密码等信息
	 * @param ds
	 * @param type
	 * @return
	 */
	private String getDbUrl(DataSource ds,int type){
		//"jdbc:oracle:thin:@20.10.129.21:1521/ora12c"
		//"jdbc:oracle:thin:@20.10.129.21:1521:ora12c"
		//jdbc:sqlserver://20.10.80.88:1433;database=NC633_SQL0528 ;sendStringParametersAsUnicode=true;responseBuffering=adaptive
		
		if(ds.getDatabaseType().indexOf("ORACLE")>=0){
			String url = ds.getDatabaseUrl();
			url = url.replaceAll("/", ":");
			String[] str1 = url.split("@");
			String[] str2 = str1[1].split(":");
			
			if(type == 1){
				return str2[0];
			}else if (type == 2){
				return str2[1];
			}else if (type == 3){
				return str2[2];
			}
		}else if(ds.getDatabaseType().indexOf("SQLSERVER")>=0){
			String url = ds.getDatabaseUrl();
			
			String[] str1 = url.split(" ;");
			String[] str2 = str1[0].split("//");
			String[] str3 = str2[1].split(";");
			String[] str4 = str3[0].split(":");
			String[] str5 = str3[1].split("=");
			
			if(type == 1){
				return str4[0];
			}else if (type == 2){
				return str4[1];
			}else if (type == 3){
				return str5[1];
			}
		}

		return null;
	}
	private static List<Element> datasource = new ArrayList<Element>();
	/**
	 * 初始化数据源信息，给看控件赋值
	 */
	protected void initDataSource() {
		datasource = getDataSource();
        List<DataSource> ds = DataSourceFactory.getDataSource(datasource);
        String[] labels = new String[ds.size()];
        for(int i=0;i<ds.size();i++){
        	labels[i] = ds.get(i).getDataSourceName();
        }
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(labels);
        comboBox.setModel(dcm);
		textField_1.setText(getDbUrl(ds.get(0),1));//ip
		textField_2.setText(getDbUrl(ds.get(0),2));//端口
		textField_3.setText(getDbUrl(ds.get(0),3));//实例
		textField_4.setText(ds.get(0).getUser());//用户名
		textField_5.setText(ds.get(0).getPassword());//密码
		textField_6.setText(ds.get(0).getDatabaseType());//库类型
	}

	/**
	 * 从配置文件加载数据源信息
	 * @return
	 */
	private List<Element> getDataSource() {
		String fileName = textField.getText()+File.separator+"ierp/bin/prop.xml";
        SAXReader reader = new SAXReader();
        Document doc = null;
		try {
			doc = reader.read(new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"utf-8")));
		} catch (UnsupportedEncodingException | FileNotFoundException
				| DocumentException e) {
			e.printStackTrace();
		}
        Element root = doc.getRootElement();
        List<Element> childs = root.elements("dataSource");
		return childs;
	}

	/**
	 * 创建表
	 * @param ds
	 */
	protected void careateTable(String ds) {
		try {
			String url = textField_4.getText()+":"+textField_5.getText()+"/"+textField_1.getText()+":"+textField_2.getText()+":"+textField_3.getText();
			JdbcSession session = new JdbcSession(url);

			StringBuilder sql = new StringBuilder();
			sql.append("create table mm_mq_record (");
			sql.append(" filemd5 varchar2(50) not null,");
			sql.append(" allcount integer,");
			sql.append(" alreadycount integer default 0,");
			sql.append(" ts char(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'),");
			sql.append(" billtype varchar2(20)");
			sql.append(")");
			textArea.append("开始建表：mm_mq_record"+"\n");
			session.executeUpdate(sql.toString());
			textArea.append("建表：mm_mq_record"+"完成！\n");
		} catch (SQLException e) {
			if(e.getMessage().contains("ORA-00955")){
				textArea.append("表：mm_mq_record"+"已经被创建，不需再创建！\n");
			}
			if(e.getMessage().contains("ORA-01017")){
				textArea.append("用户名或密码不正确！\n");
			}
		} catch (Exception e) {
			textArea.append("建表执行失败！\n");
			e.printStackTrace();
			
			
		}

	}

	/**
	 * 修改物料相关信息
	 */
	protected static void updateMaterialOpts() {
    	String fileName = textField.getText()+File.separator+"pfxx/businessprocessor/uapbd.xml";
        try {
        	textArea.append("读取文件："+fileName+"\n");
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8")));
            textArea.append("解析文件："+fileName+"\n");
            Element root = doc.getRootElement();
            List<Element> list = root.elements();
            Attribute material = null;
            for(Element e:list){
            	Attribute  a = e.attribute("billtype");
            	if("material".equals(a.getValue())){
            		material = e.attribute("classname");
            		
            	}
            }
            if(material!=null && material.getValue()!=null && material.getValue().indexOf("MaterialPLMPfxxPlugin")<=0){
            	material.setValue("nc.bs.bd.material.pfxx.plm.MaterialPLMPfxxPlugin");
                try{
                	textArea.append("开始写文件："+fileName+"\n");
                	OutputFormat formt = new OutputFormat();
                	formt.setEncoding("UTF-8");
                    XMLWriter writer = new XMLWriter(new FileOutputStream(new File(fileName)),formt);
                    textArea.append("文件："+fileName+"已经修改！\n");
                    writer.write(doc);
                    writer.flush();
                    writer.close();
                    textArea.append("文件："+fileName+"写入完成\n");
                 }catch(Exception ex){
                    ex.printStackTrace();
                 }
            }else{
            	textArea.append("文件："+fileName+"已经修改，不需要再修改！\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/**
	 * 增加虚拟机参数
	 */
	protected void updateJvmParam() {
    	String fileName = textField.getText()+File.separator+"ierp/bin/prop.xml";
        try {
        	textArea.append("读取文件："+fileName+"\n");
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"utf-8")));
            textArea.append("解析文件："+fileName+"\n");
            Element root = doc.getRootElement();
            Element childs = root.element("domain");
            Element server = childs.element("server");
            Element jvmArgs = server.element("jvmArgs");
            String vlaue =jvmArgs.getText();
            if(vlaue!=null && vlaue.indexOf("-Duap.hotwebs")<=0){
                String temp = jvmArgs.getText()+" -Duap.hotwebs=uapws";
                textArea.append("开始写文件："+fileName+"\n");
                jvmArgs.setText(temp);
                try{
                	textArea.append("文件："+fileName+"已经修改！\n");
                	OutputFormat formt = new OutputFormat();
                	formt.setEncoding("UTF-8");
                    XMLWriter writer = new XMLWriter(new FileOutputStream(new File(fileName)),formt);
                    writer.write(doc);
                    writer.flush();
                    writer.close();
                    textArea.append("文件："+fileName+"写入完成\n");
                 }catch(Exception ex){
                    ex.printStackTrace();
                 }
            }else{
            	textArea.append("文件："+fileName+"已经修改，不需要再修改！\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	private static final long serialVersionUID = 1L;
	/** home路径 */
	private static JTextField textField;
	/** 日志窗口 */
	private static JTextArea textArea;
	private static JButton button = new JButton("...");
	/** 开始按钮 */
	private static JButton btnNewButton = new JButton("开始");
	/** 数据源下拉列表 */
	private static JComboBox comboBox = new JComboBox();
	private JTextField textField_1;//主机
	private JTextField textField_2;//端口
	private JTextField textField_3;//实例
	private JTextField textField_4;//用户名
	private JTextField textField_5;//密码
	private JTextField textField_6;//库类型

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		
		UpdateParamter u = new UpdateParamter();
		u.setVisible(true);
		

	}
}


