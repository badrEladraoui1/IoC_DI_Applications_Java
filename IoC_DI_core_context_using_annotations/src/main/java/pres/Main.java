package pres;

import metier.ITransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        ITransaction transaction = context.getBean(ITransaction.class);
        System.out.println(transaction.calulation());
    }
}
