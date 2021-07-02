package com.example;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class Greeter {
  public Greeter() {
  }
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
