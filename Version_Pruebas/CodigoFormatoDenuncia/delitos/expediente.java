package Version_Pruebas.CodigoFormatoDenuncia.delitos;

public class expediente {

    //private String descripciondelito;

    private static int NumExpedientes = 0;
    private int codigoExpediente;
    int i = 0;
    int j = 0;
    int f = 0;
    demandante objdemandante;
    demandado objdemandado;
    testigo objtestigo;


    demandante Lsdemate[] = new demandante[7];
    demandado Lsdemado[] = new demandado[4];
    testigo Lstestigo[] = new testigo[8];
    
    public  expediente() {
        super();
    }
    //constructor de los objetos demandante, demandado,  y testigo 
    public expediente(demandante objdemandante, demandado objdemandado, testigo objtestigo, String denuncia ){
        
    // Incrementar el contador de expedientes y asignar el código automáticamente
    NumExpedientes++;
   
    }

    public void Agregardemandante(demandante objdemandante) {
        Lsdemate[i] = objdemandante;
        i++;
    }

    public void Agregardemandado(demandado objdemandado){
        Lsdemado[j] = objdemandado;
        j++;
    }

    public void Agregartestigo(testigo objtestigo){
        Lstestigo[f] = objtestigo;
        f++;  
    }

    public int getNumeroExpediente () { 
        return codigoExpediente;
    }

    expediente miExpediente = new expediente();

     // Obtener el número de expediente y mostrarlo en la consola
     int numeroExpediente = miExpediente.getNumeroExpediente();
     System.out.println("Número de expediente: " + numeroExpediente);

      // Mostrar la información de los demandantes, demandados y testigos
        // en el expediente
        System.out.println("Demandantes:");
        for (demandante d : miExpediente.Lsdemate) {
            if (d != null) {
                System.out.println(d);
            }
        }

        System.out.println("Demandados:");
        for (demandado e : miExpediente.Lsdemado) {
            if (d != null) {
                System.out.println(e);
            }
        }

        System.out.println("Testigos:");
        for (testigo t : miExpediente.Lstestigo) {
            if (t != null) {
                System.out.println(t);
            }
        }
}