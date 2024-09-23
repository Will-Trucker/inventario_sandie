package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "productos", schema = "catedra_libreria_sandie", catalog = "")
public class ProductosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "descripcion", nullable = true, length = -1)
    private String descripcion;
    @Basic
    @Column(name = "precio", nullable = false, precision = 2)
    private BigDecimal precio;
    @Basic
    @Column(name = "stock", nullable = false)
    private int stock;
    @Basic
    @Column(name = "categoria_id", nullable = true)
    private Integer categoriaId;
    @Basic
    @Column(name = "proveedor_id", nullable = true)
    private Integer proveedorId;
    @Basic
    @Column(name = "ubicacion", nullable = true, length = 100)
    private String ubicacion;
    @Basic
    @Column(name = "fecha_ingreso", nullable = false)
    private Date fechaIngreso;
    @OneToMany(mappedBy = "productosByProductoId")
    private Collection<MovimientosInventarioEntity> movimientosInventariosById;
    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private CategoriasEntity categoriasByCategoriaId;
    @ManyToOne
    @JoinColumn(name = "proveedor_id", referencedColumnName = "id")
    private ProveedoresEntity proveedoresByProveedorId;

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductosEntity that = (ProductosEntity) o;

        if (id != that.id) return false;
        if (stock != that.stock) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (precio != null ? !precio.equals(that.precio) : that.precio != null) return false;
        if (categoriaId != null ? !categoriaId.equals(that.categoriaId) : that.categoriaId != null) return false;
        if (proveedorId != null ? !proveedorId.equals(that.proveedorId) : that.proveedorId != null) return false;
        if (ubicacion != null ? !ubicacion.equals(that.ubicacion) : that.ubicacion != null) return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(that.fechaIngreso) : that.fechaIngreso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + stock;
        result = 31 * result + (categoriaId != null ? categoriaId.hashCode() : 0);
        result = 31 * result + (proveedorId != null ? proveedorId.hashCode() : 0);
        result = 31 * result + (ubicacion != null ? ubicacion.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        return result;
    }

    public Collection<MovimientosInventarioEntity> getMovimientosInventariosById() {
        return movimientosInventariosById;
    }

    public void setMovimientosInventariosById(Collection<MovimientosInventarioEntity> movimientosInventariosById) {
        this.movimientosInventariosById = movimientosInventariosById;
    }

    public CategoriasEntity getCategoriasByCategoriaId() {
        return categoriasByCategoriaId;
    }

    public void setCategoriasByCategoriaId(CategoriasEntity categoriasByCategoriaId) {
        this.categoriasByCategoriaId = categoriasByCategoriaId;
    }

    public ProveedoresEntity getProveedoresByProveedorId() {
        return proveedoresByProveedorId;
    }

    public void setProveedoresByProveedorId(ProveedoresEntity proveedoresByProveedorId) {
        this.proveedoresByProveedorId = proveedoresByProveedorId;
    }
}
