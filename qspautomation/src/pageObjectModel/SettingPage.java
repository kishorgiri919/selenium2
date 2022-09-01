package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingPage {

	@FindBy(xpath="//div[.='Settings']") private WebElement settingPageButton;
	@FindBy(xpath="//a[.='General Settings']") private WebElement generalSettingButton;
	@FindBy(xpath="//a[.='Billing Types']") private WebElement billingTypesButton ;
	@FindBy(xpath="//a[.='Logo & Color Scheme']") private WebElement logoAndColourScheme;
	@FindBy(xpath="//*[@name='firstHierarchyLevelCode']") private WebElement topGroupingLevelDropdown ;
	@FindBy(name="secondHierarchyLevelCode") private WebElement MiddlegroupinglevelDropdown;
    @FindBy(name="thirdHierarchyLevelCode") private WebElement TimeEntrylevelDropdown;
    @FindBy(id="hoursPerDayLimited_LimitTo") private WebElement limitToRadioButton;
    @FindBy(id="//*[@id='hoursPerDayLimited_Unlimited']") WebElement unlimitedRadioButton;
    @FindBy(id="maximumMinutesPerDayId") private WebElement timeLmitSetTextfild;
    
    @FindBy(id="saveSettingsButton") private WebElement saveSettingButton;
}
