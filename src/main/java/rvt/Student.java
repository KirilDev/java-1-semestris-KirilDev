package rvt;

class Student {
    String name;
    String surname;
    String course;
    int age;
    int courseNumber;
    boolean isGraduated;
    boolean isExamsWritten;


    Student(String name, String surname, String course, int courseNumber, int age, boolean isGraduated, boolean isExamsWritten){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.courseNumber = courseNumber;
        this.age = age;
        this.isGraduated = isGraduated;
        this.isExamsWritten = isExamsWritten;
    }

    void showInfo(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's surname: " + name);
        System.out.println("Student's age: " + age);
        System.out.println("Student's currently studying: " + course);
        System.out.println("Student's current at " + courseNumber + " course");
        System.out.println("Student's graduation status is: " + isGraduated);
        System.out.println("Student's exams status is: " + isExamsWritten);
    }

    public static void main(String[] args){
        Student a242400 = new Student("Kirill", "L.", "Computer Science", 2, 17, false, false );

        a242400.showInfo();
    }
}
