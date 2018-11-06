package com.example.a1144104313.listasfirebase;

public class Usuario {


    public String uid;
    public String nombre;
    public String correo;
    public String contrasena;

    public Usuario(){

    }

    public Usuario(String contrasena,String correo, String nombre, String uid){
        this.uid=uid;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena =contrasena;
    }

}
