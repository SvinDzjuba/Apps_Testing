package tests;

import classes.bank;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankTest {
    public BankTest() {}

    @Test
    public void deposit_test1() {
        bank obj = new bank();
        double input_percentage = 25;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test2() {
        bank obj = new bank();
        double input_percentage = 24;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else if (input_percentage >= 25) {
            System.out.println("Percentage is 25 or more!");
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        } else if (input_percentage <= 0) {
            System.out.println("Percentage is 0 or less!");
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test3() {
        bank obj = new bank();
        double input_percentage = 0;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test4() {
        bank obj = new bank();
        double input_percentage = -1;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
}
