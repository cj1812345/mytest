package com.itheima.util;

import java.io.InputStream;
import java.util.Properties;

public class LoadProp {
	public String getProperty(String key){
		try {
			//文件流
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("msg.properties");
			//读取配置文件工具类
			Properties properties = new Properties();
			properties.load(inputStream);
			inputStream.close();
			return properties.getProperty(key);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
