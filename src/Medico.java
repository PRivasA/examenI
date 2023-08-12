class Medico extends Persona implements Consulta {
    private String especialidad;
    private String numeroColegiado;
    private String horarioConsultas;

    public Medico(String nombre, int edad, String genero, String direccion, String especialidad, String numeroColegiado, String horarioConsultas) {
        super(nombre, edad, genero, direccion);
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.horarioConsultas = horarioConsultas;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Agendando consulta para el médico: " + getNombre());
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Realizando consulta para el médico: " + getNombre());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public String getHorarioConsultas() {
        return horarioConsultas;
    }
}
