package view;

import db.EmployeeDB;
import models.Employee;

import java.util.Date;
import java.util.Scanner;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeDB db = new EmployeeDB();



    /**
     * Show the interface to add a employee to the db
     */
    public void showAddEmployee() {
        System.out.println("Id: ");
        String id = scanner.next();

        System.out.println("Prename: ");
        String prename = scanner.next();

        System.out.println("Surname: ");
        String surname = scanner.next();

        System.out.println("jobDescription: ");
        String jobDescription = scanner.next();

        System.out.println("birthdate: ");
        String birthdate = scanner.next();

        System.out.println("salary: ");
        Double salary = scanner.nextDouble();

        System.out.println("employmentDate: ");
        String employmentDate = scanner.next();

        Employee employee = new Employee(id, prename, surname, jobDescription, birthdate, salary, employmentDate);

    }

    /**
     * Show the interface to edit a employee to the db
     */
    public void showEditEmployee() {
        //TODO: implement
    }

    /**
     * Show the list of all employees from the db
     */
    public void showListEmployees() {
        //TODO: implement
    }

    /**
     * Show the interface to delete a employee
     */
    public void showDeleteEmployee() {
        //TODO: implement
    }

    /**
     * Internal method to print out a employee
     * @param employee to show
     */
    private void showEmployee(Employee employee) {
        //TODO: implement
    }

}
