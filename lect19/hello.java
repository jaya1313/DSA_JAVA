package lect19;
// file handling  crud(create run update delete)
import java.io.File;

public class hello {
    public static void main(String[] args) {
        File file=new File("new.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created" +file.getName());
                System.out.println("file created"+file.getAbsolutePath());
            }
            else{
                System.out.println("file already existssss");
            }
        }
        catch(Exception e){
              System.err.println(e);
        }
    }
}
