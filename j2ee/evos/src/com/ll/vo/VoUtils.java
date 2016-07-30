package com.ll.vo;

import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.lang.reflect.Field;  
  
import org.apache.commons.lang.StringUtils;  
  
  
/** 
* @author Administrator 
* 
*/  
public class VoUtils {  
public VoUtils(){}  
  
//根据java类对象的类型返回vo类型  
public static String getClassType(Class c){  
   String typeName = c.getSimpleName();  
    
   if (typeName.equals("String") || typeName.equals("Date") || typeName.equals("Boolean")) {  
    return typeName;  
   }else if (typeName.equals("BigDecimal") || typeName.equals("Decimal") ||  
      typeName.equals("Double")) {  
    return "Number";  
   }else if (typeName.equals("Integer")) {  
    return "int";  
   }else {  
    return "*";//其它类型的设置为未知类型,此处由自己去补充完善，并不建议使用"*"  
   }  
     
}  
//重复c字符count次，用于格式化生成的as文件  
public static String repeat(String c, int count){  
   String temp = "";  
   for(int i = 0;i<count ;i++){  
    temp += c;  
   }  
    
   return temp;  
}  
/** 
* 生成as文件 
* @param pojoName java对象名称 
* @param packageName flex中vo对象的包名 
* @throws ClassNotFoundException 
* @throws IOException 
*/  
public static void generateAsFile(String pojoName, String packageName, String folder)  
    throws ClassNotFoundException, IOException {  
   Class c = Class.forName(pojoName);  
   Field[] fields =c.getDeclaredFields();  
    
   //as的vo对象名称结尾加上VO标志  
   // File f = new File(folder+c.getSimpleName()+"VO.as");  
   File f = new File(folder+c.getSimpleName()+".as");  
   BufferedWriter bw = new BufferedWriter(  
           new FileWriter(f));  
   //包名，没有设置包名就取和java pojo一样的包名  
   if (StringUtils.isEmpty(packageName)){  
    bw.write("package "+c.getPackage().getName()+"\n{\n");  
   }else{  
    bw.write("package "+packageName+"\n{\n");  
   }  
    
   //写类  
   bw.write(repeat(" ",4)+"public class "+c.getSimpleName()+"VO\n");  
   bw.write(repeat(" ",4)+"{\n");  
    
   //写属性  
   for(int i=0;i<fields.length;i++){  
    Class fieldType = fields[i].getType();  
    String typeName = getClassType(fieldType);  
    bw.write(repeat(" ",8)+"private var _"+fields[i].getName()+":"+typeName+";\n");  
   }  
    
   bw.write("\n\n\n");  
   //写空的构造函数  
   bw.write(repeat(" ",8)+"public function "+c.getSimpleName()+"VO(){}\n\n");  
    
   //写 setter/getter 方法  
   for(int i=0;i<fields.length;i++){  
    Class fieldType = fields[i].getType();  
    String typeName = getClassType(fieldType);  
    //setter  
    bw.write(repeat(" ",8)+"public function set "+fields[i].getName()+"(value:"+typeName+"):void{\n");  
    bw.write(repeat(" ",12)+"this._"+fields[i].getName()+" = value;\n");  
    bw.write(repeat(" ",8)+"}\n\n");  
    //getter  
    bw.write(repeat(" ",8)+"public function get "+fields[i].getName()+"():"+typeName+"{\n");  
    bw.write(repeat(" ",12)+"return this._"+fields[i].getName()+";\n");  
    bw.write(repeat(" ",8)+"}\n\n\n");  
     
   }  
   bw.write(repeat(" ",4)+"}\n");  
   bw.write("}");  
   bw.close();    
}  
  
//测试，写了个测试  
public static void main(String[] args) throws ClassNotFoundException, IOException {  
   // TODO Auto-generated method stub  
   String[] pojos = {  
     "com.ll.vo.CardInfoVO" 
     };  
   for(int i=0;i<pojos.length;i++){  
    //Class c = Class.forName(pojos[i]);  
    //System.out.println("registerClassAlias('"+pojos[i]+"',com.nstar.orderexpress.vo."+c.getSimpleName()+"VO);");  
    VoUtils.generateAsFile(pojos[i],"com.ll.vo.CardInfoVO","C:/temp/");  
   }  
    
}  
  
}  
