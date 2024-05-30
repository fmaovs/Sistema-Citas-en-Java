package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class Consultorio {
    private int id;
    private String direccion;
    private int numero;
}
