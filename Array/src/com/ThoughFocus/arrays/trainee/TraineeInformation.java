package com.ThoughFocus.arrays.trainee;

public class TraineeInformation {
	
	private int id;
	private String name;
	private long number;
	private String place;
	
	public TraineeInformation(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "TraineeInformation [id=" + id + ", name=" + name + ", number=" + number + ", place=" + place + "]";
	}
	

}
