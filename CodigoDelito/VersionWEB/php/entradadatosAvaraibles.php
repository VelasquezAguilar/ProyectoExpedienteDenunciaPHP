<?php

include_once("conexionPosgres.php");

class entradadatosAvariables {
    private $PrimerNombre;
    private $SegundoNombre;
    private $PrimerApellido;
    private $SegundoApellido;
    private $Genero;
    private $Edad;
    private $identidad;

    public function processForm() {
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            // Obtener los valores del formulario
            $this->PrimerNombre = $_POST['PrimerNombre'];
            $this->SegundoNombre = $_POST['SegundoNombre'];
            $this->PrimerApellido = $_POST['PrimerApellido'];
            $this->SegundoApellido = $_POST['SegundoApellido'];
            $this->Genero = $_POST['Genero'];
            $this->Edad = $_POST['Edad'];
            $this->identidad = $_POST['ID'];

            // Imprimir los valores en una tabla HTML
            echo "<table border='1'>
                    <tr>
                        <th>Primer Nombre</th>
                        <th>Segundo Nombre</th>
                        <th>Primer Apellido</th>
                        <th>Segundo Apellido</th>
                        <th>Género</th>
                        <th>Edad</th>
                        <th>Identidad</th>
                    </tr>
                    <tr>
                        <td>{$this->PrimerNombre}</td>
                        <td>{$this->SegundoNombre}</td>
                        <td>{$this->PrimerApellido}</td>
                        <td>{$this->SegundoApellido}</td>
                        <td>{$this->Genero}</td>
                        <td>{$this->Edad}</td>
                        <td>{$this->identidad}</td>
                    </tr>
                  </table>";



                  // Llamar a la función queryInsert para insertar los datos en la base de datos
            $conexion = new conexionPosgres();
            $conexion->queryInsert($this->identidad, $this->PrimerNombre, $this->SegundoNombre, $this->PrimerApellido, $this->SegundoApellido, $this->Genero, $this->Edad);
        } else {
            // Manejar el caso en que no se haya enviado el formulario
            echo "El formulario no ha sido enviado.";
        }
    }



    //getters
    public  function getPrimerNombre(){
        return $this->PrimerNombre;
    }
    public function getSegundoNombre(){
        return $this->SegundoNombre;
    }
    public function getPrimerApellido(){
        return $this->PrimerApellido;
    }
    public function getSegundoApellido(){
        return $this->SegundoApellido;
    }
    public function getGenero(){
        return $this->Genero;
    }
    public function getEdad(){
        return $this->Edad;
    }
    public function getIdentidad(){
        return $this->identidad;
    }
    

    //setters
    public function setPrimerNombre($PrimerNombre){
        $this->PrimerNombre = $PrimerNombre;
        return $this;
    }
    public function setSegundoNombre($SegundoNombre){
        $this->SegundoNombre = $SegundoNombre;
        return $this;
    }
    public function setPrimerApellido($PrimerApellido){
        $this->PrimerApellido = $PrimerApellido;
        return $this;
    }
    public function setSegundoApellido($SegundoApellido){
        $this->SegundoApellido = $SegundoApellido;
        return $this;
    }
    public function setGenero($Genero){
        $this->Genero = $Genero;
        return $this;
    }
    public function setEdad($Edad){
        $this->Edad = $Edad;
        return $this;
    }
    
    public function setIdentidad($identidad){
        $this->identidad = $identidad;
        return $this;
    }
}





   
    


?>







