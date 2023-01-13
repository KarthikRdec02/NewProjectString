package org.string;

public class StringBuffer {
	private String reverse;

	public static void main(String[] args) {
		// string is immutable (unchangable)
		String name = "karthik";
		System.out.println("StSring appended new name :" + name.concat("Tamil"));
		System.out.println("original name :" + name);
		System.out.println("*******************************");

		// stringBuffer is mutable(Changable)
		java.lang.StringBuffer a = new java.lang.StringBuffer("Tamil");
		System.out.println("String buffer Append new name :" + a.append("nirai"));
		System.out.println("original name :" + a);
		// stringbuffer reverse
		System.out.println("REverse :" + a.reverse());
		// replace
		java.lang.StringBuffer b = new java.lang.StringBuffer("NIRAI");
		System.out.println("replace name :" + b.replace(1, 3, "uhfg"));
		System.out.println("delete:" + b.delete(1, 3));
		java.lang.StringBuffer c = new java.lang.StringBuffer("NIRAIMATHI");
		System.out.println("delete:" + c.delete(0, 3));
		
		StringBuffer n =new  StringBuffer();
	}

}