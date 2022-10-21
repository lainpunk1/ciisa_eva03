/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lainpunk1
 */
@Entity
@Table(name = "peliculas")
@NamedQueries({
    @NamedQuery(name = "Peliculas.findAll", query = "SELECT p FROM Peliculas p"),
    @NamedQuery(name = "Peliculas.findByIdpelicula", query = "SELECT p FROM Peliculas p WHERE p.idpelicula = :idpelicula"),
    @NamedQuery(name = "Peliculas.findByNombre", query = "SELECT p FROM Peliculas p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Peliculas.findByGenero", query = "SELECT p FROM Peliculas p WHERE p.genero = :genero")})
public class Peliculas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpelicula")
    private Integer idpelicula;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "genero")
    private String genero;

    public Peliculas() {
    }

    public Peliculas(Integer idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Integer getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Integer idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpelicula != null ? idpelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peliculas)) {
            return false;
        }
        Peliculas other = (Peliculas) object;
        if ((this.idpelicula == null && other.idpelicula != null) || (this.idpelicula != null && !this.idpelicula.equals(other.idpelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Peliculas[ idpelicula=" + idpelicula + " ]";
    }
    
}
