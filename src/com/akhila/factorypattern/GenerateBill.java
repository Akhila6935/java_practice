package com.akhila.factorypattern;
import java.io.*;
import java.util.*;
public class GenerateBill {
public static void main(String[] args) throws IOException{
		
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println(" Enter the plan name to genreate the bill:");
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.println(" Enter the the number of units consumed: ");
		int units = Integer.parseInt(br.readLine());
		
		BillPlans bp = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for "+planName+"  of "+units+"unit");
		bp.getRate();
		bp.calculateBill(units);
		
	}
}



