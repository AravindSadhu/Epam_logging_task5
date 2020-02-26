package com.epam.logger.task5;

import static org.junit.Assert.*;


import org.junit.Test;


public class HouseConstructionCostFULLYAUTOMATEDHIGHSTANDARDMATERIALTest {

	@Test
	public void test() {
		HouseConstructionCost test=new HouseConstructionCost();
		assertEquals(13750.00 ,test.costCalculator("HIGH_STANDARD_MATERIAL", 5.5, "YES"),0);
	}

}
