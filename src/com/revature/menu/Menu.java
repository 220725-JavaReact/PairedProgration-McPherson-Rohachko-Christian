package com.revature.menu;

import java.util.Scanner;

import com.revature.model.TextOption;

public class Menu {
	static Scanner input;
	
	public static void MainMenu(TextOption option){
		input = new Scanner(System.in);
		
		while(true) {
			int range = option.getAnswersLength();
			for(int i = 1; i <= range; i++) {
				System.out.println(i + ": " + option.getSingleAnswer(i-1).getPreviewPrompt());
			}
			if(range == 0) {
				
				option.CallItsMenu(0); //method requires int, but doesn't alway use it, this 0 is not used but a int is required
			}
			int num = 0;
			try {
				num = input.nextInt();
			} catch(Exception e) {
				System.out.println("Invaid input");
				input.nextLine();
				continue;
			}
			if(num > 0 && num <= range) {
				option.CallItsMenu(num-1);
			} else {
				System.out.println("Invaid input");
			}
		}
	}
}
