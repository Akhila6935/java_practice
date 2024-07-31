package com.akhila.factorypattern;
import java.io.*;
abstract class BillPlans {
	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(units*rate);
	
	}	
}
