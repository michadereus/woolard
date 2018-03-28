package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import resources.foreclosure;


@SuppressWarnings("unused")
public class masterfile{
	
	public static void main(String[] args) throws FileNotFoundException {
		harbor harb = new harbor();
		harb.readHeirship();
		harb.readSubstitute();
		harb.readForeclosure();
		harb.readProbates();
	}
	
	public masterfile() {
		
	}
	

}