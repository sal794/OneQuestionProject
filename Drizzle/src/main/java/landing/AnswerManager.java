package landing;

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
	
}
