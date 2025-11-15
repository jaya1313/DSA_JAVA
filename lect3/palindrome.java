//palindrome

 // class main{
//     public static void main(String[] args){
//         String a="aba";
//         String b="";
//         for(int i=a.length()-1;i>=0;i--){
//             b=b+a.charAt(i);
//         }
//         if(a.equals(b)){
//             System.out.println("string is palindrome");
//         }
//         else{
//             System.out.println("string is not palindrome");
//         }
//     }
// }

//split function
class Main{
    public static void main(String[] args){
        String str="java cpp c php js";

        // String a[]=str.split(" ");
        // for(String val: a){
        //     System.out.println(val);

        String a[]=str.split("");
        for(String val: a){
            System.out.println(val);
        }

    }
}