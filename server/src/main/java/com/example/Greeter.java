package com.example;
import org.junit.Before;
import org.junit.Test;

public class Greeter {
  public Greeter() {
  }
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
