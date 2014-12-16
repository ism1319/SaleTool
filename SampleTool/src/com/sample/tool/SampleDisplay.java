package com.sample.tool;

/*
 * This Sample data is summed the sales data.
 */
public class SampleDisplay {

	
	int data[]={5,7,9};
	
	public void displayData(){
		int sum=0;
		System.out.println("Inside displayData");
		
		for(int i=0;i<data.length;i++){
			System.out.println("data!!!: "+data[i]);
			sum+=data[i];
		}
		
		System.out.println("Sum sales data :"+sum);
	}
}
