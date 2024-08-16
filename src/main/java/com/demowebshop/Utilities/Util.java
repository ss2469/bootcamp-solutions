package com.demowebshop.Utilities;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {

		Date date = new Date();
		String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumuser" + emailTimeStamp + "@gmail.com";

	}
	
	public static final int IMPLICIT_WAIT = 10;
	public static final int PAGELOAD_TIMEOUT = 10;
	public static final int SCRIPT_TIMEOUT = 2000;
}
