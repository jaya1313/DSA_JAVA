// methods in java is same as functions in c++ but difference is in only usecase that if we make a function under the class then it is konwn as methods which is probably in java.
// instant variable method that can be called by making a function.


// class hello{
//     void sum(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args){
//         hello obj=new hello();
//         obj.sum();

//     }
// }

//static method that can be called directly

// class hello{
//     static void sum(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args){
//        // hello obj=new hello();
//         sum();

//     }
// }

// a new class in this program

class Car{
    static String name="hello";
   static void Sum(){
        System.out.println(name);
    }
}

class methods{
    public static void main(String[] args){
        //Car obj=new Car();
        Car.Sum();
    }
}

