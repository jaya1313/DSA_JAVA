// interface (the way to do multiple inheritance in java)
package lect11;

// interface A{
//     abstract void login();
// }
// class B implements A {
//         public void login(){
//             System.out.println("hiiiiiii");
//         }
// }
//  class hello {
//     public static void main(String[] args) {
//         B s1=new B();
//         s1.login();
//     }
// }

// multiple inheritance using interfaces
interface A{
    abstract void login();
}

interface B{
    abstract void login();
}

class C implements A,B{
    public void login(){
    System.out.println("hello");
    }
}

class hello{
    public static void main(String[] args) {
        C s1=new C();
        s1.login();
    }
}