package com.epam.logger.task5;

import static org.junit.Assert.*;


import org.junit.Test;


public class HouseConstructionCostHIGHSTANDARDMATERIALTest {

	@Test
	public void test() {
		HouseConstructionCost test=new HouseConstructionCost();
		assertEquals(9900.00 ,test.costCalculator("HIGH_STANDARD_MATERIAL", 5.5, "NO"),0);
	}

}
