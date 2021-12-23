package com.ThoughtFocus.months;

public class Months {
	private String[] months = new String[12];
	private int index = 0;

	public void printall() {
		for (int index = 0; index < months.length; index++) {
			if (months[index] != null) {
				System.out.println(months[index]);
			}
		}

	}
	public boolean save(String month) {
		if(index<12) {
			months[index]=month;
			index++;
			return true;
		}
		else {
			System.out.println("Can enter only 12 Months");
			return false;
		}
	}
	public String delete(String month) {
		for(int index=0; index<months.length; index++) {
			if(months[index].equals(month)) {
				months[index] = null;
				return "month deleted";
			}
		}
		
		return "month not deleted";
	}
}