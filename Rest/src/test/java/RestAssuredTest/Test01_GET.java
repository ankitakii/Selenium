package RestAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	void test_01() {
		
	Response response =	RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println(response.asString());
	System.out.println(response.getBody());
	System.out.println( response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.header("content-type"));
	System.out.println("Test");
	
	int StatusCode = response.getStatusCode();
	Assert.assertEquals(StatusCode, 201);
	
	}

}
