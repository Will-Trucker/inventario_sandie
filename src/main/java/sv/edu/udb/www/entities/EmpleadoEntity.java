package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "empleado", schema = "catedra_libreria_sandie", catalog = "")
public class EmpleadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Basic
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;
    @Basic
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic
    @Column(name = "rol", nullable = true, length = 50)
    private String rol;
    @OneToMany(mappedBy = "empleadoByEmpleadoId")
    private Collection<MovimientosInventarioEntity> movimientosInventariosById;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadoEntity that = (EmpleadoEntity) o;

        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(that.fechaNacimiento) : that.fechaNacimiento != null)
            return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        return result;
    }

    public Collection<MovimientosInventarioEntity> getMovimientosInventariosById() {
        return movimientosInventariosById;
    }

    public void setMovimientosInventariosById(Collection<MovimientosInventarioEntity> movimientosInventariosById) {
        this.movimientosInventariosById = movimientosInventariosById;
    }
}
