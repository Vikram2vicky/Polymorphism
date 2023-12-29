package org.MethodOverloading;

public class MoreArguments_OrderNameChange {
	
	private void lapTop(String name,String model) {
		System.out.println("Laptop name is "+name+"\n"+"laptop model is "+model);
	}
 
	private void lapTop(String ram,String processor,String internal) {
		System.out.println("Lpatop RAM is "+ram+"\n"+"Lpatop Prov=cessor is "+processor+"\n"+"laptop Internal Memory is "+internal);
	}
	
	public static void main(String[] args) {
		MoreArguments_OrderNameChange mo=new MoreArguments_OrderNameChange();
		mo.lapTop("Hp","Hp229");
		mo.lapTop("8GB", "snapdragon", "128GB");
	}
	
	
	
}
