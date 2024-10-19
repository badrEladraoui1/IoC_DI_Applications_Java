package dao;

import org.springframework.stereotype.Component;

@Component("buy2")
public class BuyV2 implements IBuy{

    private int value = 20;

    @Override
    public int get() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
