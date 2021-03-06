package io.github.anantharajuc;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String> SoftwareCompanies = new Hashtable<Integer,String>();
		
		SoftwareCompanies.put(1975, "Microsoft");
		SoftwareCompanies.put(1977, "Oracle");
		SoftwareCompanies.put(1972, "SAP");
		
		System.out.println("Values before remove: "+ SoftwareCompanies);  
		
		SoftwareCompanies.remove(1977);
		
		System.out.println("Values after remove: "+ SoftwareCompanies);  
		
		for(Map.Entry m: SoftwareCompanies.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
