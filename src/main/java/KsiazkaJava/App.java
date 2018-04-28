package KsiazkaJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    public static void main( String[] args )
            throws IOException {

        System.out.println("Policzę pole Twojego Prostokąta");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a, b, pole;


        System.out.println("Podaj długość boku a");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj długość boku b");
        b = Double.parseDouble(br.readLine());


        pole = a * b;

        System.out.println("Pole prostokąta o wymiarze a = " + a + " cm oraz o wymiarze b " + b + " cm");
        System.out.println("wynosi dokładnie " + pole + " cm ");

    }}3