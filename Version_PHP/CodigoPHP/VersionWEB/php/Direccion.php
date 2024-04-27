<?php


class Direccion
{
    private $departamento;
    private $municipio;
    private $colonia;
    private $numeroBloque;
    private $numeroCasa;
    private $codigoPostal;


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
}








?>