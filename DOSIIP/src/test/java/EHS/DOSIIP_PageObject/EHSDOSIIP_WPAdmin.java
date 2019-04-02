package EHS.DOSIIP_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EHSDOSIIP_WPAdmin {
	
	
	WebDriver driver;
		public EHSDOSIIP_WPAdmin (WebDriver mydriver) {
			driver = mydriver;
	}

	//Log In
	public WebElement getUserName () {
		WebElement UserName = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		return UserName;
	}
	public WebElement getPassWord () {
		WebElement PassWord = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		return PassWord;
	}
	public WebElement getLoginSubmit () {
		WebElement LoginSubmit = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
		return LoginSubmit;
	}
	public WebElement getClearCache() {
		WebElement ClearChache =  driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-clear-page-cache\"]/a"));
		return ClearChache;
	}

	//States
	public WebElement getVerticalToolbarStates() {
		WebElement VerticalToolbarStates =driver.findElement(By.xpath("//li[@id='menu-posts-state_state']/a/div[3]"));
		return VerticalToolbarStates;
	}
	public WebElement getStateAddNew() {
		WebElement StateAddNew =driver.findElement(By.xpath("//li[@id='menu-posts-state_state']/ul/li[3]/a"));
		return StateAddNew;
	}
	public WebElement getAddNewStateEnterTitle() {
		WebElement AddNewStateEnterTitle =driver.findElement(By.xpath("//input[@id='title']"));
		return AddNewStateEnterTitle;
	}
	public WebElement getPublishState() {
		WebElement PublishState =driver.findElement(By.xpath("//div[@id='publishing-action']/input[2]"));
		return PublishState;
	}
	public WebElement getFlorida() {
		WebElement Florida = driver.findElement(By.xpath("//*[@id=\"post-21219\"]/td[1]/strong/a"));
		return Florida;
	}
	public WebElement getStateUpdate() {
		WebElement StateUpdate=driver.findElement(By.xpath("//*[@id=\"publish\"]"));
		return StateUpdate; 
	 }
	public WebElement getStateViewPost() {
		WebElement StateViewPost = driver.findElement(By.xpath("//span[2]/a"));
		return StateViewPost;
	}
	public WebElement getStatePreviewChanges() {
		 WebElement StatePreviewChanges = driver.findElement(By.xpath("//*[@id=\"post-preview\"]a"));
		 return StatePreviewChanges;
		}
	
	

	//By The Number
	public WebElement getByTheNumbersSectionTitle() {
		WebElement NumbersSectionTitle = driver.findElement(By.xpath("//*[@id=\"acf-field_5c5b308bbe147\"]"));
		return NumbersSectionTitle;
	}
	public WebElement getByTheNumberAddRow() {
		WebElement ByTheNumberAddRow =driver.findElement(By.xpath("//*[@id=\"acf-group_5c133d67968d4\"]/div/div[2]/div[2]/div/div/a"));
		return ByTheNumberAddRow;
	}
	public WebElement getBytheNumberInsertNumberRow1() {
		WebElement getBytheNumberInsertNumber = driver.findElement(By.xpath("//div[@id='acf-group_5c133d67968d4']/div/div[2]/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div/input"));
		return getBytheNumberInsertNumber;
	}
	public WebElement getByTheNumberLabelForNumberRow1() {
		WebElement ByTheNumberLabelForNumber =driver.findElement(By.xpath("//div[@id='acf-group_5c133d67968d4']/div/div[2]/div[2]/div/table/tbody/tr/td[2]/div[2]/div[2]/div/input"));
		return ByTheNumberLabelForNumber;
	}
	public WebElement getBytheNumberInsertNumberRow2() {
		WebElement getBytheNumberInsertNumber = driver.findElement(By.xpath("//*[@id=\"acf-field_5c17dbcf62c59-1-field_5c17dc4662c5a\"]"));
		return getBytheNumberInsertNumber;
	}
	public WebElement getByTheNumberLabelForNumberRow2() {
		WebElement ByTheNumberLabelForNumber =driver.findElement(By.xpath("//*[@id=\"acf-field_5c17dbcf62c59-1-field_5c17dc5062c5b\"]"));
		return ByTheNumberLabelForNumber;
	}
	public WebElement getBytheNumberInsertNumberRow3() {
		WebElement getBytheNumberInsertNumber = driver.findElement(By.xpath("//*[@id=\"acf-field_5c17dbcf62c59-2-field_5c17dc4662c5a\"]"));
		return getBytheNumberInsertNumber;
	}
	public WebElement getByTheNumberLabelForNumberRow3() {
		WebElement ByTheNumberLabelForNumber =driver.findElement(By.xpath("//*[@id=\"acf-field_5c17dbcf62c59-2-field_5c17dc5062c5b\"]"));
		return ByTheNumberLabelForNumber;
	}

	
	// State page 
	
	
	public WebElement getStatePageStateName() {
		WebElement StatePageStateName = driver.findElement(By.xpath("//article[@id='post-21219']/section/div/div/div/div[2]/h1/span"));
		return StatePageStateName;
	}
	public WebElement getStatePageNumber1() {
		WebElement StatePageNumber1 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li/span"));
		return StatePageNumber1;
	}
	public WebElement getStatePageLabelforNumber1() {
		WebElement StatePageLabelforNumber1 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li/p"));
		return StatePageLabelforNumber1;
	}
	
	public WebElement getStatePageNumber2() {
		WebElement StatePageNumber2 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li[2]/span"));
		return StatePageNumber2;
	}
	public WebElement getStatePageLabelforNumber2() {
		WebElement StatePageLabelforNumber2 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li[2]/p"));
		return StatePageLabelforNumber2;
	}
	public WebElement getStatePageNumber3() {
		WebElement StatePageNumber3 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li[3]/span"));
		return StatePageNumber3;
	}
	public WebElement getStatePageLabelforNumber3() {
		WebElement StatePageLabelforNumber3 =driver.findElement(By.xpath("//article[@id='post-21219']/section[2]/ul/li[3]/p"));
		return StatePageLabelforNumber3;
	}
	
	
	
	
	
	//State: Impact - Economic
	public WebElement getImpactHighlightsaddBulletPoint() {
		WebElement ImpactHighlightsaddBulletPoint =driver.findElement(By.xpath("//*[@id=\"acf-group_5c54922f90146\"]/div/div[1]/div[2]/div/div[1]/div[2]/div/div/a"));
		return ImpactHighlightsaddBulletPoint;
	}
	public WebElement getEconomicImpactTextTitle() {
		WebElement EconomicImpactTextTitle =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fc6ae5-0-field_5c54923029874\"]"));
		return EconomicImpactTextTitle;
	}
	public WebElement getEconomicImpactURL() {
		WebElement EconomicImpactURL =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fc6ae5-0-field_5c5492302a14c\"]"));
		return EconomicImpactURL;
	}

	//Education and Exchange
	public WebElement getEducationandExchangeaddBulletPoint() {
		WebElement EducationandExchangeaddBulletPoint =driver.findElement(By.xpath("//*[@id=\"acf-group_5c54922f90146\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/div/a"));
		return EducationandExchangeaddBulletPoint;
	}
	public WebElement getEducationandExchangeTextTile() {
		WebElement EducationandExchangeTextTitle =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fcbc1d-0-field_5c5492303b8ab\"]"));
		return EducationandExchangeTextTitle;
	}
	public WebElement getEducationandExchangeURLLink() {
		WebElement EducationandExchangeURLLink =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fcbc1d-0-field_5c5492303e951\"]"));
		return EducationandExchangeURLLink;
	}

	//Diplomacy
	public WebElement getDiplomacyAddBulletPoint() {
		WebElement DiplomacyAddBulletPoint =driver.findElement(By.xpath("//*[@id=\"acf-group_5c54922f90146\"]/div/div[1]/div[2]/div/div[3]/div[2]/div/div/a"));
		return DiplomacyAddBulletPoint;
	}
	public WebElement getDiplomacyTextTitle() {
		WebElement DiplomacyTextTitle =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fd36c7-0-field_5c54923079b78\"]"));
		return DiplomacyTextTitle;
	}
	public WebElement getDiplomacyURLLink() {
		WebElement DiplomacyURLLink =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fd36c7-0-field_5c5492307a492\"]"));
		return DiplomacyURLLink;
	}

	//Travel
	public WebElement getTravelAddBulletPonit() {
		WebElement TravelAddBulletPonit =driver.findElement(By.xpath("//*[@id=\"acf-group_5c54922f90146\"]/div/div[1]/div[2]/div/div[4]/div[2]/div/div/a"));
		return TravelAddBulletPonit;
	}
	public WebElement getTravelTextTitle() {
		WebElement TravelTextTitle =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fd079b-0-field_5c54923057207\"]"));
		return TravelTextTitle;
	}
	public WebElement getTravelURL() {
		WebElement TravelURL =driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fd079b-0-field_5c5492305d3e0\"]"));
		return TravelURL;
	}

	// Download Asset
	public WebElement getDownloadAssets() {
		WebElement DownloadAssets =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div/ul/li[3]/a"));
		return DownloadAssets;
	}
	public WebElement getFastfactsheetAddfile() {
		WebElement FastfactsheetAddfile =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[10]/div[2]/div/div[2]/p/a"));
		return FastfactsheetAddfile;
	}
	public WebElement getFastFactSheetUploadfile() {
		WebElement FastFactSheetUploadfile =driver.findElement(By.xpath("//div[@id='__wp-uploader-id33']/div[3]/div/a"));
		return FastFactSheetUploadfile;
	}
	public WebElement getFastFactSheetSelectfiles() {
		WebElement FastFactSheetSelectFiles =driver.findElement(By.xpath("//div[@id='__wp-uploader-id9']/div[5]/div/div[2]/button"));
		return FastFactSheetSelectFiles;
	}
	public WebElement getFastFactSheetClose() {
		WebElement FastFactSheetClose =driver.findElement(By.xpath("//div[@id='__wp-uploader-id33']/div[3]/div/a[2]"));
		return FastFactSheetClose;
	}
	public WebElement getFastFactSheetMediaLibrary() {
		WebElement FastFactSheetMediaLibrary =driver.findElement(By.xpath("//div[@id='__wp-uploader-id33']/div[3]/div/a[2]"));
		return FastFactSheetMediaLibrary;
	}
	public WebElement getFastFactSheetSelect() {
		WebElement FastFactSheetSelect =driver.findElement(By.xpath("//div[@id='__wp-uploader-id9']/div[3]/div/a[2]"));
		return FastFactSheetSelect;
	}
	public WebElement getFullfactsheetAddfile() {
		WebElement FullfactsheetAddfile =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[12]/div[2]/div/div[2]/p/a"));
		return FullfactsheetAddfile;
	}
	public WebElement getFullfactsheetUploadFile() {
		WebElement FullfactsheetUploadFile =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[12]/div[2]/div/div[2]/p/a"));
		return FullfactsheetUploadFile;
	}
	public WebElement getFullfactsheetMediaLibrary() {
		WebElement FullfactsheetMediaLibrary =driver.findElement(By.xpath("//div[@id='__wp-uploader-id15']/div[3]/div/a[2]"));
		return FullfactsheetMediaLibrary;
	}
	public WebElement getFullfactsheetSelect() {
		WebElement FullfactsheetSelect =driver.findElement(By.xpath("//div[@id='__wp-uploader-id15']/div[5]/div/div[2]/button"));
		return FullfactsheetSelect;
	}
	public WebElement getFullFactSheetClose() {
		WebElement FullFactSheetClose =driver.findElement(By.xpath("//div[@id='__wp-uploader-id5']/div/button/span"));
		return FullFactSheetClose;
	}
	public WebElement getImpactDataAddfile() {
		WebElement ImpactDataAddfile =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[12]/div[2]/div/div[2]/p/a"));
		return ImpactDataAddfile;
	}
	public WebElement getImpactDataUploadFile() {
		WebElement ImpactDataUploadFile =driver.findElement(By.xpath("//div[@id='__wp-uploader-id21']/div[3]/div/a"));
		return ImpactDataUploadFile;
	}
	public WebElement getImpactDataMediaLibrary() {
		WebElement ImpactDataMediaLibrary =driver.findElement(By.xpath("//div[@id='__wp-uploader-id21']/div[3]/div/a[2]"));
		return ImpactDataMediaLibrary;
	}
	public WebElement getImpactDataSelect() {
		WebElement ImpactDataSelect =driver.findElement(By.xpath("//ul[@id='__attachments-view2135']/li[4]/div/div"));
		return ImpactDataSelect;
	}
	public WebElement getImpactDataClose() {
		WebElement ImpactDataClose =driver.findElement(By.xpath("//div[@id='__wp-uploader-id8']/div/button/span"));
		return ImpactDataClose;
	}
	public WebElement getDiplomats() {
		WebElement Diplomats =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div/ul/li[4]/a"));
		return Diplomats;
	}
	public WebElement getDiplomatAddRow() {
		WebElement DiplomatAddRow =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[14]/div[2]/div/div/a"));
		return DiplomatAddRow;
	}
	public WebElement getDiplomatFullName() {
		WebElement DiplomatFullName =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[14]/div[2]/div/table/tbody/tr/td[2]/div/div/input"));
		return DiplomatFullName;
	}
	public WebElement getDiplomatLocation() {
		WebElement DiplomatLocation =driver.findElement(By.xpath("//div[@id='acf-group_5c133d67968d4']/div/div[14]/div[2]/div/table/tbody/tr/td[3]/div/div/input"));
		return DiplomatLocation;
	}
	public WebElement getDiplomatImage() {
		WebElement DiplomatImage =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[14]/div[2]/div/table/tbody/tr/td[4]/div/div/div[2]/p/a"));
		return DiplomatImage;
	}
	public WebElement getDiplomatUploadFile() {
		WebElement DiplomatUploadFile =driver.findElement(By.xpath("//div[@id='__wp-uploader-id30']/div[3]/div/a"));
		return DiplomatUploadFile;
	}
	public WebElement getDiplomatMediaFile() {
		WebElement DiplomatMediaFile =driver.findElement(By.xpath("//div[@id='__wp-uploader-id30']/div[3]/div/a[2]"));
		return DiplomatMediaFile;
	}
	public WebElement getDiplomatImageSelect() {
		WebElement DiplomatImageSelect =driver.findElement(By.xpath("//div[@id='acfgroup_5c133d67968d4']/div/div[14]/div[2]/div/table/tbody/tr/td[4]/div/div/div[2]/p/a"));
		return DiplomatImageSelect;
	}

	//DOS57 - Countries
	public WebElement getVerticalToolbarCountriesandAreas() {
		WebElement VerticalToolbarCountriesandAreas =driver.findElement(By.xpath("//*[@id=\"menu-posts-state_country\"]/a/div[3]"));
		return VerticalToolbarCountriesandAreas;
	}
	public WebElement getVerticalToolbarAddNewCountry() {
		WebElement VerticalToolbarAddNewCountry =driver.findElement(By.xpath("//*[@id=\"menu-posts-state_country\"]/a/div[3]"));
		return VerticalToolbarAddNewCountry;
	}
	public WebElement getEnterTheCountryTitle () {
		WebElement EnterTheCountryTitle =driver.findElement(By.xpath("//div[@id='titlewrap']/input"));
		return EnterTheCountryTitle;
	}
	public WebElement getBangladesh() {
		WebElement Bangladesh = driver.findElement(By.xpath("//*[@id=\"post-20502\"]/td[1]/strong/a"));
		return Bangladesh;
	}
	public WebElement getCountryViewPost() {
		 WebElement CountryViewPost = driver.findElement(By.xpath("//*[@id=\"view-post-btn\"]/a"));
		 return CountryViewPost;
		}

	//Essential Feilds:
	public WebElement getBannerAddImage() {
		WebElement BannerAddImage =driver.findElement(By.xpath("//div[@id='acfgroup_5af05f3544085']/div/div/div[2]/div/div[2]/p/a"));
		return BannerAddImage;
	}
	public WebElement getTravelAdvisoryFeedLink() {
		WebElement TravelAdvisoryFeedLink =driver.findElement(By.xpath("//div[@id='acfgroup_5af05f3544085']/div/div[7]/div[2]/div/input"));
		return TravelAdvisoryFeedLink;
	}
	public WebElement getTravelNoticeTitle() {
		WebElement TravelNoticeTitle =driver.findElement(By.xpath("//div[@id='acfgroup_5af9cdd5c0a85']/div/div/div[2]/div/input"));
		return TravelNoticeTitle;
	}
	public WebElement getTravelNoticeDescription () {
		WebElement TravelNoticeDescription =driver.findElement(By.xpath("//div[@id='acfgroup_5af9cdd5c0a85']/div/div[2]/div[2]/div/input"));
		return TravelNoticeDescription;
	}
	public WebElement getTravelNoticeCTA () {
		WebElement getTravelNoticeCTA =driver.findElement(By.xpath("//div[@id='acfgroup_5af9cdd5c0a85']/div/div[3]/div[2]/div/input"));
		return getTravelNoticeCTA;
	}
	public WebElement getTravelNoticeCTALink () {
		WebElement TravelNoticeCTALink =driver.findElement(By.xpath("//div[@id='acfgroup_5af9cdd5c0a85']/div/div[4]/div[2]/div/input"));
		return TravelNoticeCTALink;
	}
	public WebElement getImportAmbassadorInfoYesNo() {
		WebElement ImportAmbassadorInfoYesNo =driver.findElement(By.xpath("//div[@id='acfgroup_5b33ed5a1c246']/div/div/div[2]/div/input"));
		return ImportAmbassadorInfoYesNo;
	}
	public WebElement getAmbassadorJsonRestAPIUrl () {
		WebElement AmbassadorJsonRestAPIUrl =driver.findElement(By.xpath("//*[@id=\"acf-field_5c3e015cf56a2\"]"));
		return AmbassadorJsonRestAPIUrl;
	}
	public WebElement getContentFeedTitle () {
		WebElement ContentFeedTitle =driver.findElement(By.xpath("//div[@id='acfgroup_5b33ed5a1c246']/div/div/div[2]/div/input"));
		return ContentFeedTitle;
	}
	public WebElement getRelationshipTitle () {
		WebElement RelationshipTitle =driver.findElement(By.xpath("//div[@id='acfgroup_5af47b61e2282']/div/div/div[2]/div/label/div/div"));
		return RelationshipTitle;
	}
	public WebElement getRelationshipTopicTitle1() {
		WebElement RelationshipTopicTitle1 =driver.findElement(By.xpath("//div[@id='acfgroup_5af47b61e2282']/div/div[2]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/div/div[2]/div/input"));
		return RelationshipTopicTitle1;
	}
	public WebElement getRelationshipTopicContent1() {
		WebElement RelationshipTopicContent1 =driver.findElement(By.xpath("//div[@id='acfgroup_5af47b61e2282']/div/div[2]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/div[2]/div[2]/textarea"));
		return RelationshipTopicContent1;
	}
	public WebElement getCountryAdditionalResourcesTitle() {
		WebElement CountryAdditionalResourcesTitle =driver.findElement(By.xpath("//div[@id='acfgroup_5af461d0efd6c']/div/div/div[2]/div/input"));
		return CountryAdditionalResourcesTitle;
	}
	public WebElement getCountryAdditionalResourcesSubHeader1() {
		WebElement CountryAdditionalResourcesSubHeader1 =driver.findElement(By.xpath("//div[@id='acfgroup_5af461d0efd6c']/div/div[2]/div[2]/div/input"));
		return CountryAdditionalResourcesSubHeader1;
	}
	public WebElement getInternalResourceLink() {
		WebElement InternalResourceLink =driver.findElement(By.xpath("//div[@id='acfgroup_5af461d0efd6c']/div/div[3]/div[2]/div/table/tbody/tr/td[2]/div/span/span/span/span"));
		return InternalResourceLink;
	}
	public WebElement getPublishCountry() {
		WebElement PublishCountry=driver.findElement(By.xpath("//div[@id='publishing-action']/input[2]"));
		return PublishCountry;
	}
	public WebElement getCountryUpdate() {
		WebElement CountryUpdate= driver.findElement(By.xpath("//div[3]/input[2]"));
		return CountryUpdate;
	}
	public WebElement getPreviewChanges() {
		WebElement PreviewChanges = driver.findElement(By.xpath("//div[3]/input[2]"));
		return PreviewChanges;
	}
	public WebElement getAmbassadorName() {
		WebElement AmbassadorName = driver.findElement(By.xpath("//*[@id=\"post-20502\"]/section[1]/div[2]/div/a/div[2]/p"));
		return AmbassadorName; 
	}
		
	// State Impact Overview
		
	public WebElement getStateImpactOverviewUSHeader() {
		WebElement StateImpactOverviewUSHeader = driver.findElement(By.xpath("//article[@id='post-20521']/section[2]/div/h2"));
		return StateImpactOverviewUSHeader; 
	}
	
		public WebElement getStateImpactOverviewSpecificImpact() {
		WebElement StateImpactOverviewSpecificImpact = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[2]/div[3]/span/strong"));
		return StateImpactOverviewSpecificImpact; 
	}
	
	public WebElement getStateImpactOverviewPlainTextVersion() {
		WebElement StateImpactOverviewPlainTextVersion = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[2]/div[1]/button"));
		return StateImpactOverviewPlainTextVersion; 
	}
	
	public WebElement getStateImpactEconomicTextTitle1() {
		WebElement StateImpactEconomicTextTitle1 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fc6ae5-0-field_5c54923029874\"]"));
		return StateImpactEconomicTextTitle1; 
	}
	
	public WebElement getStateImpactEconomicURL1() {
		WebElement StateImpactEconomicTextTitle1 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c54922fc64c0-field_5c54922fc6ae5-0-field_5c5492302a14c\"]"));
		return StateImpactEconomicTextTitle1; 
	}
	
	public WebElement getFlorida_StateImpactHighlights() {
		WebElement FloridaImpactHighlights = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[1]/h2/span[1]"));
		return FloridaImpactHighlights; 
	}
	 
	public WebElement getImpactHighlights() {
		WebElement FloridaImpactHighlights = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[1]/h2/span[2]"));
		return FloridaImpactHighlights; 
	}
	
	public WebElement getEconomicMenu() {
		WebElement EconomicMenu = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[2]/ul/li[1]/a"));
		return EconomicMenu; 
	}
	
	public WebElement getEconomicHeader() {
		WebElement EconomicHeader = driver.findElement(By.xpath("//*[@id=\"tab-1\"]/h3"));
		return EconomicHeader; 
	}
	
	public WebElement getEconomicMore1() {
		WebElement EconomicMore1 = driver.findElement(By.xpath("//*[@id=\"tab-1\"]/ul/li[1]/a/span"));
		return EconomicMore1; 
	}
	
	public WebElement getEducationandExchangeMenu() {
		WebElement EducationandExchangeMenu = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[2]/ul/li[2]/a"));
		return EducationandExchangeMenu; 
	}
	
	public WebElement getEducationandExchangeHeader() {
		WebElement EducationandExchangeMenu = driver.findElement(By.xpath("//*[@id=\"tab-2\"]/h3"));
		return EducationandExchangeMenu; 
	}
	
	public WebElement getEducationandExchangeMore1() {
		WebElement EducationandExchangeMore1 = driver.findElement(By.xpath("//*[@id=\"tab-2\"]/ul/li/a/span"));
		return EducationandExchangeMore1; 
	}
	
	public WebElement getTravelMenu() {
		WebElement TravelMenu = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[2]/ul/li[3]/a"));
		return TravelMenu; 
	}
	
	public WebElement getTravelHeader() {
		WebElement TeavelHeader = driver.findElement(By.xpath("//*[@id=\"tab-3\"]/h3"));
		return TeavelHeader; 
	}
	
	public WebElement getTravelMore1() {
		WebElement TravelMore1 = driver.findElement(By.xpath("//*[@id=\"tab-3\"]/ul/li/a/span"));
		return TravelMore1; 
	}
	
	public WebElement getDiplomacyMenu() {
		WebElement DiplomacyMenu = driver.findElement(By.xpath("//*[@id=\"post-20521\"]/section[4]/div[2]/ul/li[4]/a"));
		return DiplomacyMenu; 
	}
	
	public WebElement getDiplomacyHeader() {
		WebElement DiplomacyHeader = driver.findElement(By.xpath("//*[@id=\"tab-4\"]/h3"));
		return DiplomacyHeader; 
	}
	
	public WebElement getDiplomacyMore1() {
		WebElement DiplomacyMore1 = driver.findElement(By.xpath("//*[@id=\"tab-4\"]/ul/li/a/span"));
		return DiplomacyMore1; 
	}
	
	
	
	//Biography Template
	
	public WebElement getWPMenuPage() {
		WebElement WPMenuPage = driver.findElement(By.xpath("//*[@id=\"menu-pages\"]/a/div[3]"));
		return WPMenuPage;
	}
	
	public WebElement getAddNewPage() {
		WebElement AddNewPage = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a"));
		return AddNewPage;
	}
	
	public WebElement getTempleteDropDown() {
		WebElement TempleteDropDown = driver.findElement(By.xpath("//*[@id=\"page_template\"]"));
		return TempleteDropDown;
	}
	
	public WebElement getEnterTitle() {
		WebElement EnterTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		return EnterTitle;
	}
	
	
	public WebElement getDescription() {
		WebElement Description = driver.findElement(By.xpath("//*[@id=\"acf-field_5b58a57d7a5c1\"]"));
		return Description;
	}
	
	public WebElement getBreadcrumbDropDown() {
		WebElement BreadCrumbDropDown = driver.findElement(By.xpath("//*[@id=\"page_template\"]"));
		return  BreadCrumbDropDown;
	}
	
	public WebElement getPersonal1() {
		WebElement Personal1 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[1]/span"));
		return  Personal1;
	}
	
	public WebElement getPersonal2() {
		WebElement getPersonal2 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[2]"));
		return  getPersonal2;
	}
	
	public WebElement getPersonal3() {
		WebElement getPersonal3 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[3]"));
		return  getPersonal3;
	}
	
	public WebElement getPersonal4() {
		WebElement Personal4 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[4]"));
		return  Personal4;
	}
	
	public WebElement getPersonal5() {
		WebElement Personal5 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[5]"));
		return  Personal5;
	}
	
	public WebElement getPersonal6() {
		WebElement Personal6 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[6]"));
		return  Personal6;
	}
	
	public WebElement getPersonal7() {
		WebElement Personal7 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[7]"));
		return  Personal7;
	}
	
	public WebElement getPersonal8() {
		WebElement Personal8 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[8]"));
		return  Personal8;
	}
	
	public WebElement getPersonal9() {
		WebElement Personal9 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[9]"));
		return  Personal9;
	}
	
	public WebElement getPersonal10() {
		WebElement Personal10 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[10]"));
		return  Personal10;
	}
	
	public WebElement getPersonal11() {
		WebElement Personal11 = driver.findElement(By.xpath("//*[@id=\"acf-field_5c8289f9137f6\"]/div[2]/div[1]/ul/li[11]"));
		return  Personal11;
	}
	
}


