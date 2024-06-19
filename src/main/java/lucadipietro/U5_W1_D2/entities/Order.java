package lucadipietro.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucadipietro.U5_W1_D2.enums.OrderStatus;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Order {
    private int orderNumber;
    private Table table;
    private List<MenuElement> menuElements;
    private OrderStatus orderStatus;
    private int numSeats;
    private LocalDate orderTime;
    private double totalCost;

    public Order(int orderNumber, Table table, List<MenuElement> menuElements, OrderStatus orderStatus, int numSeats, double coverCharge) {
        this.orderNumber = orderNumber;
        this.table = table;
        this.menuElements = menuElements;
        this.orderStatus = orderStatus;
        this.numSeats = numSeats;
        this.orderTime = LocalDate.now();
        this.totalCost = calculateTotalCost(coverCharge);
    }

    private double calculateTotalCost(double coverCharge) {
        double cost = numSeats * coverCharge;
        for (MenuElement element : menuElements) {
            cost += element.getPrice();
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", table=" + table +
                ", menuElements=" + menuElements +
                ", orderStatus=" + orderStatus +
                ", numSeats=" + numSeats +
                ", orderTime=" + orderTime +
                ", totalCost=" + totalCost +
                '}';
    }
}
