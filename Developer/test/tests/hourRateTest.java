package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import developer.DeveloperLogic;
import developer.Developer;

public class hourRateTest {
    public hourRateTest() {}
    
    @Test
    public void hour_rate_test1() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Front-end developer");
        developer.setSalary(2000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(24, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test2() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Back-end developer");
        developer.setSalary(4000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(25, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test3() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Full-stack developer");
        developer.setSalary(8000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(40.23, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test4() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirsName("Maksim");
        developer.setLastName("Dzjubenko");
        developer.setSpecialty("Full-stack developer");
        developer.setSalary(-4760);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(0, thisDevHourSalary, 0.01);
    }
}
