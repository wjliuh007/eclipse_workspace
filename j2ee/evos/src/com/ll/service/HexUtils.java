package com.ll.service;


import java.io.ByteArrayOutputStream;

public final class HexUtils {
	public static final int[] DEC = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1,
			-1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1 };
	public static final byte[] HEX = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
			97, 98, 99, 100, 101, 102 };
	

	public static byte[] convert(String digits) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < digits.length(); i += 2) {
			char c1 = digits.charAt(i);
			if (i + 1 >= digits.length())
				throw new IllegalArgumentException("hexUtil.odd");

			char c2 = digits.charAt(i + 1);
			byte b = 0;
			if ((c1 >= '0') && (c1 <= '9'))
				b = (byte) (b + (c1 - '0') * 16);
			else if ((c1 >= 'a') && (c1 <= 'f'))
				b = (byte) (b + (c1 - 'a' + 10) * 16);
			else if ((c1 >= 'A') && (c1 <= 'F'))
				b = (byte) (b + (c1 - 'A' + 10) * 16);
			else
				throw new IllegalArgumentException("hexUtil.bad");

			if ((c2 >= '0') && (c2 <= '9'))
				b = (byte) (b + c2 - '0');
			else if ((c2 >= 'a') && (c2 <= 'f'))
				b = (byte) (b + c2 - 'a' + 10);
			else if ((c2 >= 'A') && (c2 <= 'F'))
				b = (byte) (b + c2 - 'A' + 10);
			else
				throw new IllegalArgumentException("hexUtil.bad");

			baos.write(b);
		}
		return baos.toByteArray();
	}

	public static String convert(byte[] bytes) {
		StringBuilder sb = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; ++i) {
			sb.append(convertDigit(bytes[i] >> 4));
			sb.append(convertDigit(bytes[i] & 0xF));
		}
		return sb.toString();
	}

	public static int convert2Int(byte[] hex) {
		if (hex.length < 4)
			return 0;
		if (DEC[hex[0]] < 0)
			throw new IllegalArgumentException("hexUtil.bad");
		int len = DEC[hex[0]];
		len <<= 4;
		if (DEC[hex[1]] < 0)
			throw new IllegalArgumentException("hexUtil.bad");
		len += DEC[hex[1]];
		len <<= 4;
		if (DEC[hex[2]] < 0)
			throw new IllegalArgumentException("hexUtil.bad");
		len += DEC[hex[2]];
		len <<= 4;
		if (DEC[hex[3]] < 0)
			throw new IllegalArgumentException("hexUtil.bad");
		len += DEC[hex[3]];
		return len;
	}

	private static char convertDigit(int value) {
		value &= 15;
		if (value >= 10)
			return (char) (value - 10 + 97);

		return (char) (value + 48);
	}

	public static short toShort(byte[] value) {
		short i = (short) (value[1] & 0xFF);
		i = (short) ((i << 8) | (value[0] & 0xFF));
		return i;
	}
}
