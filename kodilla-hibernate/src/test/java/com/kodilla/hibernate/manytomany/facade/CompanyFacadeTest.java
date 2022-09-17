package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyFacadeTest {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    void testRetrieveMatchingCompanies() {
        //Given
        Company evil = new Company("Evil Corporation");
        Company good = new Company("Good Corporation");
        Company neutral = new Company("Neutral Company");

        Employee johnKovalsky = new Employee("John", "Kovalsky");
        Employee johnWayne = new Employee("John", "Wayne");
        Employee emilyKovalsky = new Employee("Emily", "Kovalsky");

        evil.getEmployees().add(johnWayne);
        evil.getEmployees().add(johnKovalsky);
        good.getEmployees().add(emilyKovalsky);
        neutral.getEmployees().add(emilyKovalsky);

        johnKovalsky.getCompanies().add(evil);
        johnWayne.getCompanies().add(evil);
        emilyKovalsky.getCompanies().add(good);
        emilyKovalsky.getCompanies().add(neutral);

        //When
        companyDao.save(evil);
        int evilId = evil.getId();
        companyDao.save(good);
        int goodId = good.getId();
        companyDao.save(neutral);
        int neutralId = evil.getId();

        List<Employee> matchingEmployees = companyFacade.returnMatchingEmployees("Kovalsky");
        List<Company> matchingCompanies = companyFacade.returnMatchingCompanies("Corp");

        //Then
        assertEquals(2, matchingEmployees.size());
        assertEquals(2, matchingCompanies.size());

        //Cleanup

        companyDao.deleteById(evilId);
        companyDao.deleteById(goodId);
        companyDao.deleteById(neutralId);
    }

}