package org.MethodOverloading;

public class This_method {

	
	private void cricket(String name,String mode) {
		System.out.println("type of cricket "+name+"\n"+"mode of cricket "+mode);
		this.cricket(1, "two");
		this.cricket("50 overs", 11);
	}
	
	private void cricket(String overs,int players) {
		System.out.println("No of Overs "+overs+"\n"+"no of players "+players);
	}
	
	private void cricket(int keepers,String um) {
		System.out.println("no of keepers "+keepers+"\n"+"no of umpires "+um);	

	}
	
	public static void main(String[] args) {
		This_method tm=new This_method();
		tm.cricket("50 overs", "oneday");
	}
}
