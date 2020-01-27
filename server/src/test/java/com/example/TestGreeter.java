package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
    System.out.println("**** Executing first unit Test case ****");
    assertThat(greeter.greet(someone), containsString(someone));
	System.out.println("**** first unit Test case passed****");
    
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";
    System.out.println("**** Executing second unit Test case ****");
    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
	System.out.println("**** second unit Test case passed**");
  }
}
