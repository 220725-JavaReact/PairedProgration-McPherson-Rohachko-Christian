package com.revature.main;

import java.util.Scanner;

import com.revature.menu.Menu;
import com.revature.model.TextOption;
import com.revature.util.Logger;
import com.revature.util.Logger.LogLevel;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//options for the game
		TextOption starter = new TextOption("You are lost in a Cave", null, null);
		TextOption leave = new TextOption("You are mauled by a bear", null, "Leave the cave");
		TextOption explore = new TextOption("You get lost", null, "Explore the cave");
		TextOption[] options = new TextOption[2];
		TextOption goblin = new TextOption("Hello stranger, come with me, I don't bite", null, "You see a goblin");
		TextOption[] goblinVictory = new TextOption[1];
		goblinVictory[0] = new TextOption("The Goblin helps you escapte the cave", null, "Follow Him", true);
		
		goblin.setAnswers(goblinVictory);
		TextOption treasure = new TextOption("The treasure is a deathtrap", null, "You see treasure");
		TextOption[] option2 = new TextOption[2];
		option2[0] = goblin;
		option2[1] = treasure;
		explore.setAnswers(option2);
		options[0] = leave;
		options[1] = explore;
		starter.setAnswers(options);
		
		
		Logger.log(LogLevel.info, starter.toString());
		
		Menu.MainMenu(starter);
		

	}

}
