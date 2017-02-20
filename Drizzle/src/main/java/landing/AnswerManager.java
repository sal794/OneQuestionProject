package landing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnswerManager {

	public boolean shortAnswer(String answer) {
		if (answer.length() > 25) {
			return false;
		}
		return true;
	}

	public boolean shortExplanation(String explanation) {
		if (explanation.length() > 144) {
			return false;
		}
		return true;
	}

	public void addAnswer(String answer, String explanation) {

		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Answer a = new Answer();
		a.setAnswer(answer.toLowerCase());
		a.setExplanation1(explanation);
		a.setCount(1);
		session.save(a);
		tx.commit();
		session.close();
	}

	public boolean checkAnswer(String answer, String explanation) {
		boolean exists = false;
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		List answers = session.createQuery("FROM Answer").list();
		for (Iterator iterator = answers.iterator(); iterator.hasNext();) {
			Answer ans = (Answer) iterator.next();
			if (ans.getAnswer().equals(answer.toLowerCase())) {
				ans.setCount(ans.getCount() + 1);
				ans.setExplanation10(ans.getExplanation9());
				ans.setExplanation9(ans.getExplanation8());
				ans.setExplanation8(ans.getExplanation7());
				ans.setExplanation7(ans.getExplanation6());
				ans.setExplanation6(ans.getExplanation5());
				ans.setExplanation5(ans.getExplanation4());
				ans.setExplanation4(ans.getExplanation3());
				ans.setExplanation3(ans.getExplanation2());
				ans.setExplanation2(ans.getExplanation1());
				ans.setExplanation1(explanation);
				session.save(ans);
				exists = true;
			} else {
				exists = false;
			}
		}
		tx.commit();
		session.close();
		return exists;
	}

	public Answer currentAns(String answer) {
		Session session = HibernateUtil.buildSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		List answers = session.createQuery("FROM Answer").list();
		for (Iterator iterator = answers.iterator(); iterator.hasNext();) {
			Answer ans = (Answer) iterator.next();
			if (ans.getAnswer().equals(answer.toLowerCase())) {
				return ans;
			}
		}
		tx.commit();
		session.close();
		return null;
	}

	// public List expList(String answer) {
	// List<String> expList = new ArrayList<>();
	// Session session = HibernateUtil.buildSessionFactory().openSession();
	// Transaction tx = null;
	// tx = session.beginTransaction();
	// List answers = session.createQuery("FROM Answer").list();
	// for (Iterator iterator = answers.iterator(); iterator.hasNext();) {
	// Answer ans = (Answer) iterator.next();
	// if (ans.getAnswer().equals(answer.toLowerCase())) {
	// expList.add(ans.getexplanation1());
	// expList.add(ans.getexplanation2());
	// expList.add(ans.getexplanation3());
	// expList.add(ans.getexplanation4());
	// expList.add(ans.getexplanation5());
	// expList.add(ans.getexplanation6());
	// expList.add(ans.getexplanation7());
	// expList.add(ans.getexplanation8());
	// expList.add(ans.getexplanation9());
	// expList.add(ans.getexplanation10());
	// }
	// }
	// tx.commit();
	// session.close();
	// return expList;
	// }

}
