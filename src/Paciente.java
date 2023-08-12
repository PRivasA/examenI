class Paciente extends Persona implements Consulta {
    private String historialMedico;

    public Paciente(String nombre, int edad, String genero, String direccion, String historialMedico) {
        super(nombre, edad, genero, direccion);
        this.historialMedico = historialMedico;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Agendando consulta para el paciente: " + getNombre());
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Realizando consulta para el paciente: " + getNombre());
    }

    public String getHistorialMedico() {
        return historialMedico;
    }
}
