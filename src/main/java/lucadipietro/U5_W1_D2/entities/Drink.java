package lucadipietro.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends MenuElement {
    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", calories=" + getCalories() +
                '}';
    }
}
