

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class harbor extends masterfile{
	//foreclosure forc = new foreclosure();
	
	public harbor(int type) {
		//int x=5;//switches for making type object, counting, running aprop. class
		switch(type) {
		case 1:
			//System.out.println("dsadas");
			readForeclosure();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	//void temp
	//t for tokens
	public void readForeclosure() {
		foreclosure forc = new foreclosure();
		File doc = new File("foreclosure.csv");
		try 
		{
			Scanner scan = new Scanner( doc );
			String line = scan.nextLine();
			String[] t;
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				t = line.split(",");
				/*date[len] = tokens[len];
				for (int i=0; i<=15; i++) {
					System.out.println(t[i]);
				}*/
				
				forc.addDate(t[0]);
				forc.addCounty(t[1]);
				forc.addType(t[2]);
				forc.addSale_date(t[3]);
				forc.addpAddress(t[4]);
				forc.addpCity(t[5]);
				forc.addpState(t[6]);
				forc.addpZip(t[7]);
				forc.addValue(t[8]+","+t[9]);
				forc.addLoan(t[10]);
				forc.addName(t[11]);				
				forc.addAddress(t[12]);
				forc.addCity(t[13]);
				forc.addState(t[14]);
				forc.addZip(t[15]);
				//System.out.println("dasda");
			}
			scan.close();			
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}catch(@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}

	}
	
	public void probates() {
		
	}
	
	public void substitute() {
		
	}
	
	public void affidavit_of_heirship() {
		
	}
}
