// check string is ardum
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
          String str="hello";
          String str2="lloeh";
          char ch1[]=str.toCharArray();
          char ch2[]=str2.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
          String a=new String(ch1);  
          String b=new String(ch2);
          if(a.equals(b)){
              System.out.println(true);
          }
          else{
              System.out.println("false");
          }
    }
}