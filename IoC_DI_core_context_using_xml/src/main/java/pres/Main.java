package pres;

import dao.IBuy;
import metier.ITransaction;
import metier.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        IBuy buy = context.getBean(IBuy.class);
        ITransaction transaction = context.getBean(Transaction.class);
        System.out.println(transaction.calulation());
    }
}
