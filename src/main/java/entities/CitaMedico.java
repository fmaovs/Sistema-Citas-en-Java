package entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CitaMedico extends Cita{
    private Medico medico;
    private Estado estado;
    
    public CitaMedico(int id, LocalDate fechaCita, Paciente paciente, Consultorio consultorio, LocalTime hora,
            Medico medico, Estado estado) {
        super(id, fechaCita, paciente, consultorio, hora);
        this.medico = medico;
        this.estado = estado;
    }
    
    

}
