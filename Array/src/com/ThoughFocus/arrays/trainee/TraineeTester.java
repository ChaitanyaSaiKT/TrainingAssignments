package com.ThoughFocus.arrays.trainee;

public class TraineeTester {
	public static void main(String[] args) {
		
		TraineeInformation info = new TraineeInformation();
		info.setId(1520);
		info.setName("Ravi");
		info.setNumber(958465826);
		info.setPlace("Chennai");
		TraineeInformation info2 = new TraineeInformation();
		info2.setId(1521);
		info2.setName("Mani");
		info2.setNumber(958475827);
		info2.setPlace("Bangalore");
		TraineeInformation info3 = new TraineeInformation();
		info3.setId(1522);
		info3.setName("Tony");
		info3.setNumber(987564355);
		info3.setPlace("Hyderabad");
		
		TraineeDAO operation = new TraineeDAO();
		operation.save(info);
		operation.save(info2);
		operation.save(info3);
		operation.printall();
		
		String resp = operation.deletebyname("Mani");
		System.out.println(resp);
		operation.printall();
		
		operation.updatebyname("Ravi", "Peter");
		operation.printall();
		
		operation.nameandPhonenoUpdatebyId(1520,"Sunny",988536540); 
		operation.printall();
		
		operation.phonenoUpdateUsingNameandId(988888887,"Sunny", 1520);
		operation.printall();
	}

}
