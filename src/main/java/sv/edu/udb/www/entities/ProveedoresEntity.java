package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "proveedores", schema = "catedra_libreria_sandie", catalog = "")
public class ProveedoresEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;
    @Basic
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "nombre_representante", nullable = false, length = 100)
    private String nombreRepresentante;
    @OneToMany(mappedBy = "proveedoresByProveedorId")
    private Collection<ProductosEntity> productosById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProveedoresEntity that = (ProveedoresEntity) o;

        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nombreRepresentante != null ? !nombreRepresentante.equals(that.nombreRepresentante) : that.nombreRepresentante != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nombreRepresentante != null ? nombreRepresentante.hashCode() : 0);
        return result;
    }

    public Collection<ProductosEntity> getProductosById() {
        return productosById;
    }

    public void setProductosById(Collection<ProductosEntity> productosById) {
        this.productosById = productosById;
    }
}
