/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author VSIT
 */
public class Employee implements Comparable<Employee> {

    private String code;
    private String name;
    private int salary;

    // constructors:
    public Employee() {
    }

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    // getters and setters:
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // to format the results to print:
    public void print() {
        System.out.printf("%1$-4s    %2$-40s    %3$-5d\n", code, name, salary);
    }

    // to sort the list employee
    @Override
    public int compareTo(Employee o) {
        return this.getCode().compareTo(o.getCode());
    }

}
