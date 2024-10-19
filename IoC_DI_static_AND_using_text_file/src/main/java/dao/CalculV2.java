package dao;

public class CalculV2 implements ICalcul{
    @Override
    public int getValue() {
        System.out.println("Extension ");
        return 150;
    }
}
