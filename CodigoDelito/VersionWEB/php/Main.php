<?php


include_once ("Denunciante.php");
include_once ("Denunciado.php");
include_once ("Ofendido.php");
include_once ("Expediente.php");
class Main
{


  public static function main()
  {

    $numExpediente = 1;

    // instancia de los objetos que son pasados al constructor de expediente
    // cumpliendo con el concepto de agregacion

    // instancia de objeto denunciante
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Verificar si se han enviado datos desde el formulario
    $ListaDenunciantes = new ArrayObject();


    if ($_SERVER["REQUEST_METHOD"] == "POST") {
      // Capturar los datos del formulario
      $identidad = $_POST["ID"];
      $PrimerNombre = $_POST["PrimerNombre"];
      $PrimerApellido = $_POST["PrimerApellido"];
      $Genero = $_POST["Genero"];
      $SegundoNombre = $_POST["SegundoNombre"];
      $SegundoApellido = $_POST["SegundoApellido"];
      $Edad = $_POST["Edad"];
      $departamento = $_POST['departamento'];
      $municipio = $_POST['municipio'];
      $colonia = $_POST["aldea"];
      $numeroBloque = $_POST["bloque"];
      $numeroCasa = $_POST["numerocasa"];
      $codigoPostal = $_POST["codigopostal"];
      // Capturar otros campos del formulario...

      // Instanciar un objeto Denunciante con los datos del formulario
      $nuevoDenunciante = new Denunciante(
        $departamento,
        $municipio,
        $colonia,
        $numeroBloque,
        $codigoPostal,
        $numeroCasa,
        $PrimerNombre,
        $SegundoNombre,
        $PrimerApellido,
        $SegundoApellido,
        $Edad,
        $identidad,
        $Genero
      );

      // Agregar el nuevo denunciante a la lista de denunciantes
      $ListaDenunciantes->append($nuevoDenunciante);


      /* $ListaDenunciantes = new ArrayObject();

      $ListaDenunciantes->append(
        new Denunciante(
          "Comayagua",
          "El Rosario",
          "nuevacapital",
          "k",
          "3456",
          "casa34",
          "Lester",
          "Jhoan",
          "Dominguez",
          "Chavez",
          21,
          "0311200200504",
          "Masculino"
        )
      );*/

      // instancia de objeto denunciado en posiciones de un arreglo
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      $ListaDenunciados = new ArrayObject();

      $ListaDenunciados->append(
        new Denunciado(
          "Fm",
          "Tegucigalpa",
          "hato",
          "h",
          "1234",
          "casa39",
          "Marco",
          "Juan",
          "Perez",
          "Chavez",
          21,
          "0311200200782",
          "Masculino"
        )
      );

      $ListaDenunciados->append(
        new Denunciado(
          "Comayagua",
          "El Rosario",
          "nuevacapital",
          "k",
          "3456",
          "casa34",
          "Lester",
          "Jhoan",
          "Dominguez",
          "Chavez",
          21,
          "0311200200503",
          "Masculino"
        )
      );
      // instancia de objeto ofendido definicando las posiciones dentro de un arreglo
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      $ListaOfendidos = new ArrayObject();

      $ListaOfendidos->append(
        new Ofendido(
          "Atlantida",
          "El Rosario",
          "nuevacapital",
          "k",
          "3456",
          "casa34",
          "Lester",
          "Jhoan",
          "Dominguez",
          "Chavez",
          21,
          "0311200200692",
          "Masculino"
        )
      );


      // instancia de objeto expediente
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      $objexpediente = new Expediente(

        $ListaDenunciantes,
        $ListaDenunciados,
        $ListaOfendidos,
        $numExpediente,
        "FM",
        "tegus",
        "bella oriente",
        "A",
        "principal",
        "homicidio",
        "mato"
      );


      //echo $objexpediente->getListaDenunciantes()->offsetGet(0)->toString() . "\n";
      //echo $objexpediente->getListaDenunciados()->offsetGet(1)->toString() . "\n";
      //echo $objexpediente->(getListaDenunciados()->(offsetGet(0)->toString())) . "\n";
      //$selecObjetoDenunciado = $objexpediente->getListaDenunciados();
      //$selecObjetoDenunciado = $ListaDenunciados;
      // $objDenucniadoSelec = $selecObjetoDenunciado[1];
      //echo $ListaDenunciados->count();
      //echo "Hola el objeto seleccionado es: ".$objDenucniadoSelec->toString() . "\n";
      //echo $objexpediente->getListaDenunciados()->offsetGet(1)->toString() . "\n";
      // echo $objexpediente->getListaDenunciantes()->offsetGet(0)->toString() . "\n";

      echo "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n";
      //echo $objexpediente->getListaDenunciantes()->toString() . "\n";

    }
  }
}
//para ejecutar (RUN ) el main
Main::main();


?>