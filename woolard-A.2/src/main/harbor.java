package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import resources.foreclosure;

public class harbor extends masterfile{
	//foreclosure forc = new foreclosure();
	File doc = new File("foreclosure.csv");
	foreclosure forc = new foreclosure();
	
	public harbor(int type) {
		//int x=5;//switches for making type object, counting, running aprop. class
		switch(type) {
		case 1:			
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
	public foreclosure readForeclosure() {
		try 
		{
			Scanner scan = new Scanner( doc );
			String line = scan.nextLine();
			String[] t;
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				t = line.split(",");
				
				forc.addDate(t[0]);
				forc.addCounty(t[1]);
				forc.addType(t[2]);
				forc.addSale_date(t[3]);
				forc.addpAddress(t[4]);
				forc.addpCity(t[5]);
				forc.addpState(t[6]);
				forc.addpZip(t[7]);
			//	System.out.println(t[8].length());
				if (t[8].length() == 2) {
					//System.out.println(t[10]);
					forc.addValue(t[8]+","+t[9]+","+t[10]);
					forc.addLoan(t[11]);
					forc.addName(t[12]);				
					forc.addAddress(t[13]);
					forc.addCity(t[14]);
					forc.addState(t[15]);
					forc.addZip(t[16]);
				}
				else {
					forc.addValue(t[8]+","+t[9]);
					forc.addLoan(t[10]);
					forc.addName(t[11]);				
					forc.addAddress(t[12]);
					forc.addCity(t[13]);
					forc.addState(t[14]);
					forc.addZip(t[15]);
				}
			}
			scan.close();			
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}catch(@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}
		return forc;
	}
	
	public void probates() {
		
	}
	public void substitute() {
		
	}
	public void affidavit_of_heirship() {
		
	}
	public masterfile masterBuilder() throws FileNotFoundException {
		
		masterfile master = new masterfile();
		PrintWriter pw = new PrintWriter(new File("masterfile.csv"));
		StringBuilder list1 = new StringBuilder();
		StringBuilder list2 = new StringBuilder();
		
		list1.append("Property Address, Owner Addres, Name, File\nList One\n");
		for (int i=0; i < forc.getpAddressLength(); i++) {
			//System.out.println(forc.getpAddress(i));
			list1.append(forc.getpAddress(i)+", ,");
			list1.append(forc.getName(i)+"\n");
		}
		
		list2.append("List 2, \n");
		for (int i=0; i < forc.getpAddressLength(); i++) {
			//System.out.print(forc.getpAddress(i));
			//System.out.println(forc.getAddress(i));
			if (!forc.getpAddress(i).equals(forc.getAddress(i))) {
				list2.append(forc.getpAddress(i)+",");
				list2.append(forc.getAddress(i)+",");
				list2.append(forc.getName(i)+"\n");
			}
		}
		
		//System.out.println(list1);
		
		pw.append(list1+"\n");
		pw.append(list2);
		//pw.append("Adasdasd");
		pw.close();
		
		return master;
				
	}
}
