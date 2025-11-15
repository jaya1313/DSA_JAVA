// remove repeated alphabet

class Main{
    public static void main(String[] args){
        // String str="hello";
        // String newStr="";
        // for(char ch : str.toCharArray()){
        //     if(newStr.indexOf(ch)==-1){
        //         newStr+=ch;
        //     }
        // }
        // System.out.println(newStr);

        // find the largest word in the sentence
        String str="java is powerful";
        String a[]=str.split(" ");
        String largest=" ";
        for( String val : a){
            if(val.length()>largest.length()){
                largest=val;
            }
        }
        System.out.println(largest);

    }
}