package lucadipietro.U5_W1_D3;

import lucadipietro.U5_W1_D3.entities.*;
import lucadipietro.U5_W1_D3.entities.Order;
import lucadipietro.U5_W1_D3.enums.OrderStatus;
import lucadipietro.U5_W1_D3.enums.PizzaType;
import lucadipietro.U5_W1_D3.enums.TableStatus;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5W1D3ApplicationTests {

	@Test
	void drinkCreation() {
		System.out.println("Test per la corretta creazione di un drink");
		Drink drink = new Drink("Water",0,1.29);
		assertEquals("Water",drink.getName());
		assertEquals(0,drink.getCalories());
		assertEquals(1.29,drink.getPrice());
	}

	@Test
	void pizzaCreation(){
		System.out.println("Test per la corretta creazione di una pizza");
		Topping salamePiccante = new Topping("Salame Piccante",34,3.99);
		Topping tomato = new Topping("Pomodoro",0,2.99);
		Topping mozzarella = new Topping("Mozzarella",28,3.99);
		Pizza pizza = new Pizza("Diavola",205,6.99, Arrays.asList(salamePiccante,tomato,mozzarella), PizzaType.REGULAR);
		assertEquals("Diavola",pizza.getName());
		assertEquals(205,pizza.getCalories());
		assertEquals(6.99,pizza.getPrice());
		assertEquals(Arrays.asList(salamePiccante,tomato,mozzarella),pizza.getToppings());
		assertEquals(PizzaType.REGULAR,pizza.getSize());
	}

	@ParameterizedTest
	@CsvSource({"1,4,7.5,3.5,2.5,21","2,2,5.5,3.5,1.5,12"})
	void calculateTotalCost(int orderNumber, int numSeats, double pizzaPrice, double drinkPrice, double coverCharge, double expectedTotal){
		System.out.println("Test per verificare il calcolo del costo totale");
		Table table = new Table(1,5, TableStatus.BUSY);
		Topping salamePiccante = new Topping("Salame Piccante",34,3.99);
		Topping tomato = new Topping("Pomodoro",0,2.99);
		Topping mozzarella = new Topping("Mozzarella",28,3.99);
		Pizza pizza = new Pizza("Diavola",205,pizzaPrice, Arrays.asList(salamePiccante,tomato,mozzarella), PizzaType.REGULAR);
		Drink drink = new Drink("Water",0,drinkPrice);
		Order order = new Order(orderNumber,table,Arrays.asList(pizza,drink), OrderStatus.READY,numSeats,coverCharge);
        assertEquals(expectedTotal,order.getTotalCost());
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("BEFOREALL");
	}

	@AfterAll
	static void afterAll(){
		System.out.println("AFTERALL");
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("BEFOREEACH");
	}

	@AfterEach
	void afterEach(){
		System.out.println("AFTEREACH");
	}

}
