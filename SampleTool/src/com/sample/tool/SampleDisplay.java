package com.sample.tool;

public class SampleDisplay {

	
	int data[]={5,7,9};
	
	public void displayData(){
		
		System.out.println("Inside displayData");
		for(int i=0;i<data.length;i++){
			System.out.println("data!!!: "+data[i]);
		}
	}
}
