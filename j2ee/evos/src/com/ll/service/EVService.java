package com.ll.service;

import com.ll.vo.CardInfoVO;
import com.ll.vo.PayVO;

public class EVService {
	public final static String SUCCESS = "9000";
	public final static String FAILURE = "0000";
	static {
		System.setProperty("jna.encoding", "GBK");
	}

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("java.library.path"));
		System.setProperty("jna.encoding", "GBK");
		EVService s = new EVService();
		// s.GetBalance("123456");
		for (int i = 0; i < 1000; i++) {
			Thread.sleep(1000);
			System.out.println(s.GetBalance("123456").getMoney());
			s.GetUserFileinfo();
			s.GetTradeRec("123456");
		}

		// System.out.println(HexUtils.convert("李龙".getBytes()));
		// System.out.println(new
		// String(HexUtils.convert("00000000000000000000000000000000C0EEC1FA")));
		// s.GetTradeRec("123456");
	}

	public CardInfoVO GetUserFileinfo() {
		this.GetBalance("123456").getMoney();
		this.GetTradeRec("123456");
		System.out.println("GetUserFileinfo:");
		byte[] cFile15Bytes = new byte[58];
		byte[] cFile16Bytes = new byte[110];
		byte[] cFile1Bytes = new byte[44];
		CardInfoVO vo = new CardInfoVO();
		try {
			int result = CLibrary.INSTANCE.GetUserFileinfo(
					cFile15Bytes, cFile16Bytes, cFile1Bytes);
			String cFile15 = new String(cFile15Bytes);
			String cFile16 = new String(cFile16Bytes);
			String cFile1 = new String(cFile1Bytes);
			if (result == 0x9000) {
				String cFile15_1 = cFile15.substring(0, 16);
				String cFile15_2 = cFile15.substring(16, 18);
				String cFile15_3 = cFile15.substring(18, 20);
				String cFile15_4 = cFile15.substring(20, 40);
				String cFile15_5 = cFile15.substring(40, 48);
				String cFile15_6 = cFile15.substring(48, 56);
				String cFile15_7 = cFile15.substring(56, 58);
				System.out.println("cFile15:" + cFile15);
				System.out.println(cFile15_1);
				System.out.println(cFile15_2);
				System.out.println(cFile15_3);
				System.out.println(cFile15_4);
				System.out.println(cFile15_5);
				System.out.println(cFile15_6);
				System.out.println(cFile15_7);
				String cFile16_1 = cFile16.substring(0, 2);
				String cFile16_2 = cFile16.substring(2, 4);
				String cFile16_3 = new String(HexUtils.convert(cFile16
						.substring(4, 44))).trim();
				String cFile16_4 = new String(HexUtils.convert(cFile16
						.substring(46, 108))).trim();
				String cFile16_5 = cFile16.substring(108, 110);
				System.out.println("cFile16:" + cFile16);
				System.out.println(cFile16_1);
				System.out.println(cFile16_2);
				System.out.println(cFile16_3);
				System.out.println(cFile16_4);
				System.out.println(cFile16_5);
				System.out.println("cFile1:" + cFile1);
				String cFile1_1 = cFile1.substring(0, 18);
				String cFile1_2 = cFile1.substring(18, 20);
				String cFile1_3 = cFile1.substring(20, 28);
				String cFile1_4 = cFile1.substring(28, 44);
				System.out.println(cFile1_1);
				System.out.println(cFile1_2);
				System.out.println(cFile1_3);
				System.out.println(cFile1_4);
				vo.setcFile15_1(cFile15_1);
				vo.setcFile15_2(cFile15_2);
				vo.setcFile15_3(cFile15_3);
				vo.setcFile15_4(cFile15_4);
				vo.setcFile15_5(cFile15_5);
				vo.setcFile15_6(cFile15_6);
				vo.setcFile15_7(cFile15_7);
				vo.setcFile16_1(cFile16_1);
				vo.setcFile16_2(cFile16_2);
				vo.setcFile16_3(cFile16_3);
				vo.setcFile16_4(cFile16_4);
				vo.setcFile16_5(cFile16_5);
				vo.setcFile1_1(cFile1_1);
				vo.setcFile1_2(cFile1_2);
				vo.setcFile1_3(cFile1_3);
				vo.setcFile1_4(cFile1_4);
				vo.setResult(SUCCESS);
			} else {
				System.out.println("GetUserFileinfo is fail");
				vo.setResult(FAILURE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public void GetTradeRec(String cPIN) {
		byte[] cRecinfoBytes = new byte[460];
		short[] iRecNum = new short[1];
		int result = CLibrary.INSTANCE.GetTradeRec(cPIN,
				cRecinfoBytes, iRecNum);
		String cRecinfo = new String(cRecinfoBytes);
		String temp;
		for (int i = 1; i < iRecNum[0]; i++) {
			temp = cRecinfo.substring((i - 1) * 46, i * 46);
			// 联机或脱机交易序号
			String seq = temp.substring(0, 4);
			// 透支限额
			String overdraft = temp.substring(4, 10);
			// 交易金额
			String money = temp.substring(10, 18);
			// 交易类型标识
			String type = temp.substring(18, 20);// 01存 05消费
			// 终端机编号
			String no = temp.substring(20, 32);
			String day = temp.substring(32, 40);
			String time = temp.substring(40, 46);
//			System.out.print(temp+"-");
			System.out.print(seq+"-");
			System.out.print(overdraft+"-");
			System.out.print(money+"-");
			System.out.print(type+"-");
			System.out.print(no+"-");
			System.out.print(day+"-");
			System.out.println(time);
		}

	}

	public void SetUserCardNo(String cCardNo) {
		while (cCardNo.length() < 32) {
			cCardNo = "00" + cCardNo;
		}
		int result = CLibrary.INSTANCE.SetUserCardNo(cCardNo);
		if (result == 0x9000) {

		} else {

		}
	}

	public void SetUserCard(String cFile15, int Flag15, String cFile16,
			int Flag16, String cFile1, int Flag1) {
		// while (cFile15.length() < 32) {
		// cFile15 = "00" + cFile15;
		// }
		// while (cFile16.length() < 220) {
		// cFile16 = "00" + cFile16;
		// }
		// while (cFile1.length() < 88) {
		// cFile1 = "00" + cFile1;
		// }
		int result = CLibrary.INSTANCE.SetUserCard(cFile15,
				Flag15, cFile16, Flag16, cFile1, Flag1);
		if (result == 0x9000) {

		} else {

		}
	}

	public void PinChange(String cOldPIN, String cNewPIN) {
		while (cOldPIN.length() < 24) {
			cOldPIN = "00" + cOldPIN;
		}
		while (cNewPIN.length() < 24) {
			cNewPIN = "00" + cNewPIN;
		}
		int result = CLibrary.INSTANCE.PinChange(cOldPIN, cNewPIN);
		if (result == 0x9000) {

		} else {

		}

	}

	public void PinReload(String cPIN) {
		while (cPIN.length() < 24) {
			cPIN = "00" + cPIN;
		}
		int result = CLibrary.INSTANCE.PinReload(cPIN);
		if (result == 0x9000) {

		} else {

		}
	}

	public void LoadMoney(String cPIN, String cMoney) {
		while (cPIN.length() < 24) {
			cPIN = "00" + cPIN;
		}
		while (cMoney.length() < 16) {
			cMoney = "00" + cMoney;
		}
		int result = CLibrary.INSTANCE.LoadMoney(cPIN, cMoney);
		if (result == 0x9000) {

		} else {

		}
	}

	/**
	 * 获取余额
	 * 
	 * @param cPIN
	 * @return
	 */
	public PayVO GetBalance(String cPIN) {
		System.out.println("getMoney:");
		// cPIN="123456";
		byte[] cMoney = new byte[8];
		int result = CLibrary.INSTANCE.GetBalance(cPIN, cMoney);
		System.out.println(result);
		// System.out.println(Integer.toString(Integer.parseInt(new
		// String(cMoney), 16)));
		PayVO p = new PayVO();
		if (result == 0x9000) {
			p.setPwd(cPIN);
			String money = Integer.toString(Integer.parseInt(
					new String(cMoney), 16));
			p.setMoney(money.substring(0, money.length() - 2) + "."
					+ money.substring(money.length() - 2, money.length()));
			
			return p;
		} else {
			return null;
		}

	}

	public void Unload(String unloadmoney, String mpin) {
		int result = CLibrary.INSTANCE.Unload(unloadmoney, mpin);
		if (result == 0x9000) {

		} else {

		}
	}

	public void GetGreyRecord() {
		byte[] RecNumBytes = new byte[2];
		byte[] StrRecBytes = new byte[390];
		int RecNum = Integer.valueOf(new String(RecNumBytes));
		String StrRec = new String(StrRecBytes);
		int result = CLibrary.INSTANCE.GetGreyRecord(RecNumBytes,
				StrRecBytes);
		if (result == 0x9000) {

		} else {

		}
	}

	public void GreyUnlock(String cPIN, String cMoney, String cGreyNo) {
		int result = CLibrary.INSTANCE.GreyUnlock(cPIN, cMoney,
				cGreyNo);
		if (result == 0x9000) {

		} else {

		}

	}

}
