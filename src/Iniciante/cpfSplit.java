package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class cpfSplit {
        public static void main(String[] args) {

            Locale.setDefault(new Locale("en", "US"));

            Scanner sc = new Scanner(System.in);

            String[] cpf = new String[4];

            //continue a solucao

            cpf = sc.nextLine().split("\\.");


            for(var i=0;i<cpf.length;i++){
                System.out.printf("%s\n",cpf[i]);
            }

            sc.close();
        }
    }
