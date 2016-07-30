package com.zpapi.other.model;

import org.springframework.util.Assert;

import com.zpapi.other.error.BusinessException;
import com.zpapi.other.error.ErrorCode;
import com.zpapi.other.service.UcMembersManager;
import com.zpapi.other.util.Md5Util;

/**
 * 用户登陆枚举。
 * 
 * @author Luffy
 *
 */
public enum LoginMode {
	// 用户
	USERNAME("1", "用户昵称", ErrorCode.sys_051) {
		@Override
		public UcMembers getUcMemberInfo(UcMembersManager manager, String userName) {
			return manager.getByUsername(userName);
		}
	},
	// 邮箱
	EMAIL("2", "邮箱", ErrorCode.sys_052) {
		@Override
		public UcMembers getUcMemberInfo(UcMembersManager manager, String userName) {
			return manager.getByEmail(userName);
		}
	},
	// 手机号
	MOBILENUM("3", "手机号码", ErrorCode.sys_065) {
		@Override
		public UcMembers getUcMemberInfo(UcMembersManager manager, String userName) {
			boolean checkMobileNumber = Md5Util.isMobileNumber(userName);
			if (!checkMobileNumber) {
				// 不符合手机号码规则
				throw new BusinessException(ErrorCode.sys_062);
			}
			return manager.getByMobile(userName);
		}
	};

	private String flag;
	private String name;
	private ErrorCode errorCode;

	private LoginMode(String flag, String name, ErrorCode errorCode) {
		this.flag = flag;
		this.name = name;
		this.errorCode = errorCode;
	}

	public String getFlag() {
		return flag;
	}

	public String getName() {
		return name;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public abstract UcMembers getUcMemberInfo(UcMembersManager manager, String userName);

	public static UcMembers getUcMember(UcMembersManager manager, String flag, String userName) {
		Assert.notNull(manager);
		LoginMode mode = getModeByFlag(flag);
		UcMembers user = mode.getUcMemberInfo(manager, userName);
		if (user == null) {
			throw new BusinessException(mode.getErrorCode());
		}
		return user;
	}

	/**
	 * 默认使用用户昵称方式登陆。
	 * 
	 * @param flag
	 * @return
	 */
	public static LoginMode getModeByFlag(String flag) {
		if ("1".equals(flag)) {
			return USERNAME;
		}
		if ("2".equals(flag)) {
			return EMAIL;
		}
		if ("3".equals(flag)) {
			return MOBILENUM;
		}
		return USERNAME;
	}

	public static boolean isUserNameMode(String flag) {
		LoginMode mode = getModeByFlag(flag);
		return USERNAME.equals(mode);
	}
}
