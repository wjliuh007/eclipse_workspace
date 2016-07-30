package com.ll.service;


import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public  class DllInterface {
	
	public static void main(String[] args) {
		System.setProperty("jna.encoding","GBK");        
		String cPIN="123456";
		byte[] cMoney =new byte[8];
		CLibrary.INSTANCE.GetBalance(cPIN, cMoney);
		System.out.println(Integer.toString(Integer.parseInt(new String(cMoney), 16)));
		byte[] cRecinfo=new byte[460];
		short[] iRecNum=new short[1];
		CLibrary.INSTANCE.GetTradeRec("123456", cRecinfo, iRecNum);
		System.out.println(new String(cRecinfo));
		System.out.println(iRecNum[0]);
		System.out.println(new String (HexUtils.convert("00070000000000007D0100000000000120160301201001000600000034FB5E4401000000000001201603012005320005000000054C55E00100000000000120160301200521000400000000001D4C01000000000001201603011127000003000000000009C401000000000001201603010151370002000000000003E8010000000000012016030101473700010000000000006405000000000001201602291631330001000000000000640100000000000120160229115531")));
		
	}
	
//	public interface CLibrary  extends StdCallLibrary {
//		CLibrary  INSTANCE  = (CLibrary ) Native.loadLibrary("EcarBussinessApi",CLibrary.class);
//		
//		/**
//		 * 功能：读支付卡基本信息
//		 * @param cFile15:发行基本数据
//		 * @param cFile16:持卡人数据
//		 * @param cFile1:电动汽车专用信息
//		 * @return
//		 */
//		public int GetUserFileinfo(byte[]cFile15,byte[]cFile16,byte[]cFile1);
//		/**
//		 * 功能：读支付卡交易信息
//		 * @param cPIN:原密码
//		 * @param cRecinfo:记录信息
//		 * @param iRecNum:记录条数
//		 * @return
//		 */
//		public int GetTradeRec(String cPIN,byte[]cRecinfo,short[] iRecNum);
//		
//		/**
//		 * 功能：写卡号
//		 * @param cCardNo:卡号
//		 * @return
//		 */
//		int SetUserCardNo(String cCardNo);
//		/**
//		 * 功能：写支付卡信息
//		 * @param cFile15:发行基本数据
//		 * @param Flag15:写15文件标识
//		 * @param cFile16:持卡人数据
//		 * @param Flag16:写16文件标识
//		 * @param cFile1:电动汽车专用信息
//		 * @param Flag1:写1文件标识
//		 * @return
//		 */
//		int SetUserCard(String cFile15,int Flag15,String cFile16,int Flag16,String cFile1,int Flag1);
//		/**
//		 * 功能：修改密码
//		 * @param cOldPIN:原密码
//		 * @param cNewPIN:新密码
//		 * @return
//		 */
//		int PinChange(String cOldPIN,String cNewPIN);
//		/**
//		 * 功能：重置密码
//		 * @param cPIN:密码
//		 * @return
//		 */
//		int PinReload(String cPIN);
//		/**
//		 * 功能：圈存
//		 * @param cPIN:密码in
//		 * @param cMoney:金额out
//		 * @return
//		 */
//		int LoadMoney(String cPIN,String cMoney);
//		
//		/**
//		 * 功能：查询余额
//		 * @param cPIN：密码
//		 * @param cMoney：余额
//		 * @return
//		 */
//		int GetBalance(String cPIN,byte[] cMoney);
//		/**
//		 * 功能：圈提
//		 * @param unloadmoney:提取金额
//		 * @param mpin:密码,用于圈提时验证
//		 * @return
//		 */
//		int Unload(String unloadmoney,String mpin);
//		/**
//		 * 功能：获取灰锁记录
//		 * @param RecNum:记录条数
//		 * @param StrRec:灰锁记录信息
//		 * @return
//		 */
//		int GetGreyRecord(byte[] RecNum,byte[]StrRec);
//		/**
//		 * 功能：联机解扣
//		 * @param cPIN:密码
//		 * @param cMoney:扣款金额
//		 * @param cGreyNo:灰锁记录号
//		 * @return
//		 */
//		int GreyUnlock(String cPIN,String cMoney,String cGreyNo);
//	}
}
