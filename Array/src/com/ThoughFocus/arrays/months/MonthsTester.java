package com.ThoughtFocus.months;

public class MonthsTester {
	public static void main(String[] args) {
		Months month = new Months();
		month.save("January");
		month.save("February");
		month.save("March");
		month.save("April");
		month.save("May");
		month.save("June");
		month.save("July");
		month.save("August");
		month.save("September");
		month.save("October");
		month.save("November");
		month.save("December");
		
		month.printall();
		
		String resp = month.delete("January");
		System.out.println(resp);
		month.printall();
		
		month.update("June", "Dune");
		month.printall();
	}

}
