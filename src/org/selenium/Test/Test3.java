package org.selenium.Test;


public class Test3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="Welcome to core java class";
	     String str2="Welcome to core java class";
		 String str3=" Welcome to core java class ";
		 String str4=str1.concat("Harbajan");
			
	       
		       
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.charAt(5));
		System.out.println(str1.startsWith("W"));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.endsWith("s"));
		System.out.println(str1.replace("core java", "java core"));
		System.out.println(str1.substring(9, 12));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str3.trim());
		System.out.println(str1.isEmpty());
		System.out.println(str4);
		System.out.println(str1.replaceAll("\\s", ""));
		
	}

}
