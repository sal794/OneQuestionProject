package landing;


import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Column(name="explanation1")
	String explanation1;
	
	@Column(name="explanation2")
	String explanation2;
	
	@Column(name="explanation3")
	String explanation3;
	
	@Column(name="explanation4")
	String explanation4;
	
	@Column(name="explanation5")
	String explanation5;
	
	@Column(name="explanation6")
	String explanation6;
	
	@Column(name="explanation7")
	String explanation7;
	
	@Column(name="explanation8")
	String explanation8;
	
	@Column(name="explanation9")
	String explanation9;
	
	@Column(name="explanation10")
	String explanation10;
	
	@Column(name="count")
	int count;
	
	public String getExplanation1() {
		return explanation1;
	}

	public void setExplanation1(String explanation1) {
		this.explanation1 = explanation1;
	}

	public String getExplanation2() {
		return explanation2;
	}

	public void setExplanation2(String explanation2) {
		this.explanation2 = explanation2;
	}

	public String getExplanation3() {
		return explanation3;
	}

	public void setExplanation3(String explanation3) {
		this.explanation3 = explanation3;
	}

	public String getExplanation4() {
		return explanation4;
	}

	public void setExplanation4(String explanation4) {
		this.explanation4 = explanation4;
	}

	public String getExplanation5() {
		return explanation5;
	}

	public void setExplanation5(String explanation5) {
		this.explanation5 = explanation5;
	}

	public String getExplanation6() {
		return explanation6;
	}

	public void setExplanation6(String explanation6) {
		this.explanation6 = explanation6;
	}

	public String getExplanation7() {
		return explanation7;
	}

	public void setExplanation7(String explanation7) {
		this.explanation7 = explanation7;
	}

	public String getExplanation8() {
		return explanation8;
	}

	public void setExplanation8(String explanation8) {
		this.explanation8 = explanation8;
	}

	public String getExplanation9() {
		return explanation9;
	}

	public void setExplanation9(String explanation9) {
		this.explanation9 = explanation9;
	}

	public String getExplanation10() {
		return explanation10;
	}

	public void setExplanation10(String explanation10) {
		this.explanation10 = explanation10;
	}


	
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
