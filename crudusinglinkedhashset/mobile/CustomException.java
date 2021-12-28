package com.thoughtfocus.set.mobile;

public class CustomException extends Exception {
	@Override
	public String getMessage() {
		return "Couldnt delete because the entered serial number is not in the list";
	}

}
