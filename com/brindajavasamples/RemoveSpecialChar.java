package com.brindajavasamples;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String str = "#%jA(*V(A!ST@AR*)";
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);

	}

}
