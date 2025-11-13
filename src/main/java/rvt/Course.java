package rvt;

import java.util.ArrayList;
import java.util.Scanner;

// class Course {
//     String courseName;
//     ArrayList<Student> students = new ArrayList<Student>();

//     Course(String courseName, ArrayList<Student> students){
//         this.courseName = courseName;
//         this.students = students;
//     }

//     void addStudent(Student student){
//         students.add(student);
//     }

//     void listStudents(){
//         for (int i = 0; i < students.length; i++) {
//             System.out.println(students.get(i));
//         }
//     }
//     public static void main(String[] args){
//         Student firstStudent = new Student("Kirill", 17, 8);
//         Student secondStudent = new Student("Nikita", 16, 7);
//         Student thirdStudent = new Student("Marek", 15, 6);
//     }   
// }
// class Student {
//     String name;
//     int age;
//     ArrayList<Integer> grades = new ArrayList<Integer>();

//     Student(String name, int age, ArrayList<Integer> grades){
//         this.name = name;
//         this.age = age;
//         this.grades = grades;
//     }

//     void addGrade(int grade){
//         grades.add(grade);
//     }
//     void averageGrade(){
//         Integer sum = 0;
//         if(!grades.isEmpty()){
//             sum = sum + grades;
//         }
//         else{
//             System.out.println("List is empty.");
//         }
//         return sum.doubleValue() / grades.size();
//     }
// }
