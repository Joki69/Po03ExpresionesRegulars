import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String linea1 = "[0]-=-=*<]:-DOo##=========";
        String linea2 = "]-=-*<]:-DOo--*=][=>:o)*=**<]:-DOo0-!...";
        String linea3 = "-=-0-o<]:Oo|=--=||++=++=++=>";
        String linea4 = "==|<]:-D";
        contadorDeNoels(linea1);
        contadorDeNoels(linea2);
        contadorDeNoels(linea3);
        contadorDeNoels(linea4);

        String[] splited = linea1.split("\\b+"); //split on word boundries
        String[] splited2 = linea2.split("\\b+"); //split on word boundries
        String[] splited3 = linea3.split("\\b+"); //split on word boundries
        String[] splited4 = linea4.split("\\b+"); //split on word boundries
        System.out.println("Search Noel :"+ Arrays.asList(splited).contains("\\*<]:-DOo"));
        System.out.println("Search Noel :"+ Arrays.asList(splited2).contains("\\*<]:-DOo"));
        System.out.println("Search Noel :"+ Arrays.asList(splited3).contains("\\*<]:-DOo"));
        System.out.println("Search Noel :"+ Arrays.asList(splited4).contains("\\*<]:-DOo"));

    }

    public static void contadorDeNoels(String linea){

        Pattern noel= Pattern.compile("\\*<]:-DOo");
        Pattern reno= Pattern.compile(">:o\\)");
        Pattern elfo= Pattern.compile("<]:-D");


        int contadorNoel=0;
        int contadorReno=0;
        int contadorFullete=0;
        Matcher mN = noel.matcher(linea);
        Matcher mR = reno.matcher(linea);
        Matcher mE = elfo.matcher(linea);

        while (mN.find()){
            contadorNoel++;
        }
        if (contadorNoel>0) {
            System.out.print("Para noel (" + contadorNoel + ") ");
        }
        while (mR.find()) {
                contadorReno++;
            }
        if (contadorReno>0) {
            System.out.print("Reno (" + contadorReno + ") ");
        }
        while (mE.find()){
            contadorFullete++;
        }
        contadorFullete=contadorFullete-contadorNoel;
        if (contadorFullete>0) {
            System.out.print("Elfo (" + (contadorFullete) + ")");
        }
        System.out.println();

    }
}