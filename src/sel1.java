import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.NoSuchElementException;



public class sel1 {

		
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//facebook register test case()
		driver.get("http://www.facebook.com");
		//name
		driver.findElement(By.id("u_0_m")).sendKeys("aaaaaa12");
		//last name
		driver.findElement(By.id("u_0_o")).sendKeys("aaaaa13");
		//email
		driver.findElement(By.id("u_0_r")).sendKeys("godmaster111@yandex.com");
		//re-email
		driver.findElement(By.id("u_0_u")).sendKeys("godmaster111@yandex.com");
		//password
		driver.findElement(By.id("u_0_w")).sendKeys("12345asdasd");
		

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		org.openqa.selenium.support.ui.Select sel1 = new org.openqa.selenium.support.ui.Select(day);
		sel1.selectByVisibleText("9");
		org.openqa.selenium.support.ui.Select sel2 = new org.openqa.selenium.support.ui.Select(month);
		sel2.selectByVisibleText("июл");
		org.openqa.selenium.support.ui.Select sel3 = new org.openqa.selenium.support.ui.Select(year);
		sel3.selectByVisibleText("1990");
		
		driver.findElement(By.cssSelector("#u_0_7")).click();
		driver.findElement(By.id("u_0_13")).click();
		
	
		
		
		
		
		
		
		
		
		//		org.openqa.selenium.support.ui.Select sel1 = Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
//		sel1.selectByVisibleText("9");
//		org.openqa.selenium.support.ui.Select sel2 = Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
//		sel2.selectByVisibleText("Jul");
//		org.openqa.selenium.support.ui.Select sel3 = Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
//		sel3.deselectByValue("1990");
//		Select(driver.findElement(By.xpath("//*[@id=\"month\"]"))).selectByIndex(9);
//		Select(driver.findElement(By.xpath("//*[@id=\"day\"]"))).selectByIndex(7);
//		Select(driver.findElement(By.xpath("//*[@id=\"year\"]"))).selectByValue("1990");
		
		
		
		
//		driver.get("http://www.tapuz.co.il");
//		
//		driver.findElement(By.linkText("הרשמה")).click();
//		//юзернейм
//		driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtUserName\"]")).sendKeys("anton2008");
//		//имя
//		driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtFirstName\"]")).sendKeys("aaasasdasd");
//		//фамилия
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtLastName")).sendKeys("asdasdasdasdsad");
//		//пароль1
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtPassword")).sendKeys("123456");
//		//пароль2
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtPasswordConf")).sendKeys("123456");
//		//меил
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_txtEmail")).sendKeys("azot2008@mail.ru");
//		//чекбокс
//		driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_rdoSexMen")).click();
//		//дроплист1
//		org.openqa.selenium.support.ui.Select city = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_drpAreas")));
//		city.deselectByValue("2");
//		//дроплист2
//		org.openqa.selenium.support.ui.Select graduate = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolderMain_ContentPlaceHolderMain_drpEduction")));
//		graduate.selectByValue("4");
		
				
		
		
//		driver.get("http://ok.ru");
//		driver.findElement(By.name("st.email")).sendKeys("");
//		driver.findElement(By.name("st.password")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"AuthLoginForm\"]/div/div[1]/div[3]/div/button/span/span[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"music_toolbar_button\"]/div[1]")).click();
//		
		
//		driver.get("http://www.facebook.com");
//		
////		driver.findElement(By.id("email")).sendKeys("");
////		driver.findElement(By.id("pass")).sendKeys("");
////		driver.findElement(By.id("u_0_b")).click();
////		driver.findElement(By.id("js_19e")).sendKeys("asdasdasdasdasdasd");
//		    driver.findElement(By.cssSelector("#js_1a > form > button > i")).click();
		
		
		
		
		
		
	
	

	}

}
