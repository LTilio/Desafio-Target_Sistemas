package com.target_sistemas.desafio;

public class desafio02 {

	public static void main(String[] args) {
		
		String input = "A raposa";
		int count = CountChar(input);
		System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
	}
	
	public static  int CountChar(String input) {
		int count = 0;
		input = input.toLowerCase();
		
		for(char i : input.toCharArray()) {
			if(i =='a') {
				count++;
			}
		}		
		return count;
	}

}
