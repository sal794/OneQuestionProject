package landing;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnswerManager {

	public void addAnswer(String answer, String explination){
		
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Answer a = new Answer();
		a.setAnswer(answer);
		a.setExplination(explination);
		a.setCount(a.getCount() + 1);
		session.save(a);
		tx.commit();
		session.close();
		
	}
	
	public boolean checkAnswer(String answer){
		boolean exists = false;
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		List answers = session.createQuery("FROM Answer").list();
		for (Iterator iterator = answers.iterator(); iterator.hasNext();){
			Answer ans = (Answer) iterator.next();
			if (ans.getAnswer().equals(answer)){
				ans.setCount(ans.getCount() + 1);
				exists = true;
			} else{
				exists = false;
			}
		}
		session.close();
		return exists;
	}
		
}
