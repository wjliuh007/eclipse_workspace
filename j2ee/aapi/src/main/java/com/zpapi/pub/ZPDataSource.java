package com.zpapi.pub;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.util.CollectionUtils;

/**
 * 读/写动态选择数据库实现 <br/>
 * date: 2015年11月25日 下午1:53:12 <br/>
 *
 * @author sunshine
 * @version
 * @since JDK 1.7
 */
public class ZPDataSource extends AbstractDataSource implements InitializingBean {
	private static final Logger log = LoggerFactory.getLogger(ZPDataSource.class);

	private DataSource masterDataSource;
	private Map<String, DataSource> slaveDataSourceMap;

	private String[] readDataSourceNames;
	private DataSource[] readDataSources;
	private int readDataSourceCount;

	private AtomicInteger counter = new AtomicInteger(1);

	/**
	 * 设置读库（name, DataSource）
	 * 
	 * @param readDataSourceMap
	 */

	public void setMasterDataSource(DataSource masterDataSource) {
		this.masterDataSource = masterDataSource;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (masterDataSource == null) {
			throw new IllegalArgumentException("property 'writeDataSource' is required");
		}
		if (CollectionUtils.isEmpty(slaveDataSourceMap)) {
			throw new IllegalArgumentException("property 'readDataSourceMap' is required");
		}
		readDataSourceCount = slaveDataSourceMap.size();

		readDataSources = new DataSource[readDataSourceCount];
		readDataSourceNames = new String[readDataSourceCount];

		int i = 0;
		for (Entry<String, DataSource> e : slaveDataSourceMap.entrySet()) {
			readDataSources[i] = e.getValue();
			readDataSourceNames[i] = e.getKey();
			i++;
		}

	}

	public void setSlaveDataSourceMap(Map<String, DataSource> slaveDataSourceMap) {
		this.slaveDataSourceMap = slaveDataSourceMap;
	}

	private DataSource determineDataSource() {
		if (ZPDataSourceDecision.isChoiceWrite()) {
			log.debug("current determine write datasource");
			return masterDataSource;
		} else if (ZPDataSourceDecision.isChoiceNone()) {
			log.debug("no choice read/write, default determine write datasource");
			return masterDataSource;
		} else {
			return selectReadDataSource();
		}
	}

	private DataSource selectReadDataSource() {
		// 按照顺序选择读库
		// TODO 算法改进
		int index = counter.incrementAndGet() % readDataSourceCount;
		if (index < 0) {
			index = -index;
		}
		String dataSourceName = readDataSourceNames[index];
		log.debug("current determine read datasource : {}", dataSourceName);
		return readDataSources[index];
	}

	@Override
	public Connection getConnection() throws SQLException {
		return determineDataSource().getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return determineDataSource().getConnection(username, password);
	}
}
