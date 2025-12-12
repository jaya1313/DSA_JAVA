package lect15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// class Student implements Comparable<Student>{
//     String name;
//     int rolln;

    
//    public Student(int rolln,String name){
//     this.name=name;
//     this.rolln=rolln;
//    }
  
// public int compareTo(Student s1){
//     return this.rolln-s1.rolln;
// }
// public String toString(){
//     return rolln+" "+name;
// }
//  };


// public class hello {
//     public static void main(String[] args) {
//         ArrayList <Student> list =new ArrayList<>();
//         list.add(new Student(1,"om"));
//          list.add(new Student(2,"ankit"));
//          Collections.sort(list);
//          System.out.println(list);
//     }
// }



class Student{
    String name;
    int Rolln;

    public Student(int Rolln,String name){
        this.name=name;
        this.Rolln=Rolln;
    }
    public String toString(){
        return Rolln+" "+name;
    }
}

class NameSorted implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class hello {
    public static void main(String[] args) {
        ArrayList <Student> list =new ArrayList<>();
        list.add(new Student(1,"om"));
         list.add(new Student(2,"ankit"));
         Collections.sort(list,new NameSorted());
         System.out.println(list);
    }
}