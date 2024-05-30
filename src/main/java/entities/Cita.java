package entities;
import java.time.LocalDate;
import java.time.LocalTime;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cita {
    protected int id;
    protected LocalDate fechaCita;
    protected Paciente paciente;
    protected Consultorio consultorio;
    protected LocalTime hora;
    
    public Cita(int id, LocalDate fechaCita, Paciente paciente, Consultorio consultorio, LocalTime hora) {
        this.id = id;
        this.fechaCita = fechaCita;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.hora = hora;
    }

    

    
}
