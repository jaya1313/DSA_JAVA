// questions on class and object
// date: 11.11.25
// java practice shhet ques 1

class Student {
    String name;
    int rollno;
    double marks;
    void display() {
        System.out.println("name" + " " + name);
        System.out.println("rollno" + " " + rollno);
        System.out.println("marks" + " " + marks);
    }
}

class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="jaya karwani";
        s1.rollno=150;
        s1.marks=85;
        Student s2=new Student();
        s2.name="bhoomi karwani";
        s2.rollno=98;
        s2.marks=87;
        Student s3=new Student();
        s3.name="kamini mishra";
        s3.rollno=160;
        s3.marks=75;
        s1.display();
        s2.display();
        s3.display();
    }
}
