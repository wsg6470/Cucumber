package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shano\\eclipse-workspace\\FormFillingDataEntry\\drivers\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.onlinedataentryjob.com/form-filling-work.php");
			
			String s=  driver.getTitle();
			System.out.println(s);
			
	}

	@When("Enter the {string} and {string}")
	public void enter_the_username_and_password(String Username, String Password) throws InterruptedException {
				
		WebElement loginOpt = driver.findElement(By.xpath("//strong[text()='Login']"));
		loginOpt.click();
		
		WebElement dUser = driver.findElement(By.name("user_name"));
		dUser.sendKeys(Username);
		
		WebElement dPass = driver.findElement(By.name("password"));
		dPass.sendKeys(Password);
		
		WebElement dSumbit = driver.findElement(By.name("login"));
		dSumbit.click();
		
		
		
		WebElement earnMoney =  driver.findElement(By.xpath("//strong[text()='Earn Money']"));
		earnMoney.click();
		
		driver.navigate().refresh(); 
		Thread.sleep(3000);
		
		
		WebElement earnMoney2 =  driver.findElement(By.xpath("//*[@id=\"toppanel\"]/div[2]/a[3]/p/font/strong"));
		earnMoney2.click();
		
		
		WebElement formFilling = driver.findElement(By.xpath("//*[@id=\"contentpanel\"]/div/div[1]/font/font/center[2]/a/font/b/img"));
		formFilling.click();
	    
	}

	 @Then("^Form filling page1$")
	    public void form_filling_page1() throws InterruptedException {
		 Thread.sleep(1000);
			
			WebElement name = driver.findElement(By.name("name[2292]"));
			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[2]"));
			String s1 = n1.getText();
			name.sendKeys(s1);
			  
			WebElement age = driver.findElement(By.name("age[2292]"));
			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[3]"));
			String s2 = a1.getText();
			age.sendKeys(s2);
			  
			  WebElement mobile = driver.findElement(By.name("mobile[2292]"));
			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[4]"));
				String s3 = m1.getText();
			  mobile.sendKeys(s3);
			  
			  WebElement city = driver.findElement(By.name("city[2292]"));
			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[5]"));
				String s4 = c1.getText();
			  city.sendKeys(s4);
			  
			  WebElement state = driver.findElement(By.name("state[2292]"));
			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[6]"));
				String s5 = st1.getText();
			  state.sendKeys(s5);
			  
			  WebElement sal = driver.findElement(By.name("salary[2292]"));
			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[7]"));
				String s6 = sa1.getText();
			  sal.sendKeys(s6);
			  
			  WebElement emi = driver.findElement(By.name("emi[2292]"));
			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[8]"));
				String s7 = e1.getText();
			  emi.sendKeys(s7);
			  
			  WebElement insurance = driver.findElement(By.name("insurance[2292]"));
			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[1]/td[9]"));
				String s8 = i1.getText();
			  insurance.sendKeys(s8);
			
			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
			  nxt.click(); 
	    }

	    @Then("^Form filling page2$")
	    public void form_filling_page2() throws InterruptedException{
	    	Thread.sleep(1000); 
			WebElement name = driver.findElement(By.name("name[2293]"));
			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[2]"));
			String s1 = n1.getText();
			name.sendKeys(s1);
			  
			WebElement age = driver.findElement(By.name("age[2293]"));
			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[3]"));
			String s2 = a1.getText();
			age.sendKeys(s2);
			  
			  WebElement mobile = driver.findElement(By.name("mobile[2293]"));
			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[4]"));
				String s3 = m1.getText();
			  mobile.sendKeys(s3);
			  
			  WebElement city = driver.findElement(By.name("city[2293]"));
			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[5]"));
				String s4 = c1.getText();
			  city.sendKeys(s4);
			  
			  WebElement state = driver.findElement(By.name("state[2293]"));
			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[6]"));
				String s5 = st1.getText();
			  state.sendKeys(s5);
			  
			  WebElement sal = driver.findElement(By.name("salary[2293]"));
			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[7]"));
				String s6 = sa1.getText();
			  sal.sendKeys(s6);
			  
			  WebElement emi = driver.findElement(By.name("emi[2293]"));
			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[8]"));
				String s7 = e1.getText();
			  emi.sendKeys(s7);
			  
			  WebElement insurance = driver.findElement(By.name("insurance[2293]"));
			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[2]/td[9]"));
				String s8 = i1.getText();
			  insurance.sendKeys(s8);
			
			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page3$")
	    public void form_filling_page3() throws InterruptedException{
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2294]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2294]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2294]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2294]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2294]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2294]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2294]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2294]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[3]/td[9]"));
	    				String s8 = i1.getText();
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	    			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page4$")
	    public void form_filling_page4() throws InterruptedException{
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2295]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2295]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2295]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2295]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2295]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2295]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2295]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2295]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[4]/td[9]"));
	    				String s8 = i1.getText();
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	    			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page5$")
	    public void form_filling_page5() throws InterruptedException{
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2296]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2296]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2296]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2296]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2296]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2296]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2296]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2296]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[5]/td[9]"));
	    				String s8 = i1.getText();
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	    			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page6$")
	    public void form_filling_page6() throws InterruptedException{
	    	
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2297]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2297]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2297]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2297]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2297]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2297]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2297]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2297]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[6]/td[9]"));
	    				String s8 = i1.getText();
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	    			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page7$")
	    public void form_filling_page7() throws InterruptedException{
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2298]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2298]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2298]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2298]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2298]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2298]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2298]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2298]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[7]/td[9]"));
	    				String s8 = i1.getText();
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement nxt = driver.findElement(By.xpath("//input[@value='Next']"));
	    			  nxt.click(); 
	        
	    }

	    @Then("^Form filling page8$")
	    public void form_filling_page8() throws InterruptedException{
	    	Thread.sleep(1000);


	    	WebElement name = driver.findElement(By.name("name[2299]"));
	    			WebElement n1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[2]"));
	    			String s1 = n1.getText();
	    			name.sendKeys(s1);
	    			  
	    			WebElement age = driver.findElement(By.name("age[2299]"));
	    			WebElement a1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[3]"));
	    			String s2 = a1.getText();
	    			age.sendKeys(s2);
	    			  
	    			  WebElement mobile = driver.findElement(By.name("mobile[2299]"));
	    			  WebElement m1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[4]"));
	    				String s3 = m1.getText();
	    			  mobile.sendKeys(s3);
	    			  
	    			  WebElement city = driver.findElement(By.name("city[2299]"));
	    			  WebElement c1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[5]"));
	    				String s4 = c1.getText();
	    			  city.sendKeys(s4);
	    			  
	    			  WebElement state = driver.findElement(By.name("state[2299]"));
	    			  WebElement st1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[6]"));
	    				String s5 = st1.getText();
	    			  state.sendKeys(s5);
	    			  
	    			  WebElement sal = driver.findElement(By.name("salary[2299]"));
	    			  WebElement sa1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[7]"));
	    				String s6 = sa1.getText();
	    			  sal.sendKeys(s6);
	    			  
	    			  WebElement emi = driver.findElement(By.name("emi[2299]"));
	    			  WebElement e1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[8]"));
	    				String s7 = e1.getText();
	    			  emi.sendKeys(s7);
	    			  
	    			  WebElement insurance = driver.findElement(By.name("insurance[2299]"));
	    			  WebElement i1 = driver.findElement(By.xpath("//*[@id=\"table_data\"]/tbody/tr[8]/td[9]"));
	    				String s8 = i1.getText();				   
	    			  insurance.sendKeys(s8);
	    			
	    			  WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
	    			  submit.click(); 
	        
	    }

	    @Then("^Close the Browser$")
	    public void close_the_browser(){
	    	System.out.println("Task Completed");
	    	driver.close();
	        
	    }




	
	


}
