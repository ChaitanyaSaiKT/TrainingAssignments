package com.ThoughFocus.arrays.practical;

public class MobileDAO implements MobileMethods{
	MobileDTO[] Details=new MobileDTO[3];
	int index=0;

	boolean add(MobileDTO dto) {
		if(dto!=null) {
			Details[index]=dto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public void getAll() {
		for(int index=0;index<Details.length;index++) {
			if(Details[index]!=null) {
				System.out.println(Details[index]);
			}
		}
		
	}

	@Override
	public void getAllByBrandName(String brandName) throws MobileCustomException {	 
			for(int index=0;index<Details.length;index++) {
				if(Details[index]!=null) {
				if(brandName.equals(Details[index].getBrandname())) {
					System.out.println(Details[index]);
				}
				else {
					MobileCustomException customexception = new MobileCustomException();
					throw customexception;
				}
			}
			}		
	}
	public MobileDTO deleteByMobileID( int mobileID) {
		MobileDTO Detail=null;
		for(int index=0;index<Details.length;index++) {
			if(Details[index] != null) {
			if(mobileID==Details[index].getMobileid()) {
				Detail = Details[index];
				Details[index]=null;
				return Detail;
			}
		}
	}
		return Detail;
	}

	MobileDTO updateBySerialNumber ( int serialNumber,String mobileName ) {
		for(int index=0;index<Details.length;index++) {
			if(serialNumber==Details[index].getSerialnumber()) {
				Details[index].setBrandname(mobileName);;
			}
		}return null;
	}    

	}
