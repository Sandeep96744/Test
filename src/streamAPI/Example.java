package streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate date;

    public Employee(int id, String name, double salary, LocalDate date) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}

public class Example {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Harsh", 50000, LocalDate.parse("2021-01-01"));
        Employee emp2 = new Employee(102, "Karan", 45000, LocalDate.parse("2022-01-01"));
        Employee emp3 = new Employee(103, "Lokesh", 55000, LocalDate.parse("2023-01-01"));
        Employee emp4 = new Employee(104, "Karan", 40000, LocalDate.parse("2023-02-01"));

        List<Employee> employees = new ArrayList<>(List.of(emp1, emp2, emp3, emp4));

//        int id = 103;
//        Employee emp = employees.stream().filter(e -> (e.getId() == id))
//                                         .map(e -> {
//                                             e.setSalary(e.getSalary() * 1.20);
//                                             return e; })
//                                         .findFirst().orElse(null);
//
//        if(emp != null) System.out.println(emp);
//        else System.out.println("Employee Not Found...");



        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);
        employeeMap.put(emp4.getId(), emp4);

        String name = "Karan";
        List<Employee> empList = employeeMap.values().stream().filter(e -> e.getName().equals(name)).toList();

        if(empList.isEmpty()) System.out.println("Employee Not Found...");

        for(Employee e: empList) System.out.println(e);
    }
}
