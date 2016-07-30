package nc.newinstall.util;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

import com.wjliuh.entity.DataSource;

public class DataSourceFactory {
	public static List<DataSource> getDataSource(List<Element> dss){
		List<DataSource> datas = new ArrayList<DataSource>();
		for(Element ds:dss){
			List<Element> attrs = ds.elements();
			DataSource child = new DataSource();
			for(Element ele:attrs){
				if("dataSourceName".equals(ele.getName())){
					child.setDataSourceName(ele.getText());
				}else if("oidMark".equals(ele.getName())){
					child.setOidMark(ele.getText());
				}else if("databaseUrl".equals(ele.getName())){
					child.setDatabaseUrl(ele.getText());
				}else if("user".equals(ele.getName())){
					child.setUser(ele.getText());
				}else if("password".equals(ele.getName())){
					child.setPassword(ele.getText());
				}else if("driverClassName".equals(ele.getName())){
					child.setDriverClassName(ele.getText());
				}else if("databaseType".equals(ele.getName())){
					child.setDatabaseType(ele.getText());
				}
			}
			datas.add(child);
		}
		return datas;
		
	}
}
