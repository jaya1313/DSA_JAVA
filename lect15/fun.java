package lect15;

public class fun {
    static void fun(int a){
        if(a>0){
            fun(--a);
            System.out.println(a);
        }
    }
}
