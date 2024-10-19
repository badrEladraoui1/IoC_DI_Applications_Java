package dao;

public class CalculV1 implements ICalcul{
    @Override
    public int getValue() {
        System.out.println("First Vesrion ");
        return 100;
    }
}
