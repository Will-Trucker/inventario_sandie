package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "categorias", schema = "catedra_libreria_sandie", catalog = "")
public class CategoriasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic
    @Column(name = "descripcion", nullable = true, length = -1)
    private String descripcion;
    @OneToMany(mappedBy = "categoriasByCategoriaId")
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriasEntity that = (CategoriasEntity) o;

        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public Collection<ProductosEntity> getProductosById() {
        return productosById;
    }

    public void setProductosById(Collection<ProductosEntity> productosById) {
        this.productosById = productosById;
    }
}
