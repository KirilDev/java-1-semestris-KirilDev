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

    void suggestInternship(){
        if (course == 3 && isExamsWritten == true) {
            System.out.println("Congrats on exams! You can get full-time internship to finish your education!");
        }
        else if (course == 3 && isExamsWritten == false) {
            System.out.println("Student can get part-time internship since he'll write exams soon...");
        }
        else{
            System.out.println("You're not allowed to get internship");
        }
    }
    public static void main(String[] args){
        Student a242400 = new Student("Kirill", "L.", "Computer Science", 2, 17, false, false );
        Student a242100 = new Student("Akita", "Light", "Computer Science", 3, 19, false, true)

        a242400.showInfo();
        a242400.suggestInternship();

        a242100.showInfo();
        a242100.suggestInternship();
    }
}
