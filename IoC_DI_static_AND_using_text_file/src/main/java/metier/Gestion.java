package metier;

import dao.ICalcul;

public class Gestion implements IGestion{

    ICalcul calcul;

    @Override
    public int calcul() {
        return this.calcul.getValue()*10;
    }

    //setter for injection

    public void setCal(ICalcul c){
        this.calcul = c;
    }

}
