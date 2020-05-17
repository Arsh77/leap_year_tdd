package test.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestLeapYear.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println("failed test : "+ failure.toString());
      }
		
      System.out.println("All test cases run without failure : "+ result.wasSuccessful());
   }
}