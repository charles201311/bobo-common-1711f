package com.bobo.common.utils;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		
		int i = NumberUtil.getPercent(51, 68);
		System.out.println(i);
	}

}
