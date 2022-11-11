import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int contadorNoel=0;
    static int contadorReno=0;
    static int contadorFullete=0;

    static String noelForma="\\*<]:-DOo";

    static String renoForma=">:o\\)";

    static String fulleteForma="<]:-D";

    public static void main(String[] args) {
        String linea1 = "[0]-=-=*<]:-DOo##=========";
        String linea2 = "]-=-*<]:-DOo--*=][=>:o)*=**<]:-DOo0-!...";
        String linea3 = "-=-0-o<]:Oo|=--=||++=++=++=>";
        String linea4 = "==|<]:-D";
        contadorDeNoels(linea1);
        contadorDeNoels(linea2);
        contadorDeNoels(linea3);
        contadorDeNoels(linea4);
        System.out.println("Strings______");
        contadorDeNoelsString(linea1);
        contadorDeNoelsString(linea2);
        contadorDeNoelsString(linea3);
        contadorDeNoelsString(linea4);

    }

    public static void contadorDeNoels(String linea){

        Pattern noel= Pattern.compile(noelForma);
        Pattern reno= Pattern.compile(renoForma);
        Pattern elfo= Pattern.compile(fulleteForma);
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
    public static void contadorDeNoelsString(String linea) {
        //Sin este texto sobrante si el fullete esta al final de la linea no lo encuentra
        linea+="textoejemplo";


        String[] arrayNoel = linea.split(noelForma);
        contadorNoel=arrayNoel.length-1;
        if (contadorNoel>0) {
            System.out.print("Para noel (" + contadorNoel + ") ");

        }
        String[] arrayReno = linea.split(renoForma);
        contadorReno=arrayReno.length-1;
        if (contadorReno>0) {
            System.out.print("Reno (" + contadorReno + ") ");

        }
        String[] arrayFullete = linea.split(fulleteForma);
        contadorFullete=(arrayFullete.length-1)-(arrayNoel.length-1);
        if (contadorFullete>0) {
            System.out.print("Elfo (" + (contadorFullete) + ")");

        }
        System.out.println();

    }
}


