package com.flip.steps;
import com.flip.utility.FunctionLibrary;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
public class Hooks  extends FunctionLibrary{
	@Before("@Fb")
	public void beforeScenario() {

		System.out.println("Start time " + System.currentTimeMillis());

	}
	@After("@Fb")
	public void afterScenario() {

		System.out.println("End time " + System.currentTimeMillis());

	}

}
