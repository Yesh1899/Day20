package com.infinite.exam;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AgentSearchMain {
	public static void main(String[] args) {
		int agentId;
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AgentId : ");
		agentId = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent where AgentId="+agentId);
		List<Agent> agentlist = query.list();
		if(agentlist.size()==1){
			System.out.println(agentlist.get(0));
		}
		else{
			System.out.println("no record is found");
		}
	}
}
