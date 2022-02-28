package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File("C:\\Users\\Eswar\\Desktop\\eclipse\\Adactin\\src\\Configuration\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String get_card_Num()

	{
		String card_num = p.getProperty("card_num");

		return card_num;

	}

	public String get_Cvv()

	{
		String cvv = p.getProperty("cvv");

		return cvv;

	}

	public String get_ac_Num1() 
	{
		String ac_num = p.getProperty("ac_num");

		return ac_num;

	}

}
