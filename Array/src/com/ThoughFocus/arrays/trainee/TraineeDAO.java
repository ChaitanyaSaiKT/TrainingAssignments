package com.ThoughFocus.arrays.trainee;

public class TraineeDAO {

	TraineeInformation[] info = new TraineeInformation[3];
	private int i = 0;

	public void printall() {
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				System.out.println(info[i]);
			}

		}
	}

	public void save(TraineeInformation info) {
		if (info != null) {
			this.info[i] = info;
			i++;
		}
	}

	public String deletebyname(String name) {
		for (int i = 0; i < info.length; i++) {
			if (name.equals(info[i].getName())) {
				info[i] = null;
				return "Details of " + name + " is deleted";
			}
		}
		return "Details is not deleted";
	}

	public void updatebyname(String oldName, String updatedName) {
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				if (oldName.equals(info[i].getName())) {
					info[i].setName(updatedName);
				}
			}
		}
	}

	public void nameandPhonenoUpdatebyId(int oldid, String updatedName, long updatephoneno) {
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				if (oldid == info[i].getId()) {
					info[i].setName(updatedName);
					info[i].setNumber(updatephoneno);
				}
			}
		}
	}

	public void phonenoUpdateUsingNameandId(long updatedphoneno, String name, int id) {
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				if (name.equals(info[i].getName())) {
					if (id == info[i].getId()) {
						info[i].setNumber(updatedphoneno);
					}
				}
			}
		}
	}
}
