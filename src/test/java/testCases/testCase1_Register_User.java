package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass; 

public class testCase1_Register_User extends BaseClass {

	@Test
	public void  registeration() {
		
		logger.info("TC01 Started");
		HomePage hm = new HomePage(driver);
	
		if(hm.homepagedisplayed()) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		logger.info("verified home page");
		hm.signupbtn();
		
		if(hm.usersign().contains("New User Signup!")) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		logger.info("verified user signup");
		hm.signupname("John");
		hm.sinemail(randomeAlphaNumberic());
		hm.signbtn();
		
		if(hm.information()) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		logger.info("verified account information page displayed");
		
		hm.title();
		hm.pass("Admin");
		hm.date("10");
		hm.mon("June");
		hm.year("2014");
		
		hm.offercheckbox();
		hm.lettercheckbox();
		hm.firstname("Rock");
		hm.lastname("Don");
		hm.add("No81.donStrret");
		hm.conuntry("Australia");
		hm.state("ABC");
		hm.city("SDw");
		hm.code("57656");
		hm.number("5647588745");
		hm.createacc();
		logger.info("all details entered");
		
		System.out.println(hm.acccreated());
		try {
		if(hm.acccreated().equalsIgnoreCase("Account Created!")) {
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		logger.info("verified account creation");
		
	}
}
