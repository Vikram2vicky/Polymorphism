package org.MethodOverloading;

public class oneMethod_oneArgument {

	private void mobileDetails(String name) {
		System.out.println("Mobile name is "+name);	
		
	}

	public void mobileDetails(int model) {
		System.out.println("Mobile model is "+model);
		this.mobileDetails("oppo");
		this.mobileDetails('m');
		
	}
	
	private void mobileDetails(char n) {
		System.out.println("char name is "+n);
		

	}

	public static void main(String[] args) {
		
		oneMethod_oneArgument mo=new oneMethod_oneArgument();
		mo.mobileDetails(8888);
		

	}
}
