<?php
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


   //metodo para importar la direccion de la persona 
   /* public function obtenerDireccion(){
     $direction = $direccion->$
    }*/
  
   //getters 
   public function getPrimerNombre(){
      return $this->PrimerNombre;
   }
   public function getPrimerApellido(){
      return $this->PrimerApellido;
   }
   public function getSegundoNombre(){
      return $this->SegundoNombre;
   }
   public function getSegundoApellido(){
      return $this->SegundoApellido;
   }
   public function getEdad(){
      return $this->Edad;
   }
   public function getGenero(){
      return $this->Genero;
   }


   //setters
   public function setPrimerNombre($PrimerNombre){
      $this->PrimerNombre = $PrimerNombre;
      return $this;
   }
   public function setPrimerApellido($PrimerApellido){
      $this->$PrimerApellido = $PrimerApellido;
      return $this;
   }
   public function setSegundoNombre($SegundoNombre){
      $this->$SegundoNombre = $SegundoNombre;
      return $this;
   }
   public function setSegundoApellido($SegundoApellido){
      $this->$SegundoApellido = $SegundoApellido;
      return $this;
   }
   public function setEdad($edad){
    $this->$edad = $edad;
    return $this;
   }
   public function setGenero($Genero){
      $this->$Genero = $Genero;
      return $this;
   }
   public function setIdentidad($identidad){
      $this->$identidad = $identidad;
   }

}









?>