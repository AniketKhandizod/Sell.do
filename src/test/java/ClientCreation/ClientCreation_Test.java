package ClientCreation;
import org.testng.annotations.Test;
import com.selldo.Utility.BaseTest;
import selldo.POM.createClientPage;

public class ClientCreation_Test extends BaseTest {

	@Test
	public void createPostpaidClient() {
		createClientPage page= new createClientPage(driver);
		page.createClient();		
	}
	@Test
	public void createPrepaidClient() {
		client.logout();
		createClientPage page= new createClientPage(driver);
		page.createClient2();
	}
	
	
}
