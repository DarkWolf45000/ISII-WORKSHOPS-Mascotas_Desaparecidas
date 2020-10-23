package ec.edu.espol.workshops.second;

public class cliente {
	private int age;
	private String sex;
	private boolean maritalStatus;
	
	private boolean licence;

	public cliente(int age, String sex, boolean maritalStatus, boolean licence) {
		this.age = age;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.licence = licence;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public void  setLicence(boolean licence) {
		this.licence=licence;
	}
	public int getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}

	public boolean getMaritalStatus() {
		return this.maritalStatus;
	}
	public boolean getLicence() {
		return this.licence;
	}


}
