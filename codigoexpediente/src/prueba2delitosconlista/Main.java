package prueba2delitosconlista;



public class Main {
    public static void main(String[] args) {
        // Crear direcciones
    	 Direccion direccionJuan = new Direccion("Departamento Comayagua", "Municipio lejamani", "Colonia Suarez", "Bloque AW1");
    	 Direccion direccionMaria = new Direccion("Departamento Tegucigalpa", "Municipio DC", "Colonia Hato", "Bloque 179B");
         Direccion direccionPedro = new Direccion("Departamento Comayagua", "Municipio lejamani", "Colonia El Bosque", "Bloque AW2");
         Direccion direccionAna = new Direccion("Departamento Tegucigalpa", "Municipio DC", "Colonia Suyapa", "Bloque 24B");

        // Crear demandado y demandante
         Demandado juan = new Demandado("Juan", "Pérez", 30, direccionJuan);
         Demandado maria = new Demandado("Maria", "Gomez", 35, direccionMaria);
         Demandante demandantePedro = new Demandante("Pedro", "García", 40, direccionPedro);
         Demandante demandanteAna = new Demandante("Ana", "López", 25, direccionAna);
         
        // Agregar delitos al demandado
         juan.agregarDelito(new Delito("Robo", "Robo de vehículo"));
         maria.agregarDelito(new Delito("Fraude", "Fraude financiero"));
        // Crear expediente
        Expediente expediente = new Expediente(juan, demandantePedro);
        Expediente expediente1 = new Expediente(maria, demandanteAna);

        // Mostrar información del expediente
        
        
        // Mostrar información del expediente
        System.out.println("Información del expediente1:");
        System.out.println("Información del demandado:");
        System.out.println("Nombre: " + expediente.getDemandado().getNombre());
        System.out.println("Apellido: " + expediente.getDemandado().getApellido());
        System.out.println("Edad: " + expediente.getDemandado().getEdad());
        System.out.println("Dirección: " + expediente.getDemandado().obtenerDireccion());
        expediente1.getDemandado().mostrarDelitos();

        System.out.println("\nInformación del demandante:");
        System.out.println("Nombre: " + ((Persona) expediente.getDemandante()).getNombre());
        System.out.println("Apellido: " + ((Persona) expediente.getDemandante()).getApellido());
        System.out.println("Edad: " + ((Persona) expediente.getDemandante()).getEdad());
        System.out.println("Dirección: " + ((Persona) expediente.getDemandante()).obtenerDireccion()); 
        
        
        System.out.println();
       
      
        System.out.println("Información del expediente2:");
        System.out.println("Información del demandado:");
        System.out.println("Nombre: " + expediente1.getDemandado().getNombre());
        System.out.println("Apellido: " + expediente1.getDemandado().getApellido());
        System.out.println("Edad: " + expediente1.getDemandado().getEdad());
        System.out.println("Dirección: " + expediente1.getDemandado().obtenerDireccion());
        expediente1.getDemandado().mostrarDelitos();

        System.out.println("\nInformación del demandante:");
        System.out.println("Nombre: " + ((Persona) expediente1.getDemandante()).getNombre());
        System.out.println("Apellido: " + ((Persona) expediente1.getDemandante()).getApellido());
        System.out.println("Edad: " + ((Persona) expediente1.getDemandante()).getEdad());
        System.out.println("Dirección: " + ((Persona) expediente1.getDemandante()).obtenerDireccion());
    }

	private static void nextLine() {
		// TODO Auto-generated method stub
		
	}
}