package com.ThoughFocus.arrays.practical;

public class MobileDAO extends MobileMethod {
	MobileDTO[] Details = new MobileDTO[3];
	int index = 0;

	@Override
	public void getAll() {
		for (int index = 0; index < Details.length; index++) {
			if (Details[index] != null) {
				System.out.println(Details[index]);
			}
		}

	}

	boolean add(MobileDTO dto) {
		if (dto != null) {
			Details[index] = dto;
			index++;
		}
		return false;
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int index = 0; index < Details.length; index++) {
			if (Details[index] != null) {
				if (brandName.equals(Details[index].getBrandname())) {
					System.out.println(Details[index]);

				}
			}
		}
	}

	public MobileDTO deleteByMobileID(int mobileID) throws CustomException  {
		for (int index = 0; index < Details.length; index++) {
			if (Details[index] != null) {
				if (Details[index].getMobileid() == mobileID) {
					MobileDTO Detail = Details[index];
					Details[index] = null;
					return Detail;
				} 
			}
		}
		CustomException exception = new CustomException();
		throw exception;
	}

	public MobileDTO updateBySerialNumber(int serialNumber, String mobileName) {
		for (int index = 0; index < Details.length; index++) {
			if (Details[index] != null) {
			if (serialNumber == Details[index].getSerialnumber()) {
				Details[index].setBrandname(mobileName);
			}
			}
		}
		return null;
	}
}
