package metier;

import dao.IBuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("transaction")
public class Transaction implements ITransaction{

    @Autowired
    @Qualifier("buy1")
    IBuy buy;

    @Override
    public int calulation() {
        return this.buy.get() * 20;
    }

    public void setBuying(IBuy buy) {
        this.buy = buy;
    }
}
