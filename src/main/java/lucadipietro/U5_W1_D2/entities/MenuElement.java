package lucadipietro.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class MenuElement {
    private String name;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return "MenuElement{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
