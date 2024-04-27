<?php

include_once("Direccion.php");
class Delito extends Direccion
{
    private $calle;
    private $TipoDelito;
    private $Descripcion;
    protected $property;

    

    // constructor implementacion de concepto de composicion para que al momento de
    // borrar el delito tambien se borre su direccion donde ocurrio
    public function __construct($departamento, $municipio, $colonia, $numeroBloque, $calle, $TipoDelito, $Descripcion)
    {
        $this->calle = $calle;
        $this->TipoDelito = $TipoDelito;
        $this->Descripcion = $Descripcion;

        $objDireccionDelito = new Direccion($departamento, $municipio, $colonia, $numeroBloque, $calle);
    }

    //getters

    public function getCalle(){
        return $this->calle;
    }
    public function getTipoDelito(){
        return $this->TipoDelito;
    }
    public function getDescripcion(){
        return $this->Descripcion;
    }
    

    
    //setters
    public function setCalle($calle){
        $this->calle = $calle;
        return $this;
    }
    public function setTipoDelito($TipoDelito){
        $this->TipoDelito = $TipoDelito;
        return $this;
    }
    public function setDescripcion($Descripcion){
        $this->Descripcion = $Descripcion;
        return $this;
    }

}



?>