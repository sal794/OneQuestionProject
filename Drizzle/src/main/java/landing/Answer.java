package landing;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Answers")
public class Answer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="answer")
	String answer;
	
	@Column(name="explination")
	String explination;
	
	@Column(name="count")
	int count;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExplination() {
		return explination;
	}

	public void setExplination(String explination) {
		this.explination = explination;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
