package ec.edu.espol.workshops.second;

/**
 * Clase creada para representar el seguro del vehiculo solicitado
 * 
 *  @author Matheus
 * */
public class CarInsurance {
	/**
	 * Edad del cliente solicitando el seguro
	 * 
	 *  @author Matheus
	 */
	private int age;
	/**
	 * Genero del cliente solicitando el seguro
	 * 
	 *  @author Matheus
	 */
	private String sex;
	/**
	 * Estado marital del cliente solicitando el seguro
	 */
	private boolean maritalStatus;
	/**
	 * Si tiene o no licencia el cliente solicitando el seguro
	 */
	private boolean licence;
	
	/**
	 * Constructor de clase de seguro de vehiculo con parametros dados
	 * 
	 * @author Matheus
	 */
	public CarInsurance(int age, String sex, boolean maritalStatus, boolean licence) {
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

	/**
	 * Funcion para devolver resultado de valor del seguro
	 */
	public int calculateInsurance() {
			//SEGURO BASE
			int insurance=500;
			//limite maximo de edad posible para servicio
			final int limiteEdad=80;
			
			final int limiteEdad2=25;
			
			if(this.age>limiteEdad) {
				return -1;
			}else if(!this.licence) {
				return -1;
			}else {
				
				if("m".equalsIgnoreCase(this.sex) && !this.maritalStatus && this.age<limiteEdad2) {
					insurance=insurance+1500;
					
				}
				
				if("f".equalsIgnoreCase(this.sex) || this.maritalStatus) {
					insurance=insurance-200;
				}
				
				if(this.age>=45 && this.age<65) {
					insurance=insurance-100;
				}
				
			}
			return insurance;
	}

}
