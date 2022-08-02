package com.revature.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Garrett
 *
 */
public class Logger {
	private static void writeFile(String message) {
		try(FileWriter writer = new FileWriter(LocalDate.now().toString()+".log", true)){
			writer.append(message+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void log(LogLevel logLevel, String message) {
		Log newLog = new Log(logLevel, LocalDateTime.now(), message);
		writeFile(newLog.toString());
	}
	
	private static class Log{
		LogLevel logLevel; 
		LocalDateTime timestamp; 
		String message;
		
		public Log(LogLevel logLevel, LocalDateTime timestamp, String message) {
			super();
			this.logLevel = logLevel;
			this.timestamp = timestamp;
			this.message = message;
		}
		@Override
		public String toString() {
			return logLevel + "\t" + timestamp + "\t" + message ;
		}
	}
	public enum LogLevel{
		info, debug, verbose, warning, fatal, error
	}
	
}
