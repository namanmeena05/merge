package com.javabasics;

public class NoteCount {
	public static void main(String[] args) {
		
		int [] note = {2000,500,200,100,50,20,10};
		int amount =5530;
		int count =0;
		for (int i = 0; i < note.length; i++) {
			count =amount/note[i];
		//	System.out.println(count);
			amount= amount%note[i];
		//	System.out.println(amount);
		
			System.out.println(note[i]+"="+count );
		}
		
	}

}
