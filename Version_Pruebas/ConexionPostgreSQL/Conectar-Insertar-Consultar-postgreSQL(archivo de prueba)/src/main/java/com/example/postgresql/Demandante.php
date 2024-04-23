<?php
class Persona
{
   private $PrimerNombre;
   private $PrimerApellido;
   private $SegundoNombre;
   private $SegundoApellido;
   private $Edad;
   private $Genero;
   //private direccion
   private $identidad;


   //metodo para importar la direccion de la persona 
   /* public function obtenerDireccion(){
     $direction = $direccion->$
    }*/
   /**
    * Get the value of PrimerNombre
    */
   public function getPrimerNombre()
   {
      return $this->PrimerNombre;
   }

   public function getPrimerApellido()
   {
      return $this-> $PrimerApellido;
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


   /**
    * Set the value of PrimerNombre
    *
    * @return  self
    */
   public function setPrimerNombre($PrimerNombre)
   {
      $this->PrimerNombre = $PrimerNombre;

      return $this;
   }

   public function setPrimerApellido($PrimerApellido)
   {
      $this->$PrimerApellido = $PrimerApellido;
      return $this;
   }

   public function setSegundoNombre($SegundoNombre)
   {
      $this->$SegundoNombre = $SegundoNombre;
      return $this;
   }

}









?>