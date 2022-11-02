package salary;

public class Salary {
    public Double calculate_salary(double month_salary) {
        double non_taxable_min;
        double income_tax = 20;
        double year_salary = 0;
        
        double start_year_salary = month_salary * 12;
        if(month_salary != 0) {
            if(start_year_salary < 14400) {
                non_taxable_min = 6000;
                double num_to_substr = (start_year_salary - non_taxable_min) * (income_tax / 100);
                year_salary = start_year_salary - num_to_substr;
            }
            else if(start_year_salary > 14400 && start_year_salary < 25200) {
                non_taxable_min = 6000 - 6000 / 10800 * (start_year_salary - 14400);
                double num_to_substr = (start_year_salary - non_taxable_min) * (income_tax / 100);
                year_salary = start_year_salary - num_to_substr;
            }
            else if(start_year_salary > 25200) {
                non_taxable_min = 0;
                double num_to_substr = (start_year_salary - non_taxable_min) * (income_tax / 100);
                year_salary = start_year_salary - num_to_substr;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
        return year_salary;
    }
}
