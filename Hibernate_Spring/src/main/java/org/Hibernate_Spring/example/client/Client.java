package org.Hibernate_Spring.example.client;

import org.Hibernate_Spring.example.beans.Country;
import org.Hibernate_Spring.example.database.CountryDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
	public static void main(String[] args)
	{
        
		ApplicationContext ap=
		new ClassPathXmlApplicationContext("org/Hibernate_Spring/"
				+ "example/configs/applicationContext.xml");
        CountryDAO cdao=(CountryDAO) ap.getBean("co");
        
        Country c1=new Country(101,"India",12123125421l,"New Delhi");
        cdao.addCountry(c1);
        System.out.println("added successfully");
        
        
	}
}
