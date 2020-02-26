package com.epam.logger.task5;

import static org.junit.Assert.*;


import org.junit.Test;


public class HouseConstructionCostSTANDARDMATERIALTest {

	@Test
	public void test() {
		HouseConstructionCost test=new HouseConstructionCost();
		assertEquals(6600.00 ,test.costCalculator("YES", 5.5, "NO"),0);
	}

}
