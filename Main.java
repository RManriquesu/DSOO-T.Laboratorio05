public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("D01", "Dr. Pérez", "Cardiología", "0814:00");
        Doctor doctor2 = new Doctor("D02", "Dra. Gómez", "Pediatría", "0915:00");
        Doctor doctor3 = new Doctor("D03", "Dr. Ramírez", "Dermatología", "1016:00");

        // Registro de Doctores

        hospital.registrarDoctor(doctor1);
        hospital.registrarDoctor(doctor2);
        hospital.registrarDoctor(doctor3);

        
        // Registro de Pacientes
        
        Paciente paciente1 = new Paciente("P01", "Luis Torres", 30, "12345678");
        Paciente paciente2 = new Paciente("P02", "María López", 25, "87654321");
        Paciente paciente3 = new Paciente("P03", "Carlos Díaz", 40, "45678912");

        hospital.registrarPaciente(paciente1);
        hospital.registrarPaciente(paciente2);
        hospital.registrarPaciente(paciente3);

        
        // Registro de Citas Medicas
        
        CitaMedica cita1 = new CitaMedica("C001", paciente1, doctor1, ("15/10/2025"), ("09:00"));
        CitaMedica cita2 = new CitaMedica("C002", paciente2, doctor1, ("15/10/2025"), ("10:00"));
        CitaMedica cita3 = new CitaMedica("C003", paciente1, doctor2, ("16/10/2025"), ("11:30"));
        CitaMedica cita4 = new CitaMedica("C004", paciente3, doctor3, ("17/10/2025"), ("13:00"));
        CitaMedica cita5 = new CitaMedica("C005", paciente2, doctor3, ("18/10/2025"), ("12:00"));

        hospital.agendarCita(cita1);
        hospital.agendarCita(cita2);
        hospital.agendarCita(cita3);
        hospital.agendarCita(cita4);
        hospital.agendarCita(cita5);

        
        // Actualizacion de estado en las citas
        
        cita1.actualizarEstado( "atendida");
        cita4.actualizarEstado( "cancelada");

        
        // Listados y Reportes
        
        System.out.println("\n Citas Medicas PROGRAMADAS:");
        hospital.mostrarCitas();

        System.out.println("\n Citas Medicas de Doctor Perez:");
        hospital.mostrarCitasPorDoctor(doctor1);

        System.out.println("\n Citas Medicas del paciente María López):");
        hospital.mostrarCitasPorPaciente(paciente2);

        System.out.println("\n Citas Medicas Atendidas y Canceladas:");
        hospital.mostrarCitasAtendidasyCanceladas();
    }
}