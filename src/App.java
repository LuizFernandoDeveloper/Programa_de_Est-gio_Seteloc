import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Bet;

public class App {
    public static void main(String[] args) throws Exception {

        File path = new File("/home/luiz/software/csv/leitorcsv/archive/filess.csv");
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
                Integer numero = Integer.parseInt(vectLine[0].toString().trim());
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
                System.out.println(bets.size());;
            }    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }   
        }

        int quantidadePreto = 0 , quantidadeVermelho = 0, quantidadeBranco = 0, maior = 0;
        String color = "";

        for(int i = 0; i<= bets.size()-1; i++){
            if(bets.get(i).getColor().trim().length() == 3){
                quantidadeVermelho ++;
            }
            else if (bets.get(i).getColor().trim().length() == 5){
                quantidadePreto ++;
            }
            else{
                quantidadeBranco ++;
            }
            
        }

        if((quantidadeBranco > quantidadePreto) && (quantidadeBranco > quantidadeVermelho)){
            maior = quantidadeBranco;
            color = "Branco";
        }
        else if((quantidadePreto > quantidadeBranco)&&(quantidadePreto > quantidadeVermelho)){
            maior = quantidadePreto;
            color = "Preto";
        }
        else{
            maior = quantidadeVermelho;
            color = "Vermelho";
        }
        System.out.println("Quantidad de vermelhos: "+quantidadeVermelho);
        System.out.println("Quantidade de Pretos: "+quantidadePreto);
        System.out.println("Quantidade de Brancos:" +quantidadeBranco);
        System.out.println("A cor que tem o maior numero é "+ color +" ,com uma quantidade de: "+ maior);
        int um = 0  , cinco = 0, seis = 0, dez = 0;
        for(int i = 0; i < 299; i++){
            switch (bets.get(i).getNumber()){
                case 1:
                    um++;
                break;
                case 5:
                    cinco ++;
                break;
                case 6:
                    seis++;
                break;
                case 10:
                    dez++;
                break;

            }
        }
        System.out.println();
        System.out.println("A recorencia do numero Um é : "+ um);
        System.out.println("A recorencia do numero Cinco é : "+ cinco);
        System.out.println("A recorencia do numero Seis é : "+ seis);
        System.out.println("A recorencia do numero Dez é : "+ dez);
        String numeroString = "";

        if((um > cinco ) && (um > seis) && (um > dez)){
            maior = um;
            numeroString = "Um";
        }
        else if((cinco > um ) && (cinco > seis) && (cinco > dez)){
            maior = cinco;
            numeroString = "Cinco";
        }
        else if((seis > cinco ) && (seis > um) && (seis > dez)){
            maior = seis;
            numeroString = "Seis";
        }
        else{
            maior = dez;
            numeroString = "Dez";
        }
        System.out.println("O numero com a maior frequência é "+numeroString+" Que foi repetido: "+maior);
        
    }
}
