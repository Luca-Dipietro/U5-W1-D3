package lucadipietro.U5_W1_D2;

import lombok.Value;
import lucadipietro.U5_W1_D2.entities.*;
import lucadipietro.U5_W1_D2.enums.PizzaType;
import lucadipietro.U5_W1_D2.enums.TableStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {
    @Bean
    public Topping getTomato(){
        return new Topping("Tomato",18,0.49);
    }

    @Bean
    public Topping getCheese(){
        return new Topping("Cheese",92,0.69);
    }

    @Bean
    public Topping getHam(){
        return new Topping("Ham",35,0.99);
    }

    @Bean
    public Topping getOnions(){
        return new Topping("Onions",22,0.69);
    }

    @Bean
    public Topping getPineapple(){
        return new Topping("Pineapple",24,0.79);
    }

    @Bean
    public Topping getSalami(){
        return new Topping("Salami",86,0.99);
    }

    @Bean
    public Pizza getMargheritaPizza(){
        return new Pizza("Pizza Margherita",1104,4.99, Arrays.asList(getTomato(), getCheese()), PizzaType.REGULAR);
    }

    @Bean
    public Pizza getMargheritaPizzaXL(){
        return new Pizza("Pizza Margherita",1504,8.99, Arrays.asList(getTomato(), getCheese()), PizzaType.XL);
    }

    @Bean
    public Pizza getHawaiianPizza(){
        return new Pizza("Hawaiian Pizza",1024,6.49,Arrays.asList(getTomato(), getCheese(), getPineapple(), getHam()),PizzaType.REGULAR);
    }

    @Bean
    public Pizza getHawaiianPizzaXL(){
        return new Pizza("Hawaiian Pizza",1504,10.49,Arrays.asList(getTomato(), getCheese(), getPineapple(), getHam()),PizzaType.XL);
    }

    @Bean
    public Pizza getSalamiPizza(){
        return new Pizza("Salami Pizza",1160,5.99,Arrays.asList(getTomato(), getCheese(), getSalami()),PizzaType.REGULAR);
    }

    @Bean
    public Pizza getSalamiPizzaXL(){
        return new Pizza("Salami Pizza",1606,9.99,Arrays.asList(getTomato(), getCheese(), getSalami()),PizzaType.XL);
    }

    @Bean
    public Drink getWater(){
        return new Drink("Water",0,1.29);
    }

    @Bean
    public Drink getLemonade(){
        return new Drink("Lemonade",128,1.29);
    }

    @Bean
    public Drink getWine(){
        return new Drink("Wine",607,7.49);
    }

    @Bean
    public Table getTable(){
        return new Table(1,8, TableStatus.BUSY);
    }

    @Bean
    public double getCoverCharge(@Value("${cover.charge}") double coverCharge){
        return coverCharge;
    }

}
