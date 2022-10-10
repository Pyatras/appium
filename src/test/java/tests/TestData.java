package tests;

public class TestData extends Tests {

	public String myUrl = "https://www.unibet.co.uk/blog";
	public String searchFieldXpath = "//*[@id=\"header\"]/div/form/input";
	public String negativeSearch = "xcuitest";
	public String positiveSearch = "Joyce v Parker";
	public String negativeSearchXpathResult = "//*[@id=\"page-header-bg\"]/div/div/div/div/h1/span[text()='\"xcuitest\"']";
	public String negativeSearchXpathResultsFor = "//*[@id=\"page-header-bg\"]/div/div/div/div/h1[text()='Results For ']";
	public String positiveSearchXpathresult = "//*[@id=\"page-header-bg\"]/div/div/div/div/h1/span[contains(text(),'Joyce v Parker')]";
	public String positiveSearchXpathresult3 = "//*[@id=\"page-header-bg\"]/div/div/div/div/span[contains(text(),'3 results found')]";

}
