package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    void testRetrieveEmployeesWithLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee gregKovalsky = new Employee("Greg", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(gregKovalsky);
        List<Employee> kovalskies = employeeDao.retrieveEmployeesWithLastName("Kovalsky");

        //Then
        assertEquals(2, kovalskies.size());

        //Cleanup
        employeeDao.deleteAll();
    }

    @Test
    void testRetrieveCompanyByFirstThreeLetters() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company greyMatter = new Company("Grey Matter");
        Company greyHound = new Company("Grey Hound");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(greyHound);
        companyDao.save(greyMatter);
        List<Company> greys = companyDao.retrieveCompanyByFirstThreeLetters("gre");

        //Then
        assertEquals(2, greys.size());

        //Cleanup
        companyDao.deleteAll();
    }
}