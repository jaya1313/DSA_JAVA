package lect19;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//insert data in new file.

public class apend {
    static void writeData(String data){
    try{
        FileWriter writer=new FileWriter("new.txt",true);
        writer.write(data);
        writer.close();
    }
    catch(Exception e){
        System.out.println(e);

    }
}
// read the data
static void fileRead(){
    try{
        FileReader reader =new FileReader("new.txt");
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char) ch);
        }
    }catch(Exception e){
        System.out.println(e);
    }
}

// delete the data
static void fileDelete(){
    try{
        File file=new File("new.txt");
        if(file.delete()){
            System.out.println("file delete");
        }
        else{
            System.out.println("nooo");
        }
    }catch(Exception e){
       System.out.println(e);
    }
}

static void fileCreate(){
      try{
        File file=new File("new.txt");
        if(file.createNewFile()){
            System.out.println("file created");
        }
        else{
            System.out.println("already exists");
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
}
public static void main(String[] args) {
    // writeData("hello old data hiii");
   // fileRead();
   // fileDelete();
    fileCreate();

}
}