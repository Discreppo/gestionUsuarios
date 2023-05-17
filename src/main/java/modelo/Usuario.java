/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author daw1
 */
public class Usuario implements Serializable,Comparable<Usuario>{
    
    private String nombre;    
    private String password;    
    private String email;    
    private boolean activo;
    private TipoUsuario rol;    
    private LocalDate fechaAlta;    
    private LocalDateTime ultimoAcceso;

    public Usuario() {
        
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String password, String email, TipoUsuario rol) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.rol = rol;
    }
    
    
    public LocalDateTime getUltimoAcceso() {
        return ultimoAcceso;
    }

    
    public void setUltimoAcceso(LocalDateTime ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }


    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    
    public TipoUsuario getRol() {
        return rol;
    }

    
    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }


    
    public boolean isActivo() {
        return activo;
    }

    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }


   
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }


    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public int compareTo(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return  nombre + "," + password + "," + email + "," + activo + "," + rol + "," + fechaAlta + "," + ultimoAcceso;
    }

    
}
