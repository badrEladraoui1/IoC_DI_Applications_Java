package dao;

import org.springframework.stereotype.Component;

@Component("buy1")
public class BuyV1 implements IBuy{

    private int value = 10;

    @Override
    public int get() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
