<?php

include_once("Direccion.php");
class Persona extends Direccion
{


   private $PrimerNombre;
   private $PrimerApellido;
   private $SegundoNombre;
   private $SegundoApellido;
   private $Edad;
   private $Genero;
   //private direccion
   public $identidad;

   public $objDireccion;

   //constructor
   public function __construct($departamento, $municipio, $colonia, $numeroBloque, $codigoPostal, $numeroCasa, $PrimerNombre, $SegundoNombre, $PrimerApellido, $SegundoApellido, $Edad, $identidad, $Genero)
   {
      $this->PrimerNombre = $PrimerNombre;
      $this->SegundoNombre = $SegundoNombre;
      $this->PrimerApellido = $PrimerApellido;
      $this->SegundoApellido = $SegundoApellido;
      $this->Edad = $Edad;
      $this->identidad = $identidad;
      $this->Genero = $Genero;
      //objeto para direccion de las especializaciones de persona
      $this->objDireccion = new Direccion($departamento, $municipio, $colonia, $numeroBloque, $numeroCasa, $codigoPostal); 
      
   }


   //metodo para importar la direccion de la persona 
   /* public function obtenerDireccion(){
     $direction = $direccion->$
    }*/

public function getobjDireccion(){
  return $this->objDireccion;
}

   //getters 
   public function getPrimerNombre()
   {
      return $this->PrimerNombre;
   }
   public function getPrimerApellido()
   {
      return $this->PrimerApellido;
   }
   public function getSegundoNombre()
   {
      return $this->SegundoNombre;
   }
   public function getSegundoApellido()
   {
      return $this->SegundoApellido;
   }
   public function getEdad()
   {
      return $this->Edad;
   }
   public function getGenero()
   {
      return $this->Genero;
   }
   public function getIdentidad()
   {
      return $this->identidad;
   }


   //setters
   public function setPrimerNombre($PrimerNombre)
   {
      $this->PrimerNombre = $PrimerNombre;
      return $this;
   }
   public function setPrimerApellido($PrimerApellido)
   {
      $this->PrimerApellido = $PrimerApellido;
      return $this;
   }
   public function setSegundoNombre($SegundoNombre)
   {
      $this->SegundoNombre = $SegundoNombre;
      return $this;
   }
   public function setSegundoApellido($SegundoApellido)
   {
      $this->SegundoApellido = $SegundoApellido;
      return $this;
   }
   public function setEdad($edad)
   {
      $this->edad = $edad;
      return $this;
   }
   public function setGenero($Genero)
   {
      $this->Genero = $Genero;
      return $this;
   }
   public function setIdentidad($identidad)
   {
      $this->identidad = $identidad;
   }

   public function toString() {
      // Retorna una representación en forma de cadena de texto del objeto Denunciante
      return "ID: " . $this->getIdentidad() . ", 
      Nombre: " . $this->getPrimerNombre() . " ". $this->getSegundoNombre() . ", 
      Apellido: " . $this->getPrimerApellido() . " ". $this->getSegundoApellido() . ",
      Edad: "  . $this->getEdad() . ",
      Genero: " . $this->getGenero() . ",
      Dirección: " . $this->objDireccion->toString(); // Llama al método __toString de la clase Direccion
  }
  
  }











?>