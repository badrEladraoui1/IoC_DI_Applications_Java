package metier;

import dao.IBuy;

public class Transaction implements ITransaction{

    IBuy buy;

    @Override
    public int calulation() {
        return this.buy.get() * 10;
    }

    public void setBuying(IBuy buy) {
        this.buy = buy;
    }
}
