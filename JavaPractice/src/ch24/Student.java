package ch24;

import java.util.ArrayList;

public class Student {
	
	private int no;
	private String name;
	ArrayList<Subject> subject = new ArrayList<Subject>();
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	

	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void addSubject(String name, int score) {
		subject.add(new Subject(name, score));
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject result : subject) {
			total += result.getScore();
			System.out.println("학생 " + name + "의 " + result.getSubject() + " 과목 성적은 " + result.getScore() + "입니다.");	
		}
		System.out.println("학생 " + name + "의 총점은 "  + total + "입니다.");
	}
	
	
	
	

}
