package TestCases;
import Data.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import Request.*;
import io.restassured.response.Response;
public class PostTest extends Base {
	
	@Test(dataProvider = "testData", dataProviderClass = DataProvider.class)
	public void TestPost(int totalSet , int adultNum , int chiledNum , int infant , String dateFrom, String dateTo) {
		
		Response js = PostRequest.Postreq(totalSet , adultNum , chiledNum , infant , dateFrom, dateTo);
//		System.out.println(js.prettyPrint());
		Assert.assertEquals(js.getStatusCode(), 200);
	}
}
