package lect11;

// pdf questions on interface

interface walkable{
    abstract void walk();
}
interface runnable{
   abstract void run();
}
class human implements walkable,runnable{
    public void walk(){
        System.out.println("I am walking");
    }
    public void run(){
        System.out.println("I am running");
    }
}
public class main {
    public static void main(String[] args) {
        human h1=new human();
        h1.walk();
        h1.run();
    }
}
