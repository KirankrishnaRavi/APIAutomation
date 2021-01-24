package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public int RESPONSE_STATUS_CODE_200 = 200;

	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\configuration\\config.properties"));

			prop.load(fs);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
