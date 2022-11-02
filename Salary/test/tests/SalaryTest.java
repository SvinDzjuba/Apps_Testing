package tests;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import salary.Salary;

@RunWith(Parameterized.class)
public class SalaryTest {

    private final double month_salary;
    private final double exp_year_salary;
    private Salary salary;

    @Before
    public void initialize() {
        salary = new Salary();
    }

    @Parameterized.Parameters
    public static Collection salary_values() {
        return Arrays.asList(new Object[][]{
            {0, 450},
            {1000, 10700},
            {15000, 12000},
            {25300, 25000}
        });
    }

    public SalaryTest(double month_salary, double exp_year_salary) {
        this.month_salary = month_salary;
        this.exp_year_salary = exp_year_salary;
    }

    @Test
    public void year_salary_test() {
        if(salary.calculate_salary(month_salary) != null) {
            assertEquals(exp_year_salary, salary.calculate_salary(month_salary), 0.01);
        } else {
            assertEquals(null, "You typed the zero month salary!");
        }
    }
}
