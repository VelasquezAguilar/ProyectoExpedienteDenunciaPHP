package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

import java.util.Scanner;

class Delito {
    //private String nombre;
    private String descripcion;

    public String[] tiposDelitos = {
        "Homicidio",
        "Robo",
        "Asalto",
        "Violación",
        "Fraude",
        "Extorsión",
        "Secuestro",
        "Tráfico de drogas",
        "Violencia doméstica",
        "Acoso sexual",
        "Lesiones",
        "Falsificación",
        "Maltrato infantil",
        "Corrupción",
        "Delitos informáticos",
        "Blanqueo de capitales",
        "Terrorismo",
        "Tráfico de personas"
    };
    // Constructor
    public Delito( String descripcion) {
       // this.nombre = nombre;
        this.descripcion = descripcion;
        CapturarDelitoSelec();
    }

    // Métodos para obtener nombre y descripción del delito
    public String getNombre() {
        return CapturarDelitoSelec();
    }

    public String getDescripcion() {
        return descripcion;
    }


    //metodo para poder capturar la opcion seleccionada por el "Actor"
    public String CapturarDelitoSelec(){
        System.out.println("Ingrese el inciso con el delito que mejor describa lo ocurrido:");
        for (int i = 0; i < tiposDelitos.length; i++) {
            System.out.println((i+1)+"). "+tiposDelitos[i]);
        }

         Scanner scanner = new Scanner (System.in);
         int opcion = scanner.nextInt();
         scanner.close();
         

         return tiposDelitos[opcion-1];
    }
}

