package lucadipietro.U5_W1_D2;

import lucadipietro.U5_W1_D2.entities.*;
import lucadipietro.U5_W1_D2.enums.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;

    private double coverCharge;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);
        Table table1 = (Table) ctx.getBean("getTable");

        Pizza margheritaPizza = (Pizza) ctx.getBean("getMargheritaPizza");
        Pizza salamiPizza = (Pizza) ctx.getBean("getSalamiPizza");
        Pizza hawaiianPizza = (Pizza) ctx.getBean("getHawaiianPizza");
        Drink water = (Drink) ctx.getBean("getWater");
        Drink lemonade = (Drink) ctx.getBean("getLemonade");

        coverCharge = (double) ctx.getBean("getCoverCharge");

        Order order1 = new Order(1, table1, Arrays.asList(margheritaPizza,salamiPizza,hawaiianPizza,water,lemonade), OrderStatus.SERVED,5,coverCharge);

    }
}

