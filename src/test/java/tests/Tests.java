package tests;

import org.testng.annotations.Test;

public class Tests extends BaseClass{

	@Test
	// Test for search box visibility
	public void testOne() {
		BaseTest baseTest = new BaseTest(driver);
		TestData testData = new TestData();
		driver.get(testData.myUrl);
		baseTest.WaitFor(10);
		baseTest.MyElementIsVisible(testData.searchFieldXpath);
	}

	@Test
	// Test for negative search result
	public void testTwo() {
		BaseTest baseTest = new BaseTest(driver);
		TestData testData = new TestData();
		driver.get(testData.myUrl);
		baseTest.WaitFor(10);
		baseTest.MyElementIsVisible(testData.searchFieldXpath);
		baseTest.TapMyElement(testData.searchFieldXpath);
		baseTest.FillMyField(testData.searchFieldXpath, testData.negativeSearch);
		baseTest.PressGoOnKeyboard(testData.searchFieldXpath);
		baseTest.WaitFor(6);
		baseTest.MyElementIsVisible(testData.negativeSearchXpathResult);
		baseTest.MyElementIsVisible(testData.negativeSearchXpathResultsFor);
	}

	@Test
	// Test for positive search result
	public void testThree() {
		BaseTest baseTest = new BaseTest(driver);
		TestData testData = new TestData();
		driver.get(testData.myUrl);
		baseTest.WaitFor(10);
		baseTest.MyElementIsVisible(testData.searchFieldXpath);
		baseTest.TapMyElement(testData.searchFieldXpath);
		baseTest.FillMyField(testData.searchFieldXpath, testData.positiveSearch);
		baseTest.PressGoOnKeyboard(testData.searchFieldXpath);
		baseTest.WaitFor(6);
		baseTest.MyElementIsVisible(testData.negativeSearchXpathResultsFor);
		baseTest.MyElementIsVisible(testData.positiveSearchXpathresult);
		baseTest.MyElementIsVisible(testData.positiveSearchXpathresult3);
	}
}
