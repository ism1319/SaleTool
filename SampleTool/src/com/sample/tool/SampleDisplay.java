package com.sample.tool;

import java.util.Iterator;

public class SampleDisplay {

	
	int data[]={1,5,7,9,15};
	
	public void displayData(){
		
		int sum =0;
		System.out.println("Inside displayData");
		for (int i : data) {
			System.out.println("data!!!: "+data[i]);
			sum+=data[i];
		}
		
		System.out.println("Summed number :"+sum);
	}
}
