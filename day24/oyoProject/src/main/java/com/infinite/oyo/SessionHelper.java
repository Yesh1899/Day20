package com.infinite.oyo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionHelper {
	public static SessionFactory getConnection() {
		Configuration gfc= new AnnotationConfiguration().configure();
		SessionFactory fs=gfc.buildSessionFactory();
		return fs;
		
	}

}
