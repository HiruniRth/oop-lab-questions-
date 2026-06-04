
package com.mycompany.lab8;

public class StudentInsertMain {
    public static void main(String[] args) {

        Student s1 =new Student(1,"Nimal Perera",82);

        StudentDAO dao =new StudentDAO();

        dao.addStudent(s1);
    }

}
