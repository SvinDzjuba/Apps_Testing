package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import developer.DeveloperLogic;
import developer.Developer;

public class annualSalaryTest {
    public annualSalaryTest() {}
    
    @Test
    public void annual_salary_test1() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Cybersecurity");
        developer.setSalary(6045);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(80000, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void annual_salary_test2() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Cybersecurity");
        developer.setSalary(6045);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(72540, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void annual_salary_test3() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Cybersecurity");
        developer.setSalary(1205);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(14460.2, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void annual_salary_test4() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Cybersecurity");
        developer.setSalary(-50);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(80000, thisDevAnnualSalary, 0.01);
    }
}
