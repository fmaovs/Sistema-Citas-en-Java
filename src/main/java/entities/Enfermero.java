package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enfermero extends Usuario{
    private Long rethus;

    public Enfermero(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, Long rethus) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.rethus = rethus;
    }

    
}
