package lucadipietro.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;
import lucadipietro.U5_W1_D2.enums.PizzaType;
import java.util.List;

@Getter
@Setter
public class Pizza extends MenuElement{
    private List<Topping> toppings;
    private PizzaType size;

    public Pizza(String name, int calories, double price, List<Topping> toppings, PizzaType size) {
        super(name, calories, price);
        this.toppings = toppings;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", calories=" + getCalories() +
                ", toppings=" + toppings +
                ", size=" + size +
                '}';
    }
}
