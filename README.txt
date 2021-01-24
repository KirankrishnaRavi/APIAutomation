As per the analysis of the URL "https://openweathermap.org/current", OpenWeather map portal has given access to Weather data of about 200,000 cities.

The data can be accessed using CityName, CityID, Geographic Coordinates and Country Code. Hence GET Method is implemented in RestClient (of Package com.qa.client).

Other REST Calls such as POST, PUT and DELETE can be implemented in RestClient Class if required in future.

How to Run The Project:
1. Provide API Key in Line No: 3 of config.properties
1. Right Click testng.xml and select "Run As->TestNG Suite". get Calls to retrieve weather data based on CityName, CityID, Geographic Coordinates and Country Code are tested.


Maven Dependencies:

Dependencies for following Libraries are added in pom.xml and details as follows:
1. httpclient
2. httpcore
3. TestNG
4. JSON