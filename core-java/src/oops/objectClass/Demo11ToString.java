package oops.objectClass;

import lombok.AllArgsConstructor;

public class Demo11ToString {
    public static void main(String[] args) {
        @AllArgsConstructor
        class Student {
            int id;
            String name;

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        Student student = new Student(1, "Sachin");
        System.out.println(student.toString());
        System.out.println(student);
    }
}
