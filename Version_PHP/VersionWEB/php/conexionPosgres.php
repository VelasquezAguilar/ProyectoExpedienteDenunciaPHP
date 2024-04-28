<?php

include_once ("entradadatosAvaraibles.php");
class conexionPosgres{



    //establecemos conexion con PostgreSQL 
    public function conexionbase()
    {
        $host = "localhost";
        $port = 5432;
        $database = "js";
        $user = "postgres";
        $password = "RusiaMoscu2030";

        try {
            $conexion = new PDO("pgsql:host= $host; dbname= $database", $user, $password); //$port,
            echo "Se conecto correctamente a la base de datos";
        } catch (PDOException $error) {

            echo "No se puede conecto correctamente a la base de datos $error";

        }

        return $conexion;
    }




    //funcion que hace una consulata tipo insert
    public function queryInsert($identidad, $PrimerNombre, $PrimerApellido, $SegundoNombre, $SegundoApellido, $Edad, $Genero, $departamento, $municipio, $aldea, $bloque, $numeroCasa, $codigoPostal)
    {
        try {
            // Obtener la conexión a la base de datos
            $conexion = $this->conexionbase(); 
            //$query="INSERT INTO versionWEB.DENUNCIANTES (ID, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Edad, Genero, departamento, municipio, aldea, bloque, numerocasa, codigopostal)
            // VALUES (0826200300123, 'Orlin', 'Aguilar', 'Rudiel', 'Velasquez', 'Masculino', 21);
            //";
            //$query = $conexion->prepare("INSERT INTO Usuarios (ID, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Edad, Genero) VALUES (?, ?, ?, ?, ?, ?, ?)");//los sibolos de interrogacion lo que hacen es recerabar esos espacios
            //$query->execute([$identidad, $PrimerNombre, $PrimerApellido, $SegundoNombre, $SegundoApellido, $Edad, $Genero]);

            $query = $conexion->prepare("INSERT INTO Usuarios (ID, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Edad, Genero, departamento, municipio, aldea, bloque, numerocasa, codigopostal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");//los sibolos de interrogacion lo que hacen es recerabar esos espacios
            $query->execute([$identidad, $PrimerNombre, $PrimerApellido, $SegundoNombre, $SegundoApellido, $Edad, $Genero, $departamento, $municipio, $aldea, $bloque, $numeroCasa, $codigoPostal]);
            echo "Los datos se insertaron correctamente en la base de datos.";
        } catch (PDOException $error) {
            echo "Error al insertar los datos en la base de datos: " . $error->getMessage();
        }
    }





 // Función para realizar una consulta SELECT
 public function querySelect(){
     try {
         // Obtener la conexión a la base de datos
         $conexion = $this->conexionbase();

         // Preparar la consulta SQL SELECT
         $query = $conexion->prepare("SELECT * FROM Usuarios");

         // Ejecutar la consulta SELECT
         $query->execute();

         // Obtener los resultados
         $resultados = $query->fetchAll(PDO::FETCH_ASSOC);

         // Imprimir los resultados
         echo "<pre>";
         print_r($resultados);
         echo "</pre>";
     } catch (PDOException $error) {
         echo "Error al ejecutar la consulta SELECT: " . $error->getMessage();
     }
 }


public function queryDelete($identidad)
{
    try {
        // Obtener la conexión a la base de datos
        $conexion = $this->conexionbase(); 

        // Preparar la consulta SQL DELETE
        $query = $conexion->prepare("DELETE FROM Usuarios WHERE ID = ?");

        // Ejecutar la consulta
        $query->execute([$identidad]);

        echo "El registro se eliminó correctamente de la base de datos.";
    } catch (PDOException $error) {
        echo "Error al eliminar el registro de la base de datos: " . $error->getMessage();
    }
}


 // Función para realizar una consulta de actualización (UPDATE)
 public function queryUpdate($identidad, $PrimerNombre, $PrimerApellido, $SegundoNombre, $SegundoApellido, $Edad, $Genero, $departamento, $municipio, $aldea, $bloque, $numeroCasa, $codigoPostal)
 {
     try {
         // Obtener la conexión a la base de datos
         $conexion = $this->conexionbase();

         // Preparar la consulta SQL UPDATE
         $query = $conexion->prepare("UPDATE Usuarios SET PrimerNombre = ?, SegundoNombre = ?, PrimerApellido = ?, SegundoApellido = ?, Edad = ?, Genero = ?, departamento = ?, municipio = ?, aldea = ?, bloque = ?, numerocasa = ?, codigopostal = ? WHERE ID = .$identidad");

         // Ejecutar la consulta UPDATE
         $query->execute([$PrimerNombre, $SegundoNombre, $PrimerApellido, $SegundoApellido, $Edad, $Genero, $departamento, $municipio, $aldea, $bloque, $numeroCasa, $codigoPostal]);

         echo "El registro se actualizó correctamente en la base de datos.";
     } catch (PDOException $error) {
         echo "Error al actualizar el registro en la base de datos: " . $error->getMessage();
     }
 }

}


/*
$conexion = new conexionPosgres();
$datosFormulario = new entradadatosAvariables();
$datosFormulario->processForm(); // Procesar el formulario y obtener los datos

// Obtener los datos del formulario y pasarlos al método queryInsert
$conexion->queryInsert(
    $datosFormulario->getIdentidad(),
    $datosFormulario->getPrimerNombre(),
    $datosFormulario->getSegundoNombre(),
    $datosFormulario->getPrimerApellido(),
    $datosFormulario->getSegundoApellido(),
    $datosFormulario->getGenero(),
    $datosFormulario->getEdad()

);  */









?>

/*
$conexion = new conexionPosgres();
$datosFormulario = new entradadatosAvariables();
$datosFormulario->processForm(); // Procesar el formulario y obtener los datos

// Obtener los datos del formulario y pasarlos al método queryInsert
$conexion->queryInsert(
    $datosFormulario->getIdentidad(),
    $datosFormulario->getPrimerNombre(),
    $datosFormulario->getSegundoNombre(),
    $datosFormulario->getPrimerApellido(),
    $datosFormulario->getSegundoApellido(),
    $datosFormulario->getGenero(),
    $datosFormulario->getEdad()

);  */









?>