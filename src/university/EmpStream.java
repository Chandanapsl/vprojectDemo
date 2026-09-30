package university;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmpStream {
    public static void main(String[] args) {
        
        List<Employee> emps=Arrays.asList(new Employee(1,"xabc","tech"),
        new Employee(2,"lakshman","finance"),
        new Employee(3,"sri","tech"));

      List<Integer> l=  emps.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("TECH"))
        .map(emp ->emp.getId()).sorted()
        .collect(Collectors.toList()) ;
       // .forEach((name) -> System.out.println("employee names with department tech "+ name));
       System.out.println(l);

    }
}
