package org.string;

public class StringConcept {
	private static final Object Tech = null;

	public static void main(String[] args) {
		String a = "Greens,Technology,Tambaram";
		String c = "karthik Tamil Nirai";
		
		/*String b = "SeleniumAutomationTool";
		String d = "J A V A P R O G R AM";
		String e = "7200456518";
		int x = a.length() + b.length() + c.length();
		System.out.println("\n length " + x);
		int xd = d.length();
		System.out.println("\n length " + xd);
		int xe = e.length();
		System.out.println("\n length " + xe);
		int indexOf = a.indexOf('y');
		System.out.println(indexOf);
		int x1 = a.length();
		System.out.println("\n length " + x1);
		char b1 = b.charAt(12);
		System.out.println(b1);
		String e1 = e.substring(3,8);
		System.out.println(e1);
		Startswith**/
		System.out.println(a.length());
		System.out.println(a.charAt(7));
		System.out.println(a.equals("Greens"));
		System.out.println(a.equalsIgnoreCase("greensTechnologY"));
		System.out.println(a.isEmpty());
		System.out.println(a.contains("Tech"));
		System.out.println(a.substring(5));
		System.out.println("check "+a.substring(7, 9));
		System.out.println(c.concat("Nirai"));
		System.out.println(c.replace("k", "K"));
		System.out.println(a.indexOf("n",5));
		System.out.println(c.indexOf("K",2));
		System.out.println(a.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(String.join("@", "KARTHIK","tamil","Nirai"));
		//split
		String[] split = c.split(" ");
		for (String string : split) {
			System.out.println(string);
			String[] greens = a.split(",");
			for (String string2 : greens) {
				System.out.println(string2);
			}
		}
	}
}
