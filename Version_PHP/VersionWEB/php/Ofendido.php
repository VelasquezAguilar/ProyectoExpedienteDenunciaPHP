<?php 
include_once("Persona.php");

 class Ofendido extends Persona {

public function __construc($departamento, $municipio, $colonia, $numeroBloque, $codigoPostal, $numeroCasa, $PrimerNombre, $SegundoNombre, $PrimerApellido, $SegundoApellido, $Edad, $identidad, $Genero){
    $this->setDepartamento($departamento);
    $this->setMunicipio($municipio);
    $this->setColonia($colonia);
    $this->setNumeroBloque($numeroBloque);
    $this->setCodigoPostal($codigoPostal);
    $this->setNumeroCasa($numeroCasa);
    $this->setPrimerNombre($PrimerNombre);
    $this->setSegundoNombre($SegundoNombre);
    $this->setPrimerApellido($PrimerApellido);
    $this->setSegundoApellido($SegundoApellido);
    $this->setEdad($Edad);
    $this->setIdentidad($identidad);
    $this->setGenero($Genero);

}



}



?>