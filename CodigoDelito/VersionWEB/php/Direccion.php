<?php


class Direccion
{
    private $departamento;
    private $municipio;
    private $colonia;
    private $numeroBloque;
    private $numeroCasa;
    private $codigoPostal;
   
    //contructor 
    //a diferencia de java php no permite tener mas de un constructor por loq ue fue necesario indicar
    //que algunos paramentros serian opcionales, ya que delito requiere de una direccion, pero no
    //no requiere los mismo paramentro que la direccion de las personas
    public function __construct($departamento, $municipio, $colonia, $numeroBloque, $numeroCasa = null, $codigoPostal= null)
    {
        $this->departamento = $departamento;
        $this->municipio = $municipio;
        $this->colonia = $colonia;
        $this->numeroBloque = $numeroBloque;
        $this->numeroCasa = $numeroCasa ?: 'no requiere numerocasa'; 
        $this->codigoPostal = $codigoPostal ?: 'no requiere codigo postal';
    }

    


    //getters
    public function getDepartamento(){
        return $this->departamento;
    }
    public function getMunicipio(){
        return $this->municipio;
    }
    public function getColonia(){
        return $this->colonia;
    }
    public function getNumeroBloque(){
        return $this->numeroBloque;
    }
    public function getNumeroCasa(){
        return $this->numeroCasa;
    }
    public function getCodigoPostal(){
        return $this->codigoPostal;
    }




    //setters
    public function setMunicipio($municipio){
        $this->municipio = $municipio;

        return $this;
    }
    public function setDepartamento($departamento){
        $this->departamento = $departamento;

        return $this;
    }
    public function setColonia($colonia){

        $this->colonia = $colonia;

        return $this;
    }
    public function setNumeroBloque($numeroBloque){
        $this->numeroBloque = $numeroBloque;

        return $this;
    }
    public function setNumeroCasa($numeroCasa) {
        $this->numeroCasa = $numeroCasa;

        return $this;
    }
    public function setCodigoPostal($codigoPostal){
        $this->codigoPostal = $codigoPostal;

        return $this;
    }

    public function toString(){
        return "Direccion: ". $this->getDepartamento(). ", ".$this->getMunicipio().", colonia " .$this->getColonia(). ", Bloque ". $this->getNumeroBloque() . ", casa ". $this->getNumeroCasa();
    }
}








?>