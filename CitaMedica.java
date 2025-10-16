public class CitaMedica {

    private String codigo;       
    private Paciente paciente;   
    private Doctor doctor;        
    private String fecha;         
    private String hora;          
    private String estado;        
    private String motivo;        

   
    // constructor
    public CitaMedica(String codigo, Paciente paciente, Doctor doctor, String fecha, String hora, String motivo) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;       
        this.hora = hora;         
        this.motivo = motivo;
        this.estado = "pendiente"; // toda cita nueva inicia como pendiente
    }

    // getters 
    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }
    public String getMotivo() { return motivo; }

    // validacion
    // verifica si un estado es válido para la cita
    public boolean esEstadoValido(String estado) {
        return estado.equals("pendiente") ||
               estado.equals("atendida") ||
               estado.equals("cancelada");
    }

    // verifica que la fecha tenga el formato "dd/MM/yyyy"
    public boolean esFormatoFechaValido(String fecha) {
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    // verifica que la hora tenga el formato "HH:mm"
    public boolean esFormatoHoraValido(String hora) {
        return hora.matches("\\d{2}:\\d{2}");
    }

    // métodos 
    // actualiza el estado de la cita si es válido
    public boolean actualizarEstado(String nuevoEstado) {
        if (esEstadoValido(nuevoEstado)) {
            this.estado = nuevoEstado;
            return true;
        }
        return false; // no cambia nada si el estado es inválido
    }

    // modifica la fecha de la cita si el formato es correcto
    public boolean modificarFecha(String nuevaFecha) {
        if (esFormatoFechaValido(nuevaFecha)) {
            this.fecha = nuevaFecha;
            return true;
        }
        return false;
    }

    // modifica la hora de la cita si el formato es correcto
    public boolean modificarHora(String nuevaHora) {
        if (esFormatoHoraValido(nuevaHora)) {
            this.hora = nuevaHora;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "codigo='" + codigo + '\'' +
                ", paciente=" + paciente.getNombre() +
                ", doctor=" + doctor.getNombre() +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", estado='" + estado + '\'' +
                ", motivo='" + motivo + '\'' +
                '}';
    }
}
