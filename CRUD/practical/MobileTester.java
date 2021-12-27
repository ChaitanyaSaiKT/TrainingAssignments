package com.ThoughFocus.arrays.practical;

public class MobileTester {
	public static void main(String[] args) {
		
		MobileDAO detail=new MobileDAO();
		MobileDTO specifications = new MobileDTO();
		specifications.setMobileid(1234);
		specifications.setModelname("Fire");
		specifications.setPrice(50000);
		specifications.setMemory("1TB");
		specifications.setBrandname("LYF");
		specifications.setSerialnumber(658648);
		specifications.setNoofcameras(1);
		detail.add(specifications);
		
		MobileDTO specifications2 = new MobileDTO();
		specifications2.setMobileid(1324);
		specifications2.setModelname("Blaze");
		specifications2.setPrice(790000);
		specifications2.setMemory("512Gb");
		specifications2.setBrandname("HTC");
		specifications2.setSerialnumber(985467);
		specifications2.setNoofcameras(3);
		detail.add(specifications2);
		
		MobileDTO specifications3 = new MobileDTO();
		specifications3.setMobileid(1985);
		specifications3.setModelname("Jewel");
		specifications3.setPrice(45500);
		specifications3.setMemory("128GB");
		specifications3.setBrandname("Vivo");
		specifications3.setSerialnumber(87756);
		specifications3.setNoofcameras(2);
		detail.add(specifications3);
		
		detail.getAll();
		
		try {
			detail.deleteByMobileID(1234); 
		}
		catch(CustomException delete){
			System.out.println(delete.getMessage());		
		}
		
		detail.updateBySerialNumber(87756, "Lenovo");
		
		detail.getAll();
		
		
	}
		
}

