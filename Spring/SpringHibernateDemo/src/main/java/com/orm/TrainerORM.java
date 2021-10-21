package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Trainer;


@Repository
public class TrainerORM {

	@Autowired
	SessionFactory sf;
	
	public boolean storeTrainerInfo(Trainer trainer ) {
		try {
			Session session =sf.openSession();
			
			Transaction tran=session.getTransaction();
			tran.begin();
			  session.save(trainer);
			  
			tran.commit();
			return true;
			  
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			
			// TODO: handle exception
		}
	}
}
