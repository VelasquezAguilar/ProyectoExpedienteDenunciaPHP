package pruebadelitos;

public class Main {
    public static void main(String[] args) {
        // Crear direcciones
        Direccion direccionJuan = new Direccion("Departamento Comayagua", "Municipio lejamani", "Colonia Suarez", "Bloque AW1");
        Direccion direccionMaria = new Direccion("Departamento Tegucigalpa", "Municipio DC", "Colonia Hato", "Bloque 179B");
        Direccion direccionPedro = new Direccion("Departamento Comayagua", "Municipio lejamani", "Colonia El Bosque", "Bloque AW2");
        Direccion direccionAna = new Direccion("Departamento Tegucigalpa", "Municipio DC", "Colonia Suyapa", "Bloque 24B");


        // Crear demandados
        Demandado juan = new Demandado("Juan", "Pérez", 30, direccionJuan);
        Demandado maria = new Demandado("Maria", "Gomez", 35, direccionMaria);

        // Crear demandantes
        Demandante demandantePedro = new Demandante("Pedro", "García", 40, direccionPedro);
        Demandante demandanteAna = new Demandante("Ana", "López", 25, direccionAna);

        // Agregar delitos a los demandados
        juan.agregarDelito(new Delito("Robo", "Robo de vehículo"));
        maria.agregarDelito(new Delito("Fraude", "Fraude financiero"));

        // Mostrar información de Juan
        System.out.println("Información del demandado Juan:");
        System.out.println("Nombre: " + juan.getNombre());
        System.out.println("Apellido: " + juan.getApellido());
        System.out.println("Edad: " + juan.getEdad());
        System.out.println("Dirección: " + juan.obtenerDireccion());
        juan.mostrarDelitos();

        // Mostrar información del demandante Juan
        System.out.println("\nInformación del demandante Pedro:");
        System.out.println("Nombre: " + demandantePedro.getNombre());
        System.out.println("Apellido: " + demandantePedro.getApellido());
        System.out.println("Edad: " + demandantePedro.getEdad());
        System.out.println("Dirección: " + demandantePedro.obtenerDireccion());

        // Mostrar información de Maria
        System.out.println("\nInformación del demandado Maria:");
        System.out.println("Nombre: " + maria.getNombre());
        System.out.println("Apellido: " + maria.getApellido());
        System.out.println("Edad: " + maria.getEdad());
        System.out.println("Dirección: " + maria.obtenerDireccion());
        maria.mostrarDelitos();

        // Mostrar información del demandante Maria
        System.out.println("\nInformación del demandante Ana:");
        System.out.println("Nombre: " + demandanteAna.getNombre());
        System.out.println("Apellido: " + demandanteAna.getApellido());
        System.out.println("Edad: " + demandanteAna.getEdad());
        System.out.println("Dirección: " + demandanteAna.obtenerDireccion());
    }
}