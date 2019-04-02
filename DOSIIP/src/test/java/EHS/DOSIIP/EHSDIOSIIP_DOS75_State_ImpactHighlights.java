package EHS.DOSIIP;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import EHS.DOSIIP_PageObject.EHSDOSIIP_WPAdmin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EHSDIOSIIP_DOS75_State_ImpactHighlights {

	WebDriver driver;
	EHSDOSIIP_WPAdmin OP;
	
	@Given("^the user is in State edit page in WP-Admin$")
	public void the_user_is_in_State_edit_page_in_WP_Admin() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faryan\\Desktop\\driver libraries\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		OP = new EHSDOSIIP_WPAdmin(driver);

		driver.get("https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php");
		driver.manage().window().maximize();
	

		OP.getUserName().sendKeys("faryan");
		OP.getPassWord().sendKeys("Arash@2012");
		OP.getLoginSubmit().click();

		// Asserting Wp-Admin Page
		String currrentURL = driver.getCurrentUrl();
		String expactedURL = "https://live-ehsdosiip.pantheonsite.io/wp-admin/index.php";
		Assert.assertEquals(currrentURL, expactedURL);
		
		OP.getVerticalToolbarStates().click();
		OP.getFlorida().click();
	   
	}

	@When("^the user insert text title and url link for Economic Impact topic$")
	public void the_user_insert_text_title_and_url_link_for_Economic_Impact_topic() throws Throwable {
	  
		OP.getEconomicImpactTextTitle().clear();
		OP.getEconomicImpactTextTitle().sendKeys("Robbins describes the definition as not classificatory in \"pick[ing] out certain kinds of behaviour\" but rather analytical in \"focus[ing] attention on a particular aspect of behaviour, the form imposed by the influence of scarcity.\"[24] He affirmed that previous economists have usually centred their studies on the analysis of wealth: how wealth is created (production), distributed, and consumed; and how wealth can grow.[25] But he said that economics can be used to study other things, such as war, that are outside its usual focus. This is because war has as the goal winning it (as a sought after end), generates both cost and benefits; and, resources (human life and other costs) are used to attain the goal. If the war is not winnable or if the expected costs outweigh the benefits, the deciding actors (assuming they are rational) may never go to war (a decision) but rather explore other alternatives. We cannot define economics as the science that studies wealth, war, crime, education, and any other field economic analysis can be applied to; but, as the science that studies a particular common aspect of each of those subjects (they all use scarce resources to attain a sought after end).");
		OP.getEconomicImpactURL().clear();
		OP.getEconomicImpactURL().sendKeys("https://en.wikipedia.org/wiki/Economics");
	}

	@When("^the user insert text title and url link for Education and Exchange Impact topic$")
	public void the_user_insert_text_title_and_url_link_for_Education_and_Exchange_Impact_topic() throws Throwable {
	   
		OP.getEducationandExchangeTextTile().clear();
		OP.getEducationandExchangeTextTile().sendKeys("Colonial New England encouraged its towns to support free public schools funded by taxation. In the early 19th century Massachusetts took the lead in education reform and public education with programs designed by Horace Mann that were widely emulated across the North. Teachers were specially trained in normal schools and taught the three Rs (of reading, writing, and arithmetic) and also history and geography. Public education was at the elementary level in most places. After the Civil War (1861–1865), the cities began building high schools. The South was far behind northern standards on every educational measure and gave weak support to its segregated all-black schools. However northern philanthropy and northern churches provided assistance to private black colleges across the South. Religious denominations across the country set up their private colleges. States also opened state universities, but they were quite small until well into the 20th century.");
		OP.getEducationandExchangeURLLink().clear();
		OP.getEducationandExchangeURLLink().sendKeys("https://en.wikipedia.org/wiki/Education_in_the_United_States");
	}

	@When("^the user insert text title and url link for Travel Impact topic$")
	public void the_user_insert_text_title_and_url_link_for_Travel_Impact_topic() throws Throwable {
		
		OP.getTravelTextTitle().clear();
		OP.getTravelTextTitle().sendKeys("Many companies are part of an international cultural exchange program that is centered around the US State Departments J-1 Visa Work and Travel program. The US State Department's Summer Work and Travel Program brings more than 100,000 foreign university students to the US each year. All of the students are between the ages of 18 and 28. All are proficient in the English language and all are able to commit to working for at least three months. Some foreign students are able to work in the US for four months and some for five months. The maximum length of stay is determined by the US State Department and is based in part on typical university schedules in each nation. The Summer Work and Travel Program provides foreign students with an opportunity to live and work in the United States during their summer vacation from college or university to experience and to be exposed to the people and way of life in the United States.");
		OP.getTravelURL().clear();
		OP.getTravelURL().sendKeys("https://en.wikipedia.org/wiki/Work_and_Travel_USA");
	
	}

	@When("^the user insert text title and url link for Diplomacy Impact topic$")
	public void the_user_insert_text_title_and_url_link_for_Diplomacy_Impact_topic() throws Throwable {
		
		OP.getDiplomacyTextTitle().clear();
		OP.getDiplomacyTextTitle().sendKeys("After the war, the U.S. rose to become the dominant non-colonial economic power with broad influence in much of the world, with the key policies of the Marshall Plan and the Truman Doctrine. Almost immediately, however, the world witnessed division into broad two camps during the Cold War; one side was led by the U.S. and the other by the Soviet Union, but this situation also led to the establishment of the Non-Aligned Movement. This period lasted until almost the end of the 20th century and is thought to be both an ideological and power struggle between the two superpowers. A policy of containment was adopted to limit Soviet expansion, and a series of proxy wars were fought with mixed results. In 1991, the Soviet Union dissolved into separate nations, and the Cold War formally ended as the United States gave separate diplomatic recognition to the Russian Federation and other former Soviet states.");
		OP.getDiplomacyURLLink().clear();
		OP.getDiplomacyURLLink().sendKeys("https://en.wikipedia.org/wiki/Foreign_policy_of_the_United_States");
	}

	@When("^the user click on Update button$")
	public void the_user_click_on_Update_button() throws Throwable {
		
		OP.getStateUpdate().submit();
	  
	}

	@Given("^the user is in Domestic Impact Overview page$")
	public void the_user_is_in_Domestic_Impact_Overview_page() throws Throwable {
	  
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		//driver.findElement(By.linkText("https://live-ehsdosiip.pantheonsite.io/state-department-by-state/?state=florida")).sendKeys(selectLinkOpeninNewTab);
		 
		    ((JavascriptExecutor)driver).executeScript("window.open()");
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    driver.get("https://live-ehsdosiip.pantheonsite.io/state-department-by-state/?state=florida");
	   		
	}

	@Then("^the State Impact Highlights appears$")
	public void the_State_Impact_Highlights_appears() throws Throwable {
		
		String ActualHeader = OP.getFlorida_StateImpactHighlights().getText();
		String ExpactedHeader = "Florida";
		Assert.assertEquals(ExpactedHeader, ActualHeader);
				
	}

	@Then("^the Economic Impact inputs are in display$")
	public void the_Economic_Impact_inputs_are_in_display() throws Throwable {
		
		OP.getEconomicMenu().click();
		
		String ExpactedHeader = OP.getEconomicHeader().getText();
		String ActualHeader = "Economic";
		Assert.assertEquals(ExpactedHeader, ActualHeader);
	  		
	}

	@When("^the user click on the 'more' in Econimic Impact input$")
	public void the_user_click_on_the_more_in_Econimic_Impact_input() throws Throwable {
	  
		OP.getEconomicMore1().click();
		
	}
	
	@Then("^it should navigate the user to Impact Highlights URL input$")
	public void it_should_navigate_the_user_to_Impact_Highlights_URL_input() throws Throwable {
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		String ActualURL = driver.getCurrentUrl();
		String ExpactedURL = "https://en.wikipedia.org/wiki/Economics";
		Assert.assertEquals(ExpactedURL, ActualURL);
		
		driver.navigate().back();
	}

	
	@When("^the user click on Education & Exchange$")
	public void the_user_click_on_Education_Exchange() throws Throwable {
		
		OP.getEducationandExchangeMenu().click();
	  
	}

	@Then("^the inputs for Education & Exchange are in display$")
	public void the_inputs_for_Education_Exchange_are_in_display() throws Throwable {
		
		String ExpactedHeader = "Education & Exchanges";
		String ActualHeader = OP.getEducationandExchangeHeader().getText();
		Assert.assertEquals(ExpactedHeader, ActualHeader);
		
	}

	@When("^the user click on the 'more' in Education & Exchange input$")
	public void the_user_click_on_the_more_in_Education_Exchange_input() throws Throwable {
		
		OP.getEducationandExchangeMore1().click();
	   
	}
	
	@Then("^it should navigate the user to Education & Exchange URL input$")
	public void it_should_navigate_the_user_to_Education_Exchange_URL_input() throws Throwable {
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		String ActualURL = driver.getCurrentUrl();
		String ExpactedURL = "https://en.wikipedia.org/wiki/Education_in_the_United_States";
		Assert.assertEquals(ExpactedURL, ActualURL);
		
		driver.navigate().back();
	}
	
	

	@When("^the user click on Travel$")
	public void the_user_click_on_Travel() throws Throwable {
	
		OP.getTravelMenu().click();
	  
	}

	@Then("^the inputs for Travel are in display$")
	public void the_inputs_for_Travel_are_in_display() throws Throwable {
		
		String ExpactedHeader = "Travel";
		String ActualHeader = OP.getTravelHeader().getText();
		Assert.assertEquals(ExpactedHeader, ActualHeader);
	  
	}

	@When("^the user click on the 'more' in Travel input$")
	public void the_user_click_on_the_more_in_Travel_input() throws Throwable {

		OP.getTravelMore1().click();
	}
	
	@Then("^it should navigate the user to Travel URL input$")
	public void it_should_navigate_the_user_to_Travel_URL_input() throws Throwable {

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		String ActualURL = driver.getCurrentUrl();
		String ExpactedURL = "https://en.wikipedia.org/wiki/Work_and_Travel_USA";
		Assert.assertEquals(ExpactedURL, ActualURL);
		
		driver.navigate().back();
	}

	@When("^the user click on Diplomacy$")
	public void the_user_click_on_Diplomacy() throws Throwable {
		
		OP.getDiplomacyMenu().click();
	   
	}

	@Then("^the inputs for Diplomacy are in display$")
	public void the_inputs_for_Diplomacy_are_in_display() throws Throwable {
		
	   String ExpectedHeader = "Diplomacy";
	   String ActualHeader = OP.getDiplomacyHeader().getText();
	   Assert.assertEquals(ExpectedHeader, ActualHeader);
	   
	}

	@When("^the user click on the 'more' in Diplomacy input$")
	public void the_user_click_on_the_more_in_Diplomacy_input() throws Throwable {
		
	    OP.getDiplomacyMore1().click();
	    
	}
	
	@Then("^it should navigate the user to Diplomacy URL input$")
	public void it_should_navigate_the_user_to_Diplomacy_URL_input() throws Throwable {

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		String ActualURL = driver.getCurrentUrl();
		String ExpactedURL = "https://en.wikipedia.org/wiki/Foreign_policy_of_the_United_States";
		Assert.assertEquals(ExpactedURL, ActualURL);
		
		driver.quit();
	}



	
}
