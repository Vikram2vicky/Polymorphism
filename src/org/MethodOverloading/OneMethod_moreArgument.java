package org.MethodOverloading;

public class OneMethod_moreArgument {
	
	private void tvDetails(String name,int model) {		
		System.out.println("Tv name is "+name+"\n"+"Tv model is "+model);
	}
	
	private void tvDetails(String Ram,String processor) {		
		System.out.println("Tv RAM is "+Ram+"\n"+"Tv processor is "+processor);
	}
	
	
	public static void main(String[] args) {
		OneMethod_moreArgument om=new OneMethod_moreArgument();
		om.tvDetails("Toshibha", 2233);
		om.tvDetails("8GB", "Snapdragon");
	}
	
	

}
