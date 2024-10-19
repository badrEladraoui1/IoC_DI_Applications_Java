package pres;

import dao.ICalcul;
import metier.Gestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String calculClass = scanner.nextLine();
        System.out.println(calculClass);

        Class cCalcul = Class.forName(calculClass);
        ICalcul calcul = (ICalcul) cCalcul.getConstructor().newInstance();
        System.out.println(calcul.getValue());

        String gestionClass = scanner.nextLine();
        System.out.println(gestionClass);
        Class cGestion = Class.forName(gestionClass);
        Gestion gestion = (Gestion) cGestion.getConstructor().newInstance();

        //injection

        gestion.setCal(calcul);
        System.out.println(gestion.calcul());

    }
}
