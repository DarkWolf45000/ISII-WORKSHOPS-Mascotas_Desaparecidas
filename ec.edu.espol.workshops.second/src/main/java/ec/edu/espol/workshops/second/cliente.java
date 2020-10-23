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

		
	public int calculateInsurance() {
		
			int insurance=500;
			
			if(this.age>80) {
				
				return -1;
				
			}else if(!this.licence) {
				
				return -1;
				
			}else {
				
				if(this.sex.equalsIgnoreCase("m") && !this.maritalStatus && this.age<25) {
					insurance=insurance+1500;
					
				}
				
				if(this.sex.equalsIgnoreCase("f") || this.maritalStatus) {
					insurance=insurance-200;
				}
				
				if(this.age>=45 && this.age<65) {
					insurance=insurance-100;
				}
				
			}
			return insurance;
	}

}
