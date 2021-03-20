
package dominio;

import enums.Rol;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */
@Entity
@Table(name = "puestos")
public class Puesto extends EntityBase {

    private static final long serialVersionUID = 908962861052720457L;
    
    @Column(name="rol", nullable = false, length = 8 )
    @Enumerated(value = EnumType.STRING)
    private Rol rol; 
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "puesto")
    private List<Empleado> empleados;

    public Puesto() {
    }

    public Puesto(Rol rol) {
        this.rol = rol;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
