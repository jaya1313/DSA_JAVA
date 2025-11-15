// method overloading

class Main{
    void add(int a){
        System.out.println(a);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Main m=new Main();
        m.add(5);
        m.add(5,6);
        m.add(3,2,1);
    }
}