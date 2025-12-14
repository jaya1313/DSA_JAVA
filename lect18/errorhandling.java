package lect18;

public class errorhandling {
    public static void main(String[] args) {
        try{
            riskyMethod();
        }
        catch(Exception e){
            System.out.println("main handles this");
        }
        System.out.println("program continue....");
    }
    static void riskyMethod() throws ArithmeticException{
        System.out.println("risky Method starts");
        int result=10/0;
        System.out.println("result:"+result);
        System.out.println("risky method end");
    }
}
