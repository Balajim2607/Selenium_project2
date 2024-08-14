package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//a[normalize-space()='Signup / Login']") 
WebElement signupbtn;

@FindBy(xpath="//input[@placeholder='Name']") 
WebElement signupname;
@FindBy(xpath="//button[normalize-space()='Signup']") 
WebElement signbtn;


@FindBy(xpath =  "//input[@data-qa='signup-email']")  
WebElement email;
@FindBy(xpath =  "//div[@id='uniform-id_gender1']")  
WebElement title;
@FindBy(xpath =  "//input[@id='password']")  
WebElement pass;

@FindBy(xpath =  "//select[@id='days']")  
WebElement date;
@FindBy(xpath =  "//select[@id='months']")  
WebElement mon;
@FindBy(xpath =  "//select[@id='years']")  
WebElement yr;

@FindBy(xpath =  "//input[@id='optin']")  
WebElement letter;
@FindBy(xpath =  "//input[@id='newsletter']")  
WebElement offer;
@FindBy(xpath =  "//input[@id='first_name']")  
WebElement firstname;
@FindBy(xpath =  "//input[@id='last_name']")  
WebElement lastname;

@FindBy(xpath =  "//input[@id='address1']")  
WebElement addrees;

@FindBy(xpath =  "//select[@id='country']")  
WebElement country;

@FindBy(xpath =  "//input[@id='state']")  
WebElement state;
@FindBy(xpath =  "//input[@id='city']")  
WebElement city;
@FindBy(xpath =  "//input[@id='zipcode']")  
WebElement zipcode;
@FindBy(xpath =  "//input[@id='mobile_number']")  
WebElement phone;

@FindBy(xpath =  "//button[normalize-space()='Create Account']")  
WebElement createacc;

@FindBy(xpath="//a[normalize-space()='Home']") 
WebElement homepage;
@FindBy(xpath="//h2[normalize-space()='New User Signup!']") 
WebElement usersignup;
@FindBy(xpath="//div[@class='login-form']") 
WebElement informationbox;

@FindBy(xpath="//b[text()='Account Created!']") 
WebElement acccreated;

public String acccreated() {
	return acccreated.getText();
}



public boolean information() {
	return informationbox.isDisplayed();
}
public String usersign() {
return 	usersignup.getText();
}
public boolean homepagedisplayed() {
	return  homepage.isDisplayed();
}

public void signupbtn()
{
	signupbtn.click();
}



public void signupname(String s) 
{
	signupname.sendKeys(s);
}


public void sinemail(String s)
{
	email.sendKeys(s);

}


public void signbtn()
{
	signbtn.click();
}



public void  title() {
title.click();
}

public void  pass(String s) {
	pass.sendKeys(s);
}

public void  date(String s) {
	Select sc= new Select(date);
	sc.selectByVisibleText(s);
}

public void  mon(String s) {
	Select sc= new Select(mon);
	sc.selectByVisibleText(s);
}

public void  year(String s) {
	Select sc= new Select(yr);
	sc.selectByVisibleText(s);
}

public void  lettercheckbox() {
	letter.click();
}

public void  offercheckbox() {
	offer.click();
}

public void  firstname(String s) {
	firstname.sendKeys(s);
}
public void  lastname(String s) {
	lastname.sendKeys(s);
}
public void  add(String s) {
	addrees.sendKeys(s);
}


public void  conuntry(String s) {
	Select sc= new Select(country);
	sc.selectByVisibleText(s);
}

public void  state(String s) {
	state.sendKeys(s);
}
public void  code(String s) {
	zipcode.sendKeys(s);
}
public void  city(String s) {
	city.sendKeys(s);
}
public void  number(String s) {
	phone.sendKeys(s);
}

public void  createacc() {
createacc.click();
}
}
