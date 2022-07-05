package com.bz.mvnp.Day20JunitProb;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.BeforeClass;

public class AppTest {

	private final String email;
	boolean expectedResult;
	static App calci;

	@BeforeClass
	public static void init() {
		calci = new App();
	}

	public AppTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc@gmail.com.com", true }, { "abc+100@gmail.com", true }, { "abc", false },
				{ "abc@.com.my", false }, { "abc123@gmail.a", false }, { "abc123@.com", false },
				{ "abc123@.com.com", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
				{ "abc@%*.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
				{ "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
	}

	@Test
	public void happyTest() {
		boolean result = App.matchFirstName("Piyush");
		boolean expected = true;
		Assert.assertEquals(result, expected);
	}

	@Test
	public void sadTest() {
		boolean result = App.matchLastName("patil");
		boolean expected = true;
		Assert.assertEquals(result, expected);
	}

}
