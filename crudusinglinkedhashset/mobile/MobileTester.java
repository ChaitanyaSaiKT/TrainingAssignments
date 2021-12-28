package com.thoughtfocus.set.mobile;


public class MobileTester {
	public static void main(String[] args) {
		

	MobileDAO dao = new MobileDAO();
	MobileDTO dto1 = new MobileDTO();
	dto1.setMobileid(12354);
	dto1.setModelname("9r");
	dto1.setPrice(98750);
	dto1.setMemory("256GB");
	dto1.setBrandname("OnePlus");
	dto1.setSerialnumber(98745875);
	dto1.setNoofcameras(2);
	dao.add(dto1);
	
	MobileDTO dto2 = new MobileDTO();
	dto2.setMobileid(16574);
	dto2.setModelname("Note5");
	dto2.setPrice(45000);
	dto2.setMemory("64GB");
	dto2.setBrandname("Xiaomi");
	dto2.setSerialnumber(98749875);
	dto2.setNoofcameras(1);
	dao.add(dto2);
	
	MobileDTO dto3 = new MobileDTO();
	dto3.setMobileid(45784);
	dto3.setModelname("f19");
	dto3.setPrice(54900);
	dto3.setMemory("128GB");
	dto3.setBrandname("Oppo");
	dto3.setSerialnumber(98987875);
	dto3.setNoofcameras(3);
	dao.add(dto3);
	
	MobileDTO dto4 = new MobileDTO();
	dto4.setMobileid(98754);
	dto4.setModelname("r55");
	dto4.setPrice(25750);
	dto4.setMemory("32GB");
	dto4.setBrandname("Realme");
	dto4.setSerialnumber(98749874);
	dto4.setNoofcameras(1);
	dao.add(dto4);
	
	dao.getAll();
	dao.getAllByBrandName("Realme");
	dao.getPriceByModelName("Note5");
	dao.updateBySerialNumber(98749874, 30000);
	dao.updateBrandNameandModelName("Oppo", "f19", "Opporeno", "f20");
	try {
		dao.deleteByMobileID(1235); 
	}
	catch(CustomException delete){
		System.out.println(delete.getMessage());		
	}
	dao.getAll();
}
}