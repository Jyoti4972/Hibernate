package com.jbk;

import java.util.LinkedList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load hibernate.cfg.xml 
		Configuration cfg=new Configuration().configure();
		
		//cfg.Configure();
		
		
		//2.Create session factory
		SessionFactory sf=cfg.buildSessionFactory();
		
		//3.create session
		Session session=sf.openSession();
		
		
		//4.Start transaction
		session.beginTransaction();
		
		//Insert Operation
		//Student100 s100=new Student100();
		//s100.setName("Mayank");
		//s100.setContact("233821112118");
		//System.out.println(s100.getId()+" "+s100.getName()+" "+s100.getContact());
		//session.saveOrUpdate(s100);
		
		//Student100 s200=new Student100();
		//s200.setName("daafhk");
		//s200.setContact("33232324");
		//System.out.println(s200.getId()+" "+s200.getName()+" "+s200.getContact());
		//session.saveOrUpdate(s200);
		
		//Student100 s300=new Student100();
		//s300.setName("euusd");
		//s300.setContact("4558585");
		//System.out.println(s300.getId()+" "+s300.getName()+" "+s300.getContact());
		//session.saveOrUpdate(s300);
		
		//Select Operation
		//Student100 s=session.get(Student100.class, new Long(2));
		session.load(Student100.class, new Long(2)); //same as get method but faster it saves record in cache...call the proxy instance from cache)
		//System.out.println(s.getId()+ " " +s.getName()+ " " +s.getContact());
		//session.save(s);
		
		//Delete Operation
		//session.delete(s100);
		//Student100 s=new Student100();
		//s.setId(new Long(2));
		//session.delete(new Long(2));
		
		//session.saveOrUpdate(s); //USE INSTEAD OF ONLY SAVE
		
		
		//Create Criteria
		Criteria criteria = session.createCriteria(Student100.class);
		//java.util.List<Student100> list=criteria.list();
		//for(Student100 ss:list) {
		//	System.out.println(ss.getId()+ " " +ss.getName()+ " " +ss.getContact());
		//}
		
		
		//Restrictions>>
		//criteria.add(Restrictions.gt("id", new Long(3)));
		//java.util.List<Student100> list=criteria.list();
		//for(Student100 ss:list) {
		//	System.out.println(ss.getId()+ " " +ss.getName()+ " " +ss.getContact());
		//}
		
		//criteria.addOrder(Order.asc("name"));
		//java.util.List<Student100> list=criteria.list();
		//	for(Student100 ss:list) {
		//	System.out.println(ss.getId()+ " " +ss.getName()+ " " +ss.getContact());
		//}
		
		//criteria.addOrder(Order.desc("id"));
		//java.util.List<Student100> list=criteria.list();
		//for(Student100 ss:list) {
		//	System.out.println(ss.getId()+ " " +ss.getName()+ " " +ss.getContact());
		//}
				
		//Projections>>
		//criteria.setProjection(Projection.property("name"));
		//java.util.List<Student100> list=criteria.list();
		//for(Student100 ss:list) {
		//System.out.println(ss.getName());
		//}
		
		session.getTransaction().commit();
		session.close();
		
	}
 
}
