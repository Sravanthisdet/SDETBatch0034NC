package cucumberSteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	WebDriver driver = null;

	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		System.out.println("launch chrome browser");
	}

	@When("open nc login page")
	public void open_nc_login_page() {
		System.out.println("Open NC Login Page");
	}

	@When("enter valid email id")
	public void enter_valid_email_id() {
		System.out.println("enter valid email id");
	}

	@When("enter valid password")
	public void enter_valid_password() {
		System.out.println("enter valid password");
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		System.out.println("click on the login button");
	}

//	@Then("verify login success")
//	public void verify_login_success() {
//		System.out.println("verify login success");
//	}

	@Given("launch the chrome browser")
	public void launch_the_chrome_browser() {
		System.out.println("This is launch chrome browser step");
	}

	@When("open nc login page in opened browser")
	public void open_nc_login_page_in_opened_browser() throws Exception {
		System.out.println("This is open NC login page step");
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
	}

	@When("enter valid {string} id in email field")
	public void enter_valid_id_in_email_field(String email) {
		System.out.println(email);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);

	}

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@When("enter valid {string} in password field")
	public void enter_valid_in_password_field(String pws) {
		System.out.println(pws);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pws);

	}

	@When("user enter email and pws data as credentials")
	public void user_enter_and_data_as_credentials(DataTable table) {

		List<List<String>> data = table.asLists();

		String un = data.get(0).get(0);

		System.out.println(un);

		String pwd = data.get(0).get(1);

		System.out.println(pwd);

		String un2 = data.get(1).get(0);
		System.out.println(un2);

		String pwd2 = data.get(1).get(1);
		System.out.println(pwd2);

	}

	@Given("user should launch chrome browser")
	public void user_should_launch_chrome_browser() {
	}

	@When("user should open the nc login page")
	public void user_should_open_the_nc_login_page() {
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	}

	@Then("user should verify login success")
	public void user_should_verify_login_success() {

	}

	@When("click on login button of the login page")
	public void click_on_login_button_of_the_login_page() throws Exception {
		System.out.println("This is click on loginBtn");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("Login Success");
	}

}
