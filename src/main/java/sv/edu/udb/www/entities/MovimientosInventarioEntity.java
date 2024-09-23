package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "movimientos_inventario", schema = "catedra_libreria_sandie", catalog = "")
public class MovimientosInventarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "producto_id", nullable = false)
    private int productoId;
    @Basic
    @Column(name = "tipo_movimiento", nullable = false)
    private Object tipoMovimiento;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "fecha_movimiento", nullable = false)
    private Date fechaMovimiento;
    @Basic
    @Column(name = "empleado_id", nullable = true)
    private Integer empleadoId;
    @Basic
    @Column(name = "descripcion", nullable = true, length = -1)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
    private ProductosEntity productosByProductoId;
    @ManyToOne
    @JoinColumn(name = "empleado_id", referencedColumnName = "id")
    private EmpleadoEntity empleadoByEmpleadoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public Object getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Object tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
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

        MovimientosInventarioEntity that = (MovimientosInventarioEntity) o;

        if (id != that.id) return false;
        if (productoId != that.productoId) return false;
        if (cantidad != that.cantidad) return false;
        if (tipoMovimiento != null ? !tipoMovimiento.equals(that.tipoMovimiento) : that.tipoMovimiento != null)
            return false;
        if (fechaMovimiento != null ? !fechaMovimiento.equals(that.fechaMovimiento) : that.fechaMovimiento != null)
            return false;
        if (empleadoId != null ? !empleadoId.equals(that.empleadoId) : that.empleadoId != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + productoId;
        result = 31 * result + (tipoMovimiento != null ? tipoMovimiento.hashCode() : 0);
        result = 31 * result + cantidad;
        result = 31 * result + (fechaMovimiento != null ? fechaMovimiento.hashCode() : 0);
        result = 31 * result + (empleadoId != null ? empleadoId.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public ProductosEntity getProductosByProductoId() {
        return productosByProductoId;
    }

    public void setProductosByProductoId(ProductosEntity productosByProductoId) {
        this.productosByProductoId = productosByProductoId;
    }

    public EmpleadoEntity getEmpleadoByEmpleadoId() {
        return empleadoByEmpleadoId;
    }

    public void setEmpleadoByEmpleadoId(EmpleadoEntity empleadoByEmpleadoId) {
        this.empleadoByEmpleadoId = empleadoByEmpleadoId;
    }
}
