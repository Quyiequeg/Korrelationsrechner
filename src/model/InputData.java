package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    // List<Float> firstParameterList = new ArrayList<>();
    // List<Float> secParameterList = new ArrayList<>();
    // System.out.println("Eingabe der Daten für Parameter A");
    // fillParameterLists(firstParameterList);
    // System.out.println("Eingabe der Daten für Parameter B");
    // fillParameterLists(secParameterList);

    // System.out.println();
    // firstParameterList.forEach(x -> System.out.print("|" + x));
    // System.out.println("|");
    // secParameterList.forEach(x -> System.out.print("|" + x));
    // System.out.println("|");

    public void fillParameterLists(List<Float> parameterList) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextFloat()) {
            parameterList.add(sc.nextFloat());
            sc = new Scanner(System.in);
        }
        sc.close();
    }

}
