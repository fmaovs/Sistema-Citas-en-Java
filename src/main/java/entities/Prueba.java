package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        Medico medicoPrueba = new Medico(null, null, null, null, null, null, null);
        medicoPrueba.setId(1);
        //System.out.println("El id del medico "+ medicoPrueba.getId());

        Paciente p = new Paciente(1, "cristian", "Ricardo", TipoIdentificacion.CEDULA_CIUDADANIA,1234567, "ELCORREO@GMAIL.COM",310254631,LocalDate.of(2000, 5, 3),1.70,64.0,TipoSangre.O, '+') {
            
        };
            
        //System.out.println(p);

        //System.out.println("Nombre: " + p.getNombres() + "\nApellidos: "+ p.getApellidos());

        Consultorio c1 = new Consultorio(1, "mi casa", 3);

        //Cita cita1 = new Cita(1, LocalDate.of(2024,05,30), p, c1, LocalTime.of(10, 00, 00));

        //System.out.println(cita1.hora);

        Enfermero aux1 = new Enfermero(1, "Fabian", "Libreros", TipoIdentificacion.CEDULA_CIUDADANIA, 1007450556, 2654879L);
        //System.out.println(aux1.getNombres());

        CitaEnfermeria cE1= new CitaEnfermeria(1, LocalDate.of(2024, 05, 31), p, c1, LocalTime.of(11, 30, 0), aux1);
        System.out.println("La cita de enfermeria con el enfermero: " + cE1.getEnfermero().nombres + " "+ cE1.getEnfermero().apellidos + "\nA las: " + cE1.hora + "\nSe generó con exito. " );
    }
}
