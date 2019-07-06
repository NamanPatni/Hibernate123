package test;

import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String [] args ) {
		
		Configuration cfg = new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.buildSessionFactory();
		
	}
	

}
