import java.util.*;

public class Hospital {
    private ArrayList<CitaMedica> citas;
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;

    //Constructor
    public Hospital(){
        citas=new ArrayList<>();
        doctores=new ArrayList<>();
        pacientes=new ArrayList<>();
    }

    //Registro de docotores, pacientes y citas

    public void registrarDoctor(Doctor doctor){
        for(Doctor doc:doctores){
                if(doc.getCodigo().equals(doctor.getCodigo())){
                    System.out.println("Codigo de doctor ya registrado.");
                    return;
                }
            }
            doctores.add(doctor);
            System.out.println("Doctor Registrado");
    }
        
    public void registrarPaciente(Paciente paciente){
        for(Paciente pac:pacientes){
                if(pac.getCodigo().equals(paciente.getCodigo())||
                pac.getDocumento().equals(paciente.getDocumento())){
                    System.out.println("Codigo de paciente o documento ya registrado.");
                    return;
                }
            }
            pacientes.add(paciente);
            System.out.println("Paciente Registrado");
    }
    public void agendarCita(CitaMedica cita){
        for(CitaMedica c:citas){
                if(c.getDoctor().equals(cita.getDoctor())&&
                c.getFecha().equals(cita.getFecha())&&
                c.getHora().equals(cita.getHora())){
                    System.out.println("Doctor ocupado en esa hora.");
                    return;
                }
            }
            citas.add(cita);
            System.out.println("Cita agendada ");
    }

    //Listado de Citas

    public void mostrarCitas(){
        for(CitaMedica cita:citas){
            System.out.println(cita);
        }
    }

    public void mostrarCitasPorDoctor(Doctor doctor){
        for(CitaMedica cita:citas){
            if(cita.getDoctor().equals(doctor))
                System.out.println(cita);
        }
    }

    public void mostrarCitasPorPaciente(Paciente paciente){
        for(CitaMedica cita:citas){
            if(cita.getPaciente().equals(paciente))
                System.out.println(cita);
        }
    }

    //Reporte de citas según su estado
    public void mostrarCitasAtendidasyCanceladas(){
        int citasAtendidas=0;
        int citasCanceladas=0;
        for(CitaMedica cita:citas){
            if(cita.getEstado().equals("cancelada"))
                citasCanceladas++;
            if(cita.getEstado().equals("atendida"))
                citasAtendidas++;  
        }
        System.out.println("N° de Citas Atendidas: "+citasAtendidas+
                        "\nN° de Citas Canceladas: "+citasCanceladas);
    }   
}
