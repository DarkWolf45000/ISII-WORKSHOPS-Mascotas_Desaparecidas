package ec.edu.espol.workshops.second;
import static org.junit.Assert.*;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.But;
import ec.edu.espol.workshops.second.CarInsurance;



public class StepDefs {
  
  private  String gender;
  private int age;
  private boolean licence;
  private int insurance_value;
  private boolean married;
  
  @Given("the client is a man")
  public void the_client_is_a_man() {
    this.gender = "M";
  }
  @Given("the client is a woman")
  public void the_client_is_a_woman() {
    this.gender = "F";
  }
  @And("the client is married")
  public void the_client_is_married() {
    this.married = true;
  }
  @And("the client is not married")
  public void the_client_is_not_married() {
    this.married = false;
  }
  @And("the client is not older than 25")
  public void the_client_is_not_older_than_25() {
    this.age = 24;
  }
  @And("the client is older than 45")
  public void the_client_is_older_than_45() {
    this.age = 46;
  }
  @And("the client has a driver licence")
  public void the_client_has_a_driver_licence() {
    this.licence = true ;
  }
  @But("the client is younger than 65")
  public void the_client_is_younger_than_65() {
    this.age = 64;
  }
  @When("the client asks for car insurence")
  public void the_client_asks_for_car_insurance() {
    CarInsurance client = new CarInsurance(this.age, this.gender, this.married, this.licence);
    this.insurance_value = client.calculateInsurance();
    
  }
  @Then("the client will be charged 2000")
    public void the_client_will_be_charged_2000() {
      assertEquals(2000,this.insurance_value);
    }
  @Then("the client will be charged 400")
  public void the_client_will_be_charged_400() {
    assertEquals(400,this.insurance_value);
  }
  @Then("the client will be charged 300")
  public void the_client_will_be_charged_300() {
    assertEquals(300,this.insurance_value);
  }
  
}