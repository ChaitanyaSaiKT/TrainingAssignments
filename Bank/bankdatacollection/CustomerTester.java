package com.thoughtfocus.bankdatacollection;

public class CustomerTester {
	public static void main(String[] args) {

		CustomerDetailsDAO dao = new CustomerDetailsDAO();
		CustomerDataDTO dto = new CustomerDataDTO();
		dto.setName("Ravi");
		dto.setContactnumber(985874556);
		dto.setEmailid("ravi@gmail.com");
		dto.setAccountnumber(1862856682);
		dto.setIfsccode("IB7688");
		dto.setBalance(500000);
		AddressDTO adto = new AddressDTO();
		adto.setBuilding("56745");
		adto.setArea("GandhiRoad");
		adto.setLandmark("opposite Ricemill");
		adto.setCity("Bangalore");
		adto.setState("Karnataka");
		adto.setCountry("India");
		adto.setPincode(256847);
		dto.setAddress(adto);
		dao.save(dto);

		CustomerDataDTO dto2 = new CustomerDataDTO();
		dto2.setName("Mani");
		dto2.setContactnumber(985895556);
		dto2.setEmailid("mani@gmail.com");
		dto2.setAccountnumber(1896456682);
		dto2.setIfsccode("PO7978");
		dto2.setBalance(980000);
		AddressDTO adto2 = new AddressDTO();
		adto2.setBuilding("56987");
		adto2.setArea("GandhiRoad");
		adto2.setLandmark("opposite SBI");
		adto2.setCity("Bangalore");
		adto2.setState("Karnataka");
		adto2.setCountry("India");
		adto2.setPincode(256987);
		dto2.setAddress(adto2);
		dao.save(dto2);

		CustomerDataDTO data2 = dao.getByName("Mani");
		System.out.println(data2);

		CustomerDataDTO data3 = dao.updateByName("Ravi", 55578555);
		System.out.println(data3);
		CustomerDataDTO data4 = dao.getByName("Ravi");
		System.out.println(data4);
		CustomerDataDTO data5 = dao.getCurrentBalance(1862856682);
		System.out.println(data5);
		float data6 = dao.withdraw(500, 1862856682);
		System.out.println(data6);
		float data7 = dao.deposit(10000, 1862856682);
		System.out.println(data7);
		CustomerDataDTO data8 = dao.removeByName("Ravi");
		System.out.println(data8);
	}

}
