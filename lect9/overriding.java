// overriding same as polymorphism in c++
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
}
class Main{
  public static void main(String[] args){
   Animal a=new dog();
   a.eat();
   dog d=new dog();
   d.eat();
  }
}
