package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserProfile {
	String username, password;
	
	public UserProfile(String user, String pass) {
		username = user;
		password = pass;
	}
	
	public UserProfile authenticate(String user, String pass) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner( new File("users.txt") );
			while( scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				System.out.println(tokens[0] + user);
				if (tokens[0] == user && tokens[2] == pass) {
					UserProfile confirmed = new UserProfile(user, pass);
					return confirmed;
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}catch(@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String name) {
		this.username = name;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	
}
