package org.methodOverRiding;

public class TwelthMark extends TenthMark {

	@Override
	public void mark(int English, int tamil, int Maths, int Sceince, int Social) {
		System.out.println("HSC English mark = "+English+"\n"+"HSC Tamil mark = "+ tamil+
				"\n"+"HSC Maths mark = "+Maths+"\n"+"HSC Science Mark = "+Sceince+"\n"+
				"HSC Social Mark = "+Social);
		super.mark(56, 66, 46, 77, 57);
		}

	@Override
	public void mark(int totalmark) {
		System.out.println("Total mark in HSC= "+totalmark);
		super.mark(56+66+46+77+57);
	}

	
	
	public static void main(String[] args) {
		TwelthMark tm=new TwelthMark();
		tm.mark(75, 99, 56, 87, 66);
		tm.mark(75+96+56+87+66);
		
	}

}
