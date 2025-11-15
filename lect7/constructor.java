// constructor

// class Car{
//     Car(int a){
//         System.out.println("hello");
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Car s1=new Car(5);
//     }
// }

//parameterised constructor with different parametrs

class  Car{
    int a;
    String name;
    Car(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("name"+" "+name);
        System.out.println("a"+" "+a);
    }
}

class Main{
    public static void main(String[] args){
        Car c1=new Car(5,"jain");
        Car c2=new Car(6,"sharma");
        Car c3=new Car(6,"mishra");
    }
}