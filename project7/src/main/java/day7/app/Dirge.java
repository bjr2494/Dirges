package day7.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dirge {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String content;
	private String timeSignature;
	private int degreeOfSolemnity;
	private boolean elicitsEmotionalResponse;
	
	Dirge() {}

	public Dirge(String name, String content, String timeSignature, int degreeOfSolemnity,
			boolean elicitsEmotionalResponse) {
		this.name = name;
		this.content = content;
		this.degreeOfSolemnity = degreeOfSolemnity;
		this.timeSignature = timeSignature;
		this.elicitsEmotionalResponse = elicitsEmotionalResponse;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDegreeOfSolemnity() {
		return degreeOfSolemnity;
	}

	public void setDegreeOfSolemnity(int degreeOfSolemnity) {
		this.degreeOfSolemnity = degreeOfSolemnity;
	}

	public String getTimeSignature() {
		return timeSignature;
	}

	public void setTimeSignature(String timeSignature) {
		this.timeSignature = timeSignature;
	}

	public boolean isElicitsEmotionalResponse() {
		return elicitsEmotionalResponse;
	}

	public void setElicitsEmotionalResponse(boolean elicitsEmotionalResponse) {
		this.elicitsEmotionalResponse = elicitsEmotionalResponse;
	}

	@Override
	public String toString() {
		return "Dirge [id=" + id + ", name=" + name + ", content=" + content + ", degreeOfSolemnity="
				+ degreeOfSolemnity + ", timeSignature=" + timeSignature + ", elicitsEmotionalResponse="
				+ elicitsEmotionalResponse + "]";
	}
}
