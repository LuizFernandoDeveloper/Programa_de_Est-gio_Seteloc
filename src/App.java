import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File file = new File("/home/luiz/software/csv/leitorcsv/archive/csvfiles.csv");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }   
        }
    }
}
