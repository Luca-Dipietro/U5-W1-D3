package lucadipietro.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucadipietro.U5_W1_D2.enums.TableStatus;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Table {
    private int numberTable;
    private int maxSeats;
    private TableStatus tableStatus;
}
