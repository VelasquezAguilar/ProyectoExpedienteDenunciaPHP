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
    public function queryInsert($identidad, $PrimerNombre, $SegundoNombre, $PrimerApellido, $SegundoApellido, $Genero, $Edad)
    {
        try {
            // Obtener la conexión a la base de datos
            $conexion = $this->conexionbase(); 
            //$query="INSERT INTO USUARIOS (Id, PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad)
            // VALUES (0826200300123, 'Orlin', 'Aguilar', 'Rudiel', 'Velasquez', 'Masculino', 21);
            //";
            $query = $conexion->prepare("INSERT INTO USUARIOS (Id, PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad) VALUES (?, ?, ?, ?, ?, ?, ?)");//los sibolos de interrogacion lo que hacen es recerabar esos espacios
            $query->execute([$identidad, $PrimerNombre, $PrimerApellido, $SegundoNombre, $SegundoApellido, $Genero, $Edad]);
            echo "Los datos se insertaron correctamente en la base de datos.";
        } catch (PDOException $error) {
            echo "Error al insertar los datos en la base de datos: " . $error->getMessage();
        }
    }
}

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

);







?>