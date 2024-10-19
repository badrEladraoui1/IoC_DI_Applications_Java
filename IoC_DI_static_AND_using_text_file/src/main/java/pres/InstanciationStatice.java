package pres;

import dao.CalculV1;
import dao.CalculV2;
import dao.ICalcul;
import metier.Gestion;

public class InstanciationStatice {
    public static void main(String[] args) {
        ICalcul calcul = new CalculV2();
        Gestion gestion = new Gestion();
        // injection
        gestion.setCal(calcul);
        System.out.println(gestion.calcul());
    }
}
