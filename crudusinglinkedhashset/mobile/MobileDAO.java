package com.thoughtfocus.set.mobile;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MobileDAO extends MobileExtraMethods {

	private LinkedHashSet<MobileDTO> dtos = new LinkedHashSet<MobileDTO>();

	boolean add(MobileDTO dto) {
		if (dto != null) {
			dtos.add(dto);
		}
		return false;
	}

	@Override
	void getAll() {
		if (dtos != null) {
			Iterator<MobileDTO> itr = dtos.iterator();
			while (itr.hasNext()) {
				MobileDTO mobile = (MobileDTO) itr.next();
				System.out.println(mobile);
			}
		}
	}

	@Override
	void getAllByBrandName(String brandname) {
		Iterator<MobileDTO> itr = dtos.iterator();
		while (itr.hasNext()) {
			MobileDTO mobile = (MobileDTO) itr.next();
			if (mobile.getBrandname().equals(brandname)) {
				System.out.println(mobile);
			}
		}
	}

	@Override
	void getPriceByModelName(String modelname) {
		Iterator<MobileDTO> itr = dtos.iterator();
		while (itr.hasNext()) {
			MobileDTO mobile = (MobileDTO) itr.next();
			if (mobile.getModelname().equals(modelname)) {
				System.out.println(mobile.getPrice());
			}

		}

	}

	MobileDTO deleteByMobileID(int mobileid) throws CustomException {
		Iterator<MobileDTO> itr = dtos.iterator();
		while (itr.hasNext()) {
			MobileDTO mobile = (MobileDTO) itr.next();
			if (mobile.getMobileid() == mobileid) {
				dtos.remove(mobile);
				return null;
			}
		}
		CustomException delete = new CustomException();
		throw delete;
	}

	MobileDTO updateBySerialNumber(int serialnumber, long price) {
		Iterator<MobileDTO> itr = dtos.iterator();
		while (itr.hasNext()) {
			MobileDTO mobile = (MobileDTO) itr.next();
			if (mobile.getSerialnumber() == serialnumber) {
				mobile.setPrice(price);

			}
		}
		return null;
	}

	MobileDTO updateBrandNameandModelName(String oldbrandname, String oldmodelname, String newbrandname,
			String newmodelname) {
		Iterator<MobileDTO> itr = dtos.iterator();
		while (itr.hasNext()) {
			MobileDTO mobile = (MobileDTO) itr.next();
			if (mobile.getBrandname().equals(oldbrandname)) {
				if (mobile.getModelname().equals(oldmodelname)) {
					mobile.setBrandname(newbrandname);
					mobile.setModelname(newmodelname);
				}
			}
		}
		return null;
	}
}
