package com.zpapi.other.util;

/**
 * 
 * @ClassName: OrderCode 
 * @Description: 订单模块错误码,3000开始；3500开始为购物车相关错误码
 * @author zhupengren
 * @date 2014年11月24日 下午4:31:24 
 *
 */
public class OrderCode extends ErrorCode {
	
	// 售后部分相关错误  
	/** 
	 * 3001 获取订单失败
	 */
	public static final OrderCode order_001 = new OrderCode(3001,"获取订单信息失败");
	/** 
	 * 3002 订单用户错误
	 */
	public static final OrderCode order_002 = new OrderCode(3002,"订单用户错误");
	/** 
	 * 3003 订单状态验证失败
	 */
	public static final OrderCode order_003 = new OrderCode(3003,"订单状态验证失败");
	/** 
	 * 3004 更新订单失败
	 */
	public static final OrderCode order_004 = new OrderCode(3004,"更新订单失败");
	/** 
	 * 3005 订单释放库存失败
	 */
	public static final OrderCode order_005 = new OrderCode(3005,"订单释放库存失败");
	/** 
	 * 3006 订单返还礼品卡失败
	 */
	public static final OrderCode order_006 = new OrderCode(3006,"订单返还礼品卡失败");
	/** 
	 * 3007 订单返还满减卡失败
	 */
	public static final OrderCode order_007 = new OrderCode(3007,"订单返还满减卡失败");
	/** 
	 * 3008 订单返还打折卡失败
	 */
	public static final OrderCode order_008 = new OrderCode(3008,"订单返还打折卡失败");
	/** 
	 * 3009 订单返还余额失败
	 */
	public static final OrderCode order_009 = new OrderCode(3009,"订单返还余额失败");
	/** 
	 * 3010 订单返还返券失败
	 */
	public static final OrderCode order_010 = new OrderCode(3010,"订单返还返券失败");
	/** 
	 * 3011 订单退还在线支付到余额失败
	 */
	public static final OrderCode order_011 = new OrderCode(3011,"订单退还在线支付到余额失败");
	/** 
	 * 3012 订单退还分期付款到余额失败
	 */
	public static final OrderCode order_012 = new OrderCode(3012,"订单退还分期付款到余额失败");
	/** 
	 * 3013 订单退还线下支付到余额失败
	 */
	public static final OrderCode order_013 = new OrderCode(3013,"订单退还线下支付到余额失败");
	/**
	 * 3014 购物车中没有商品
	 */
	public static final OrderCode order_014 = new OrderCode(3014,"购物车中没有商品");
	/**
	 * 3015 使用余额支付订单失败
	 */
	public static final OrderCode order_015	= new OrderCode(3015, "使用余额支付订单失败");
	/**
	 * 3016 没有对应的商品
	 */
	public static final OrderCode order_016	= new OrderCode(3016, "没有找到对应的商品");
	/**
	 * 3017 商品渠道错误,不能执行对应操作
	 */
	public static final OrderCode order_017	= new OrderCode(3017, "商品渠道错误,不能执行对应操作");
	/**
	 * 3018 订单正在分拣中,请稍后操作
	 */
	public static final OrderCode order_018 = new OrderCode(3018, "订单正在分拣中,请稍后操作");
	/**
	 * 3019 获取退款单失败
	 */
	public static final OrderCode order_019 = new OrderCode(3019, "获取退款单失败");
	/**
	 * 3020 手续费用大于退款金额
	 */
	public static final OrderCode order_020 = new OrderCode(3020, "手续费用大于退款金额");
	/**
	 * 3021 运费金额错误
	 */
	public static final OrderCode order_021 = new OrderCode(3021, "运费金额错误");
	/**
	 * 3022 分期付款手续费为空
	 */
	public static final OrderCode order_022 = new OrderCode(3022, "分期付款手续费为空");
	/**
	 * 3023 退款金额不能大于用户支付金额
	 */
	public static final OrderCode order_023 = new OrderCode(3023, "退款金额不能大于用户支付金额");
	/**
	 * 3023 扣除积分不能大于订单获得积分
	 */
	public static final OrderCode order_024 = new OrderCode(3024, "扣除积分不能大于订单获得积分");
	/**
	 * 3025 无支付记录或用户多次支付
	 */
	public static final OrderCode order_025 = new OrderCode(3025, "无支付记录或用户多次支付");
	/**
	 * 3026 退还的礼品卡金额不能大于用户使用的礼品卡金额
	 */
	public static final OrderCode order_026 = new OrderCode(3026, "退还的礼品卡金额不能大于用户使用的礼品卡金额");
	/**
	 * 3027 退还的余额不能大于用户使用的余额
	 */
	public static final OrderCode order_027 = new OrderCode(3027, "退还的余额不能大于用户使用的余额");
	/**
	 * 3028 用户余额不足
	 */
	public static final OrderCode order_028 = new OrderCode(3028, "用户余额不足");
	/**
	 * 3029 收货地址错误
	 */
	public static final OrderCode order_029 = new OrderCode(3029, "收货地址错误");
	/**
	 * 3030 商品数量错误
	 */
	public static final OrderCode order_030 = new OrderCode(3030, "退换商品数量错误");
	/**
	 * 3031 用户ID错误
	 */
	public static final OrderCode order_031 = new OrderCode(3031, "用户ID错误");
	/**
	 * 3032 订单删除失败
	 */
	public static final OrderCode order_032 = new OrderCode(3032, "订单删除失败");
	/**
	 * 3033 此商品无法换货
	 */
	public static final OrderCode order_033 = new OrderCode(3033, "此商品无法换货");
	/**
	 * 3034 此商品已拒收,无法退换货
	 */
	public static final OrderCode order_034 = new OrderCode(3034, " 此商品已拒收,无法退换货");
	/**
	 * 3035 订单金额不正确
	 */
	public static final OrderCode order_035 = new OrderCode(3035, "订单金额不正确");
	
	/**
	 * 3036  请升级版本购买海外商品
	 */
	public static final OrderCode order_036 = new OrderCode(3036, "请升级版本购买海外商品");
	
	/**
	 * 3036  货到付款超过最大金额,请选择其他支付方式
	 */
	public static final OrderCode order_037 = new OrderCode(3037, "货到付款最大限额1000,请选择其他支付方式");
	
	/**
	 * 3038 已经退还运费，不允许再次退还
	 */
	public static final OrderCode order_038 = new OrderCode(3037, "已经退还运费，不允许再次退还");
	
	//订单错误相关错误
	/**
	 * 3201 库存不足,创建订单失败
	 */
	public static final OrderCode order_201 = new OrderCode(3201, "库存不足,创建订单失败");
	
	/**
	 * 3202 购物车内有限购商品,请修改购物车
	 */
	public static final OrderCode order_202 = new OrderCode(3202, "购物车内有限购商品,请修改购物车");
	
	/**
	 * 3203 该商品不是手机端专享
	 */
	public static final OrderCode order_203 = new OrderCode(3203, "该商品不是手机端专享商品");
	/**
	 * 3204 赠品限购一件,请修改数量
	 */
	public static final OrderCode order_204 = new OrderCode(3204, "赠品限购一件,请修改数量");
	
	/**
	 * 3205 您的购物车没有商品,请添加商品后再下单
	 */
	public static final OrderCode order_205 = new OrderCode(3205, "您的购物车没有商品,请添加商品后再下单");
	
	/**
	 * 3206 海外购订单邮编不能为空
	 */
	public static final OrderCode order_206 = new OrderCode(3206, "海外购订单邮编不能为空");
	
	/**
	 * 3207 海外购税率不能为空
	 */
	public static final OrderCode order_207 = new OrderCode(3207, "海外商品税率不能为空，请维护税率");
	
	/**
	 * 3208 单品价格超出清关限额
	 */
	public static final OrderCode order_208 = new OrderCode(3208, "价钱超出清关限额");
	
	// 优惠卡券相关错误
	/**
	 * 3601 每个订单只能使用一种优惠券
	 */
	public static final OrderCode order_601	= new OrderCode(3601, "每个订单只能使用一种优惠券");
	/**
	 * 3602 优惠券券号错误
	 */
	public static final OrderCode order_602	= new OrderCode(3602, "优惠券券号错误");
	/**
	 * 3603 礼品卡金额与实际不符合
	 */
	public static final OrderCode order_603	= new OrderCode(3603, "礼品卡金额与实际不符合");
	/**
	 * 3604 优惠券状态错误,不能使用
	 */
	public static final OrderCode order_604	= new OrderCode(3604, "优惠券状态错误,不能使用");
	/**
	 * 3605 未达到优惠券使用条件或没有能够使用该优惠券的商品
	 */
	public static final OrderCode order_605	= new OrderCode(3605, "未达到优惠券使用条件或没有能够使用该优惠券的商品");
	/**
	 * 3606 活动设置有误
	 */
	public static final OrderCode order_606	= new OrderCode(3606, "活动设置有误");
	/**
	 * 3607 客户没有权限参加活动
	 */
	public static final OrderCode order_607	= new OrderCode(3607, "客户没有权限参加活动");
	
	/**
	 * 3036 一张订单只能使用一种类型的卡
	 */
	public static final OrderCode order_608 = new OrderCode(3608, "每张订单只能使用一种类型的卡");
	// 物流相关错误
	/**
	 * 3701 查询物流出错
	 */
	public static final OrderCode order_701	= new OrderCode(3701, "物流查询出错");
	/**
	 * 3702 物流下单出错
	 */
	public static final OrderCode order_702	= new OrderCode(3702, "物流下单出错");
	/**
	 * 3703 此订单不可收派
	 */
	public static final OrderCode order_703	= new OrderCode(3703, "此订单不可收派");
	/**
	 * 3704 确认订单失败
	 */
	public static final OrderCode order_704	= new OrderCode(3704, "确认订单失败");
	/**
	 * 3705 查询订单失败
	 */
	public static final OrderCode order_705	= new OrderCode(3705, "查询订单失败");
	/**
	 * 3706 订单签收失败
	 * */
	public static final OrderCode order_706	= new OrderCode(3706, "订单签收失败");
	/**
	 * 3707 订单签收失败
	 * */
	public static final OrderCode order_707	= new OrderCode(3707, "订单打印失败,运单号为空");
	/**
	 * 3708 系统繁忙,请稍后再试
	 * */
	public static final OrderCode order_708	= new OrderCode(3708, "系统繁忙,请稍后再试");
	/**
	 * 3706 订单已刪除或取消
	 * */
	public static final OrderCode order_709	= new OrderCode(3709, "订单已刪除或取消");
	/**
	 * 3706 第三方供货商不存在
	 * */
	public static final OrderCode order_710	= new OrderCode(3710, "第三方供货商不存在");
	/**
	 * 3706 订单不存在
	 * */
	public static final OrderCode order_711	= new OrderCode(3711, "订单不存在");
	/**
	 * 3706 订单不存在
	 * */
	public static final OrderCode order_712	= new OrderCode(3712, "礼品卡不支持礼品卡支付");
	
	/**
	 * 3706 报关信息不能为空
	 * */
	public static final OrderCode order_713	= new OrderCode(3713, "报关信息不能为空");
	/**
	 * 3706 海外订单不支持优惠卡券
	 * */
	public static final OrderCode order_714	= new OrderCode(3714, "海外订单不支持优惠卡券");
	/**
	 * 礼品卡请立即购买,不能加入购物车
	 * */
	public static final OrderCode order_715	= new OrderCode(3715, "礼券和商品不能混合购买");
	/**
	 * 每个订单只能使用一张返券
	 * */
	public static final OrderCode order_716	= new OrderCode(3716, "每个订单只能使用一张返券");
	/**
	 * 发货订单状态更新失败
	 * */
	public static final OrderCode order_717	= new OrderCode(3717, "发货订单取消数量更新失败");
	/**
	 * 订单签收时间过长
	 * */
	public static final OrderCode order_718 = new OrderCode(3718, "订单签收时间过长");
	/** 
	 * 生成发货单失败 
	 * 
	 * */
	public static final OrderCode order_719 = new OrderCode(3719, "生成发货单失败");
	/** 
	 * 更新发货单积分失败
	 * 
	 *  */
	public static final OrderCode order_720 = new OrderCode(3720, "更新积分失败");
	/** 
	 * 已获得顺丰单号,请核查
	 *  */
	public static final OrderCode order_721 = new OrderCode(3721, "已获得顺丰单号,请核查");
	/**
	 * 仓库id错误
	 */
	public static final ErrorCode order_722 =  new OrderCode(3722, "仓库id错误");
	/**
	 * 没查询到订单明细表
	 */
	public static final ErrorCode order_723 =  new OrderCode(3723, "没查询到订单明细表");
	/**
	 * 顺丰下单失败
	 */
	public static final ErrorCode order_724 =  new OrderCode(3724, "顺丰下单失败");
	/**
	 * 本单不支持货到付款,请选择其他支付方式
	 */
	public static final ErrorCode order_725 =  new OrderCode(3725, "本单不支持货到付款,请选择其他支付方式");
	/** 
	 * 商品库存不足或已下架
	 */
	public static final ErrorCode order_726 = new OrderCode(3726,"商品库存不足或已下架");
	/** 
	 * 换货订单不允许再换货
	 */
	public static final ErrorCode order_727 = new OrderCode(3727,"换货订单不允许再换货");
	/** 
	 * 海外订单不允许换货
	 */
	public static final ErrorCode order_728 = new OrderCode(3728,"海外订单不允许换货");
	/** 
	 * 此订单已冲或者无对应的优惠券taskid
	 */
	public static final ErrorCode order_729 = new OrderCode(3729,"此订单已冲或者无对应的优惠券taskid");
	/** 
	 * 订单签收后才可退换货
	 */
	public static final ErrorCode order_730 = new OrderCode(3730,"订单签收后才可退换货");
	/** 
	 * 购买的商品中有活动特殊商品，用户不符合购买条件，请查看
	 */
	public static final ErrorCode order_731 = new OrderCode(3731,"购买的商品中有活动特殊商品，用户不符合购买条件，请查看");
	/** 
	 * 请输入正确卡号
	 */
	public static final ErrorCode order_732 = new OrderCode(3732,"请输入正确卡号");
	/** 
	 * 购物车选中的商品中，有商品购买数量为0，请查看
	 */
	public static final ErrorCode order_733 = new OrderCode(3733,"购物车选中的商品中，有商品购买数量为0，请查看");
	/** 
	 * 此商品已经晒单
	 */
	public static final ErrorCode order_734 = new OrderCode(3734,"此商品已经晒单");
	private OrderCode(int code, String codeMsg) {
		super(code, codeMsg);
	}

}
