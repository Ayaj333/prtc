package Exp_Ass;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Assr {
	public static void main(String args[]) {
		System.out.println("Execution Started");
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		int statuscode = res.getStatusCode();
		System.out.println("Status Code is " + statuscode);
		System.out.println(res.getTime());
		
		
		// output in Json format
		
		
		Response resstring = RestAssured.get("http://samples.openwheather.org/data/2");
		String data = resstring.asString();
		System.out.println(data);
		System.out.println(resstring.getTime());
	}

}

