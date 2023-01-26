import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Bet;

public class App {
    public static void main(String[] args) throws Exception {

        File path = new File("/home/luiz/software/csv/leitorcsv/archive/csvfiles.csv");
        Scanner sc = null;
        List<Bet> bets = new ArrayList<Bet>();

        int position = 0;
        try {
            sc = new Scanner(path);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                String[] vectLine = line.split(";");
                System.out.println(vectLine[0]);
                int numero = Integer.parseInt(vectLine[0].trim());
                String color   = vectLine[1].trim();
                String minutos = vectLine[2].trim();
                String  data   = vectLine[3].trim();
                Float apostaNoVermelho = Float.parseFloat(vectLine[4].trim());
                Float apostaNoBranco   = Float.parseFloat(vectLine[5].trim());
                Float apostaNoPreto    = Float.parseFloat(vectLine[6].trim());
                String seed = vectLine[7].trim(); 
                Bet bet = new Bet(numero, color, minutos, data, apostaNoVermelho, apostaNoBranco, apostaNoPreto, seed);
                bets.add(bet);
                bets.get(position);
                position++;
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
