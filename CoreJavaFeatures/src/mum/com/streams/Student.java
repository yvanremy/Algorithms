package mum.com.streams;

public class Student {
	
	private int id;
	private String names;
	private double grade;
	private String decision;
	
	public Student() {
		
	}
	
	public Student(int id, String names, double grade, String decision) {
		super();
		this.id = id;
		this.names = names;
		this.grade = grade;
		this.decision = decision;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	
	

}
