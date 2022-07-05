package com.bz.mvnp.Day20JunitProb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	
	public static boolean matchFirstName(String str) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchLastName(String str) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public boolean matchEmail(String str) {
		Pattern p = Pattern.compile("^(abc)[0-9+.-]*(@)[0-9a-z]{1,}(.)[a-z]{3,}(.[a-z]{1,})*$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}

	
}
