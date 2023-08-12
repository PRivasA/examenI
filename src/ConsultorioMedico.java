import java.util.ArrayList;
import java.util.List;

public class ConsultorioMedico {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();

        pacientes.add(new Paciente("Paciente1", 30, "Masculino", "Calle A, Ciudad X", "Historial del paciente 1"));
        pacientes.add(new Paciente("Paciente2", 25, "Femenino", "Calle B, Ciudad Y", "Historial del paciente 2"));

        medicos.add(new Medico("Médico1", 40, "Masculino", "Avenida C, Ciudad Z", "Cardiología", "12345", "Lunes 9am - 5pm"));
        medicos.add(new Medico("Médico2", 35, "Femenino", "Avenida D, Ciudad W", "Dermatología", "67890", "Miércoles 10am - 6pm"));

        for (Paciente paciente : pacientes) {
            paciente.agendarConsulta();
            paciente.realizarConsulta();
            System.out.println("Historial médico de " + paciente.getNombre() + ": " + paciente.getHistorialMedico());
            System.out.println();
        }

        for (Medico medico : medicos) {
            medico.agendarConsulta();
            medico.realizarConsulta();
            System.out.println("Especialidad: " + medico.getEspecialidad());
            System.out.println("Número de colegiado: " + medico.getNumeroColegiado());
            System.out.println("Horario de consultas: " + medico.getHorarioConsultas());
            System.out.println();
        }
    }
}
