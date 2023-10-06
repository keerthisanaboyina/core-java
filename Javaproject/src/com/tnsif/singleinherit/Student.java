package com.tnsif.singleinherit;


public class Student extends Citizen{
    private int rollno;
    public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getCollegename() {
		return collegename;
	}



	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}



	private String collegename;
   //default constructor 
	public Student() {
		super();
	}
	
	 
	
	public Student(int rollno, String collegename) {
		super();
			this.rollno = rollno;
		this.collegename = collegename;
		}


	public Student(String name, int aadharno, String address, int phno) {
		super(name, aadharno, address, phno);
		this.rollno = rollno;
				this.collegename = collegename;
		// TODO Auto-generated constructor stub
	}



	
}