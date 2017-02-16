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
	
	@Column(name="explination1")
	String explination1;
	
	@Column(name="explination2")
	String explination2;
	
	@Column(name="explination3")
	String explination3;
	
	@Column(name="explination4")
	String explination4;
	
	@Column(name="explination5")
	String explination5;
	
	@Column(name="explination6")
	String explination6;
	
	@Column(name="explination7")
	String explination7;
	
	@Column(name="explination8")
	String explination8;
	
	@Column(name="explination9")
	String explination9;
	
	@Column(name="explination10")
	String explination10;
	
	@Column(name="count")
	int count;
	
	public String getExplination1() {
		return explination1;
	}

	public void setExplination1(String explination1) {
		this.explination1 = explination1;
	}

	public String getExplination2() {
		return explination2;
	}

	public void setExplination2(String explination2) {
		this.explination2 = explination2;
	}

	public String getExplination3() {
		return explination3;
	}

	public void setExplination3(String explination3) {
		this.explination3 = explination3;
	}

	public String getExplination4() {
		return explination4;
	}

	public void setExplination4(String explination4) {
		this.explination4 = explination4;
	}

	public String getExplination5() {
		return explination5;
	}

	public void setExplination5(String explination5) {
		this.explination5 = explination5;
	}

	public String getExplination6() {
		return explination6;
	}

	public void setExplination6(String explination6) {
		this.explination6 = explination6;
	}

	public String getExplination7() {
		return explination7;
	}

	public void setExplination7(String explination7) {
		this.explination7 = explination7;
	}

	public String getExplination8() {
		return explination8;
	}

	public void setExplination8(String explination8) {
		this.explination8 = explination8;
	}

	public String getExplination9() {
		return explination9;
	}

	public void setExplination9(String explination9) {
		this.explination9 = explination9;
	}

	public String getExplination10() {
		return explination10;
	}

	public void setExplination10(String explination10) {
		this.explination10 = explination10;
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
