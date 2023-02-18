package org.mma.mercury.tours.pages;
/**
 *********************************************************************************************************   
 @author Rumana Rahman
 Class Name: 
 Description: 
 Reviewer name:
 Review Date:
 Comments:
 Creation Date: 2/11/2023                   
 *********************************************************************************************************
 **/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MercuryToursRegisterPage {
	public WebDriver driver;
	public MercuryToursRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 *********************************************************************************************************   
	                  Web elements - Mercury Tours Register page                   
	 *********************************************************************************************************
	 **/
	@FindBy(linkText="REGISTER") WebElement registerHyperlink;
	@FindBy(name="firstName") WebElement firstNameInput;
	@FindBy(name="lastName") WebElement lastNameInput;
	@FindBy(name="phone") WebElement phoneNumberInput;
	@FindBy(name="userName") WebElement emailIdInput;
	@FindBy(name="city") WebElement cityNameInput;
	@FindBy(name="state") WebElement stateNameInput;
	@FindBy(name="postalCode") WebElement postalCodeInput;
	@FindBy(name="country") WebElement countryDrp;
	@FindBy(name="email") WebElement userNameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="confirmPassword") WebElement confirmPasswordInput;
	@FindBy(name="submit") WebElement submitBtn;
	@FindBy(xpath="//*[contains(text(),' Note: Your user name is jojobean.')]") WebElement registerConfirmationMessage;	
	
	/**
	 *********************************************************************************************************   
	                 Methods - Mercury Tours Register page                   
	 *********************************************************************************************************
	 **/
  @Test
  public void mercuryToursRegisterPageElementsAndMethods(String fName, String lname, 
		  String uPhone, String uEmail, String uAddress, String uCity, String uState,
		  String pCode, String uCountry, String uName, String uPass, String uConfirmPass) {
  }
}
