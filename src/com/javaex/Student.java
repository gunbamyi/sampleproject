package com.javaex;

class Student {
	
	private String stunentId;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	public String getStunentId() {
		return stunentId;
	}
	public void setStunentId(String stunentId) {
		this.stunentId = stunentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public double getStudentCredit() {
		return studentCredit;
	}
	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	
	public Student  (String studentId, String studentName, String studentGender, double studentCredit)  {
	    this.stunentId = stunentId;
	    this.studentName = studentName;
	    this.studentGender = studentGender;
	    this.studentCredit = studentCredit;
	}   
	    
	public void  show()  {
		System.out.println("�й� : "+ getStunentId());
		System.out.println("�̸� : "+ getStudentName());
		System.out.println("���� : "+ getStudentGender());
		System.out.println("���� : "+ getStudentCredit());
	}
}
