package entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CitaEnfermeria extends Cita{
    private Enfermero enfermero;

    public CitaEnfermeria(int id, LocalDate fechaCita, Paciente paciente, Consultorio consultorio, LocalTime hora,
            Enfermero enfermero) {
        super(id, fechaCita, paciente, consultorio, hora);
        this.enfermero = enfermero;
    }

    

    
}
