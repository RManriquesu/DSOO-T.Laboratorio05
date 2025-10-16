public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String documento;
    
    //Metodo constructorr
    public Paciente(String codigo, String nombre, int edad, String documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getCodigo() { 
    return codigo; }

    public String getNombre() { 
    return nombre; }

    public int getEdad() {
    return edad; }

    public String getDocumento() { 
    return documento; }

    @Override
    public String toString() {
    return "Paciente{" + "codigo='" + codigo + '\'' + ", nombre='" + nombre + '\'' +
    ",edad=" + edad + ", documento='" + documento + '\'' + '}';
    }
}

