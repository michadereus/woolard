

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class harbor extends masterfile{
	int types;
	foreclosure foreclose = new foreclosure();
	
	public harbor(int type) {
		//int x=5;//switches for making type object, counting, running aprop. class
		switch(type) {
		case 1:
			System.out.println("dsadas");
			read("foreclosure.csv", type);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	public void read(String string, int type) {
		
		try 
		{
			Scanner scan = new Scanner( new File(string) );
			String line = scan.nextLine();
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				String[] tokens = line.split(",");
				switch(type) {
				case 1:
					popForeclosure(tokens, foreclose);
					break;
				case 2:
					break;
				}
				//line = line.replaceAll(",", " ");
				//date[len] = tokens[len];
				//System.out.println(line.replaceAll(",", " "));
			}
			scan.close();			
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}catch(@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}
	}
	
	//void temp
	//t for tokens
	public void popForeclosure(String[] t, foreclosure forc) {
		forc.addDate(t[1]);
		forc.addCounty(t[2]);
		forc.addLoan(t[10]);
		forc.addName(t[11]);
		forc.addpAddress(t[12]);
		forc.addpCity(t[13]);
		forc.addpState(t[7]);
		forc.addpZip(t[8]);
		forc.addSale_date(t[4]);
		forc.addState(t[14]);
		forc.addType(t[3]);
		forc.addValue(t[9]);
		forc.addZip(t[15]);
	}
	
	public void probates() {
		
	}
	
	public void substitute() {
		
	}
	
	public void affidavit_of_heirship() {
		
	}
}
