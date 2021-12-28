package com.thoughtfocus.set.mobile;

public class MobileDTO {

	private int mobileid;
	private String modelname;
	private long price;
	private String memory;
	private String brandname;
	private long serialnumber;
	private int noofcameras;
	
	public MobileDTO() {
		
	}

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public long getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(long serialnumber) {
		this.serialnumber = serialnumber;
	}

	public int getNoofcameras() {
		return noofcameras;
	}

	public void setNoofcameras(int noofcameras) {
		this.noofcameras = noofcameras;
	}

	@Override
	public String toString() {
		return "MobileDTO [mobileid=" + mobileid + ", modelname=" + modelname + ", price=" + price + ", memory="
				+ memory + ", brandname=" + brandname + ", serialnumber=" + serialnumber + ", noofcameras="
				+ noofcameras + "]";
	}
	
}
