package com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	
	public Student(){
		
	}
	private int id;
	private String stud;
	private String mark;
	public Student(int id, String stud,String mark) {
		super();
		this.setId(id);
		this.setStud(stud);
		this.setMark(mark);
	}
	public String getStud() {
		return stud;
	}
	public void setStud(String stud) {
		this.stud = stud;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stud=" + stud + ", mark=" + mark + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
}
