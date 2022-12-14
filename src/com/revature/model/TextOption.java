package com.revature.model;

import java.util.Arrays;

import com.revature.menu.Menu;
import com.revature.util.Logger;
import com.revature.util.Logger.LogLevel;

public class TextOption {

	private String mainText;
	private TextOption[] answers;
	private String previewPrompt;
	private Boolean victoryState = false;
	public TextOption() {
		super();
		// TODO Auto-generated constructor stub
		Logger.log(LogLevel.info, "Created POJO: "+ toString());
	}
	public TextOption(String mainText, TextOption[] answers, String previewPrompt) {
		super();
		this.mainText = mainText;
		this.answers = answers;
		this.previewPrompt = previewPrompt;
		Logger.log(LogLevel.info, "Created POJO: "+ toString());
	}
	public TextOption(String mainText, TextOption[] answers, String previewPrompt, Boolean victoryState) {
		super();
		this.mainText = mainText;
		this.answers = answers;
		this.previewPrompt = previewPrompt;
		this.victoryState = victoryState;
		Logger.log(LogLevel.info, "Created POJO: "+ toString());
	}
	
	public void CallItsMenu(int i) {
		if(answers == null) {
			if(victoryState) {
				System.out.println(this.mainText);
				System.out.println("You beat the game");
				Logger.log(LogLevel.info, "User beat the game");
				return;
			} else
				System.out.println(this.mainText);
				System.out.println("You are dead as a doornail");
				Logger.log(LogLevel.info, "User lost the game");
			return;
		}
		Logger.log(LogLevel.info, "User called next POJO of options");
		Menu.MainMenu(this.answers[i]);
		
	}
	
	public String getMainText() {
		return mainText;
	}
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}
	public TextOption[] getAnswers() {
		return answers;
	}
	public TextOption getSingleAnswer(int i) {
		if(answers != null && (i >= answers.length || i < 0)) {
			return null;
		}
		return this.answers[i];
	}
	public void setAnswers(TextOption[] answers) {
		this.answers = answers;
	}
	public int getAnswersLength() {
		if(answers == null) {
			return 0;
		}
		return answers.length;
	}
	
	public String getPreviewPrompt() {
		return previewPrompt;
	}
	
	public void setPreviewPrompt(String previewPrompt) {
		this.previewPrompt = previewPrompt;
	}
	
	@Override
	public String toString() {
		return "TextOption [mainText=" + mainText + ", answers=" + Arrays.toString(answers) + ", previewPrompt="
				+ previewPrompt + "]";
	}
	
	
}
