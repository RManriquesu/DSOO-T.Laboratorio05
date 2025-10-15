public class Doctor {
    private String codigo;
    private String nombre;
    private String especialidad;
    private String horarioAtencion;

    public Doctor(String codigo, String nombre, String especialidad, String horarioAtencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horarioAtencion = horarioAtencion;
    }

    public String getCodigo() {
    return codigo; }

    public String getNombre() { 
    return nombre; }

    public String getEspecialidad() { 
    return especialidad; }

    public String getHorarioAtencion() {
    return horarioAtencion; }

    @Override
    public String toString() {
    return "Doctor{" + "codigo='" + codigo + '\'' + ", nombre='" + nombre + '\'' +
    ",especialidad='" + especialidad + '\'' + ", horario='" + horarioAtencion + '\'' + '}';
    }
}