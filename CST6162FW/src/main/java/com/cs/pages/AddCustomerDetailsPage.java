package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.driver.DriverManager;
import com.cs.enums.WaitStrategy;

public final class AddCustomerDetailsPage extends BasePage{

	//locators
	private static final By fName = By.name("firstName");
	private static final By mName = By.name("middleName");
	private static final By lName = By.name("lastName");
	private static final By saveBtn = By.xpath("//button[@type='submit']");
	private static final By confirmationMsg = By.xpath("//*[text()='Successfully Saved']");
	
	// methods
	public AddCustomerDetailsPage enterFName(String firstName)
	{
		sendKeys(fName,  firstName+System.currentTimeMillis(), WaitStrategy.PRESENCE, "FIRSTNAME");
		return this;
	}
	public AddCustomerDetailsPage enterMName(String middleName)
	{
		sendKeys(mName,  middleName+System.currentTimeMillis(), WaitStrategy.PRESENCE, "MIDDLENAME");
		return this;
	}
	
	public AddCustomerDetailsPage enterLName(String lastName)
	{
		sendKeys(lName,  lastName+System.currentTimeMillis(), WaitStrategy.PRESENCE, "LASTNAME");
		return this;
	}
	
	public void clickOnSaveBtn()
	{
		click(saveBtn, WaitStrategy.CLICKABLE, "SAVE BUTTON");
	}
	
	public String getConfrimationMsg()
	{
		String txtconfirmationMsg = DriverManager.getDriver().findElement(confirmationMsg).getText();
		return txtconfirmationMsg;
	}
	
}
