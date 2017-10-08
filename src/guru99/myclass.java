package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {
	public static void main (String args[]){
	// declaration and instantiation of objects/variables
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubham\\Desktop\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    String baseUrl = "http://www.demo.guru99.com/V4/";
    String expectedTitle = "Guru99 Bank Home Page";
    String actualTitle = "";

    // launch Firefox and direct it to the Base URL
    driver.get(baseUrl);

    // get the actual value of the title
    actualTitle = driver.getTitle();

    /*
     * compare the actual title of the page witht the expected one and print
     * the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //close Firefox
    driver.close();
   
    // exit the program explicitly
    System.exit(0);
	
	}
		}