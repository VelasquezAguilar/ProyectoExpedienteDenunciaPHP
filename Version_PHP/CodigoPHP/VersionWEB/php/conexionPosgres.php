<?php

class conexionPosgres
{

   public  function conexionbase()
    {
        $host = "localhost";
        $port = 5432;
        $database = "js";
        $user = "postgres";
        $password = "RusiaMoscu2030";

        try {
            $conexion = new PDO("pgsql:host= $host; dbname= $database", $user, $password ); //$port,
            echo "Se conecto correctamente a la base de datos";
        } catch (PDOException $error) {

            echo "No se puede conecto correctamente a la base de datos $error";


        }

        return $conexion;
    }

    public function queryInsert(){
    $query="INSERT INTO USUARIOS (Id, PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad)
                   VALUES (0826200300123, 'Orlin', 'Aguilar', 'Rudiel', 'Velasquez', 'Masculino', 21);
    ";


    }
}


?>