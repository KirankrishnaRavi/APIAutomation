package com.qa.client;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	//1. GET Method
	
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		//Creating Session
		CloseableHttpClient httpClient= HttpClients.createDefault();
		
		//Http Get Request
		HttpGet httpGet = new HttpGet(url); //Http Get Request
		
		// Hit the GET URL
		CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpGet); 
		
		//Status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code ---- > "+statusCode);
		
		return closeableHttpResponse;
		
	}
}
