package com.qa.tests;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.client.RestClient;


public class GetAPITests extends TestBase {

	TestBase testBase;
	CloseableHttpResponse closeableHttpResponse;
	String serviceUrl;
	String apiUrl;
	String url;
	String appid;

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		appid = prop.getProperty("appid");
		url = serviceUrl + apiUrl;

	}

	@Test
	public void testByCityId() throws ClientProtocolException, IOException {

		String cityId = prop.getProperty("cityId");
		RestClient restClient = new RestClient();
		closeableHttpResponse = restClient.get(url + "id=" + cityId + "&appid=" + appid);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		
		//Assert Statement is used to validate 200 Status Code
		Assert.assertEquals(RESPONSE_STATUS_CODE_200, statusCode);

	}

	@Test
	public void testByCityName() throws ClientProtocolException, IOException {

		String cityName = prop.getProperty("cityName");
		RestClient restClient = new RestClient();
		closeableHttpResponse = restClient.get(url + "q=" + cityName + "&appid=" + appid);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		
		//Assert Statement is used to validate 200 Status Code
		Assert.assertEquals(RESPONSE_STATUS_CODE_200, statusCode);

	}

	@Test
	public void testByGeographicCoordinates() throws ClientProtocolException, IOException {
		String latitude = prop.getProperty("latitude");
		String longitude = prop.getProperty("longitude");
		RestClient restClient = new RestClient();
		closeableHttpResponse = restClient.get(url + "lat=" + latitude + "&lon=" + longitude + "&appid=" + appid);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		
		//Assert Statement is used to validate 200 Status Code
		Assert.assertEquals(RESPONSE_STATUS_CODE_200, statusCode);
	}

	@Test
	public void testByZipAndCountryCode() throws ClientProtocolException, IOException {
		String zipCode = prop.getProperty("newYorkZipCode");
		String countryCode = prop.getProperty("usaCountryCode");
		RestClient restClient = new RestClient();
		closeableHttpResponse = restClient.get(url + "zip="+zipCode+","+countryCode + "&appid=" + appid);
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		
		//Assert Statement is used to validate 200 Status Code
		Assert.assertEquals(RESPONSE_STATUS_CODE_200, statusCode);
	}
	
	
}