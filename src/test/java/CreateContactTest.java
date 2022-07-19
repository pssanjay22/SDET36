import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void createContact() {
		System.out.println("======contact created=====");
		System.out.println("======contact created=====");
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
	}
	
	@Test
	public void editContact() {
		System.out.println("=====edited contact======");
	}
}
