/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author op181
 */
public class Cliente {

    private int id ;
    private String Nombre, Correo,Telf, Edad;
   private String nombre2;
   
    public Cliente(int id,String Nombre , String Edad,String Correo , String Telf) {
        this.id = id;
        this.Telf = Telf;
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Correo = Correo;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void Buscar(String nombre2){
    this.nombre2=nombre2;
}
   public String getnombre2(){
       return nombre2;
   }
   public void setNombre2(String nombre2){
       this.nombre2=nombre2;
   }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelf() {
        return Telf;
    }

    public void setTelf(String Telf) {
        this.Telf = Telf;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    

}
