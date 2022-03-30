package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test1 {

	public static void main(String[] args) {
	
	
				Configuration cfg=new Configuration().configure();
				SessionFactory sf=cfg.buildSessionFactory();
				Session session=sf.openSession();
				session.beginTransaction();
				employee123 e=new employee123();
				e.setEname("Jyoti");
				//e.setAd123(null);
				address123 ad=new address123();
				ad.setPin(12233);
				ad.setLane("Pawar Galli");
				ad.setHouseNo("dd233");
				
				e.setAd123(ad);
				ad.setEmp123(e);
				
				session.persist(e);
				session.getTransaction().commit();
				session.close();
	}

}
