// inheritance
//single level inheritance
//Q8 in sheet
// class Employee{
//     void work(){
//         System.out.println("employee is working");
//     }
// }
// class Manager extends Employee{
//     void attendMeeting(){
//         System.out.println("manager is attending a meeting");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Manager m1=new Manager();
//         m1.work();
//         m1.attendMeeting();
//     }
// }

//Q12 in sheet
class Book{
    void read(){
        System.out.println("reading a book");
    }
}
class Novel extends Book{
    void storyLine(){
        System.out.println("the novel has storyline");
    }
}
class Main{
    public static void main(String[] args){
         Novel n= new Novel();
         n.read();
         n.storyLine();
    }
}

