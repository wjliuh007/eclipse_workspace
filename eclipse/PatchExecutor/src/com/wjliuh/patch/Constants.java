package com.wjliuh.patch;
import java.util.HashMap;

public class Constants {


	
	public static final HashMap<String,String> TEMPLATE_MAPING = new HashMap<String,String>();
	static{
		TEMPLATE_MAPING.put("pub_billtemplet", "pk_billtemplet");
		/** 单据模版*/
		TEMPLATE_MAPING.put("pub_billtemplet","pk_billtemplet");
		/** 单据模版，b表*/
		TEMPLATE_MAPING.put("pub_billtemplet_b","pk_billtemplet");
		/** 单据模版，t表*/
		TEMPLATE_MAPING.put("pub_billtemplet_t","pk_billtemplet");
		/** 查询模版，主表*/
		TEMPLATE_MAPING.put("pub_query_templet","id");
		/** 查询模版，条件表*/
		TEMPLATE_MAPING.put("pub_query_condition","pk_templet");
		/** 查询模版，方案表*/
		TEMPLATE_MAPING.put("pub_queryscheme","pk_template");
		/** 系统模版*/
		TEMPLATE_MAPING.put("pub_systemplate_base","pk_systemplate");
		/** 打印模版，主表*/
		TEMPLATE_MAPING.put("pub_print_template","ctemplateid");
		/** 打印模版，表格表*/
		TEMPLATE_MAPING.put("pub_print_cell","ctemplateid");
		/** 打印模版，变量表*/
		TEMPLATE_MAPING.put("pub_print_variable","ctemplateid");
		/** 参照表*/
		TEMPLATE_MAPING.put("bd_refinfo","pk_refinfo");
	}
	
	
	
}
