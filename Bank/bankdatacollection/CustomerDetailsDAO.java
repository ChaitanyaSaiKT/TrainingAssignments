package com.thoughtfocus.bankdatacollection;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetailsDAO {

	private List<CustomerDataDTO> dtos = new ArrayList<CustomerDataDTO>();

	public String save(CustomerDataDTO dto) {
		boolean isSaved = dtos.add(dto);
		if (isSaved) {
			return "Data Saved";
		} else {
			return "Data not Saved";
		}
	}

	public CustomerDataDTO getByName(String name) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().equals(name)) {
				return dtos.get(i);
			}

		}
		return null;
	}

	public CustomerDataDTO updatePincodeByArea(String area, int pincode) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAddress().getArea().equals(area)) {
				dtos.get(i).getAddress().setPincode(pincode);
			}

		}
		return null;
	}
	
	public CustomerDataDTO getCurrentBalance(long accountnumber) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountnumber()==accountnumber) {
				dtos.get(i).getBalance();
				CustomerDataDTO balance = dtos.get(i);
				return balance;
			}

		}
		return null;
	}
	
	public float deposit(float amount, long accountnumber) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountnumber() == accountnumber) {
				float Balance = dtos.get(i).getBalance();
				float updatedBalance = Balance + amount;
				dtos.get(i).setBalance(updatedBalance);
				return updatedBalance;
			}
		}
		return amount;
	}
	
	public float withdraw(float amount, long accountnumber) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountnumber() == accountnumber) {
				float Balance = dtos.get(i).getBalance();
				float withdraw = Balance - amount;
				dtos.get(i).setBalance(withdraw);
				return withdraw;
			}
		}
		return amount;
	}

	public CustomerDataDTO removeByName(String name) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().equals(name)) {
				dtos.remove(i);
			}

		}
		return null;
	}

	public CustomerDataDTO updateByName(String name, long accountnumber) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().equals(name)) {
				dtos.get(i).setAccountnumber(accountnumber);
			}

		}
		return null;
	}
}
