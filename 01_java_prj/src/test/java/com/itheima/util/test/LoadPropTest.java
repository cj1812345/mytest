package com.itheima.util.test;

import org.junit.Test;

import com.itheima.util.LoadProp;


public class LoadPropTest {
	@Test
	public void testMsg(){
		String msg = new LoadProp().getProperty("msg");
		System.out.println(msg);
	}
	

}
