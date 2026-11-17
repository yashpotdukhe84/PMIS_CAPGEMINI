import java.io.FileReader;
import java.io.IOException;

public class throwsExample {

    static  void readfile()throws IOException{

        FileReader file = new  FileReader("data.txt");
        System.out.println("file opened");
    }

    public static void main(String[] args) {
        try{
            readfile();
        }catch(IOException e){
            System.out.println("could not find the file");
        }
        
    }
}
