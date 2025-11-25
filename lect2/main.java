
// input in java

import java.util.Scanner;
public class main{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

System.out.print("enter integer: ");
int a =sc.nextInt();
System.out.print("enter double: ");
double b=sc.nextDouble();

System.out.print("enter single word: ");
String c=sc.next();           //for single word

System.out.print("enter a sentence ");
String d=sc.nextLine();

System.out.println("Integer:" +a);
System.out.println("Double:" +b);
System.out.println("word:" +c);
System.out.println("Sentence:" +d);
    }
}