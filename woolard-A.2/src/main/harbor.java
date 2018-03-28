package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import resources.foreclosure;
import resources.heirship;
import resources.probates;
import resources.substitute;

@SuppressWarnings("unused")
public class harbor extends masterfile{
	File Forcelosure = new File("foreclosure.csv");
	File Probate = new File("probates.csv");
	File Substitute = new File("substitute trustee.csv");
	File Heirship = new File("affidavit of heirship.csv");
	
	public harbor( ) {

	}
	//void temp
	//t for tokens
	public foreclosure readForeclosure() {
		foreclosure forc = new foreclosure();
		try 
		{
			Scanner scan = new Scanner( Forcelosure );
			String line = scan.nextLine();
			String[] t;
			String value;
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				value = line.split("\"")[1];
				t = line.split(",");
				
				forc.addDate(t[0]);
				forc.addCounty(t[1]);
				forc.addType(t[2]);
				forc.addSale_date(t[3]);
				forc.addpAddress(t[4]);
				forc.addpCity(t[5]);
				forc.addpState(t[6]);
				forc.addpZip(t[7]);
				forc.addValue(value);
				if (t[8].length() == 2) {
					forc.addLoan(t[11]);
					forc.addName(t[12]);				
					forc.addAddress(t[13]);
					forc.addCity(t[14]);
					forc.addState(t[15]);
					forc.addZip(t[16]);
				}
				else {
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
	
	public probates readProbates() {
		probates prob = new probates();
		try 
		{
			Scanner scan = new Scanner( Probate );
			String line = scan.nextLine();
			String[] t;
			String value;
			
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				t = line.split(",");
				value = line.split("\"")[1];
				//System.out.println(t[0]);
				
				prob.addDate(t[0]);
				prob.addCounty(t[1]);
				prob.addType(t[2]);
				prob.addDecedent(t[3]);
				prob.addpAddress(t[4]);
				prob.addpCity(t[5]);
				prob.addpState(t[6]);
				prob.addValue(value);
				if (t[8].length() == 2) {
					prob.addName(t[11]);
					prob.addAddress(t[12]);
					prob.addState(t[13]);
					prob.addZip(t[14]);
				}
				else {
					prob.addName(t[10]);
					prob.addAddress(t[11]);
					prob.addState(t[12]);
					prob.addZip(t[13]);
				}
				prob.addDate(t[9]);
				
			}scan.close();		
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}catch(@SuppressWarnings("hiding") IOException e) {
			e.printStackTrace();
		}
		return prob;
		
	}
	
	public substitute readSubstitute() {
		substitute sub = new substitute();
		try 
		{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner( Substitute );
			String line = scan.nextLine();
			String[] t;
			String value, loan;
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				value = line.split("\"")[1];
				try {
					loan = line.split("\"")[3];
				}catch(java.lang.ArrayIndexOutOfBoundsException e1) {
					loan = "-";
				}
				sub.addLoan(loan);
				t = line.split(",");
				
				sub.addDate(t[0]);
				sub.addCounty(t[1]);
				sub.addType(t[2]);
				sub.addpAddress(t[3]);
				sub.addpCity(t[4]);
				sub.addpState(t[5]);
				sub.addpZip(t[6]);
				sub.addValue(value);
				if (t[7].length() == 2) {
					//System.out.println(t[12]);
					//sub.addValue(value);
					sub.addName(t[12]);
					sub.addAddress(t[13]);
					sub.addCity(t[14]);
					sub.addState(t[15]);
					sub.addZip(t[16]);
					
					
				}
				else {
					sub.addName(t[11]);
					sub.addAddress(t[12]);
					sub.addState(t[13]);
					sub.addZip(t[14]);
				}
				//sub.addLoan(loan);
				//System.out.println(t[11]);
				
			}
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}
		return sub;
		
	}
	
	public heirship readHeirship() {
		heirship heir = new heirship();
		try 
		{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner( Heirship );
			String line = scan.nextLine();
			String[] t;
			String value, loan;
			while( scan.hasNextLine()) 
			{
				line = scan.nextLine();
				value = line.split("\"")[1];
				/*try {
					loan = line.split("\"")[3];
				}catch(java.lang.ArrayIndexOutOfBoundsException e1) {
					loan = "-";
				}
				//heir.addLoan(loan);*/
				t = line.split(",");
				System.out.println(t[7]);
				heir.addDate(t[0]);
				heir.addCounty(t[1]);
				heir.addDecedent(t[2]);
				heir.addpAddress(t[3]);
				heir.addpCity(t[4]);
				heir.addpZip(t[6]);
				heir.addValue(value);
				if (t[7].length() == 2) {
					//System.out.println(t[12]);
					//heir.addValue(value);
					heir.addName(t[10]);
					heir.addAddress(t[11]);
					heir.addCity(t[12]);
					heir.addState(t[13]);
					heir.addZip(t[14]);
					
					
				}
				else {
					heir.addName(t[9]);
					heir.addAddress(t[10]);
					heir.addCity(t[11]);
					heir.addState(t[12]);
					heir.addZip(t[13]);
				}
			}
		}catch(FileNotFoundException e1) 
		{
			System.out.println("fnf");
		}
		
		return heir;
	}
	
	//public StringBuilder masterBuilder() {
		
		/*
		//masterfile master = new masterfile();
		PrintWriter pw = new PrintWriter(new File("masterfile.csv"));
		StringBuilder list1 = new StringBuilder();
		StringBuilder list2 = new StringBuilder();
		
		list1.append("Property Address, Owner Addres, Name, File\nList One\n");
		for (int i=0; i < prob.getpAddressLength(); i++) {
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
		*/
		//return list1;
				
	//}
}
