package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//1 list- property list with names
//2 list- list of properties with diff owner/property address
//	show owner address + name
//

@SuppressWarnings("unused")
public class masterfile {
	public static void main(String[] args) throws FileNotFoundException {
		harbor harb = new harbor(1);
		harb.readForeclosure();
		harb.masterBuilder();
	}

}