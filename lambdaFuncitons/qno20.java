package lambdaFuncitons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 20. Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute. 
public class qno20 {
    public static void main(String[] args) {

        class Student {
            private String name, SClass;
            private Integer age;

            public Student(String name, Integer age, String SClass) {
                this.name = name;
                this.age = age;
                this.SClass = SClass;
            }

            public String getName() {
                return name;
            }

            public Integer getAge() {
                return age;
            }

            public String getSClass() {
                return SClass;
            }
        }

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Adriana Jamie", 15, "X"));
        studentsList.add(new Student("Felix Uisdean", 15, "X"));
        studentsList.add(new Student("Conceicao Palmira", 14, "X"));
        studentsList.add(new Student("Jair Camila", 14, "X"));
        studentsList.add(new Student("Micaela Rosana", 15, "X"));

        System.out.println("Original Details: ");
        for (Student student : studentsList) {
            System.out.println();
            System.out.print("Name: " + student.getName());
            System.out.print(",Age: " + student.getAge());
            System.out.print(",SClass: " + student.getSClass());
            System.out.println();
        }

        // using sort directly changes the original string instead use the one below
        // this section
        // studentsList.sort(Comparator.comparing(Student::getName));
        // to reverse use code below
        // studentsList.sort(Comparator.comparing(Student::getName).reversed());

        // code below compares string witout chanign original list
        List<Student> sortedStudentsList = studentsList.stream()
                .sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println();
        System.out.println("Sorted students list: ");
        for (Student student : sortedStudentsList) {
            System.out.println();
            System.out.print("Name: " + student.getName());
            System.out.print(",Age: " + student.getAge());
            System.out.print(",SClass: " + student.getSClass());
            System.out.println();
        }
    }
}
