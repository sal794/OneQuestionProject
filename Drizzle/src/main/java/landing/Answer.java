package landing;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANSWER")
public class Answer{
	
	@Id 
	@Column(name="id")
	int id;

	@Column(name="answer", unique = false)
	String answer;
	
	@Column(name="explination")
	String explination;
	
	@Column(name="count")
	int count;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
