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
		a.setAnswer(answer.toLowerCase());
		a.setExplination1(explination);
		a.setCount(1);
		session.save(a);
		tx.commit();
		session.close();
		
	}
	
	public boolean checkAnswer(String answer, String explination){
		boolean exists = false;
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		List answers = session.createQuery("FROM Answer").list();
		for (Iterator iterator = answers.iterator(); iterator.hasNext();){
			Answer ans = (Answer) iterator.next();
			if (ans.getAnswer().equals(answer.toLowerCase())){
				ans.setCount(ans.getCount() + 1);
				ans.setExplination10(ans.getExplination9());
				ans.setExplination9(ans.getExplination8());
				ans.setExplination8(ans.getExplination7());
				ans.setExplination7(ans.getExplination6());
				ans.setExplination6(ans.getExplination5());
				ans.setExplination5(ans.getExplination4());
				ans.setExplination4(ans.getExplination3());
				ans.setExplination3(ans.getExplination2());
				ans.setExplination2(ans.getExplination1());
				ans.setExplination1(explination);
				session.save(ans);
				exists = true;
			} else{
				exists = false;
			}
		}
		tx.commit();
		session.close();
		return exists;
	}
		
}
