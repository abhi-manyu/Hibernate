package org.Hibernate_Spring.example.database;

import java.util.ArrayList;
import java.util.List;

import org.Hibernate_Spring.example.beans.Country;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class CountryDAO
{
   private HibernateTemplate template;
   public void setTemplate(HibernateTemplate template) {
	this.template = template;
   }
   public HibernateTemplate getTemplate() {
	return template;
}
   public void addCountry(Country country)
   {
	   template.save(country);
   }
   public void updateCountry(Country country)
   {
	   template.update(country);
   }
   public void deleteCountry(Country country)
   {
	   template.delete(country);
   }
   public Country getCountry(int id)
   {
	   return (Country)template.get(Country.class,id);
   }
   public List<Country> getAllCountry()
   {
	   List<Country> list=new ArrayList<Country>();
	   list=template.loadAll(Country.class);
	   return list;
   }
}
