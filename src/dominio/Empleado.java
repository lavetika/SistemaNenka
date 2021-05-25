package dominio;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */
@Entity
@Table(name = "empleados")
public class Empleado extends Persona {

    private static final long serialVersionUID = 8358535933244006445L;

    @Column(name = "username")
    private String username;

    @Column(name = "contrasena")
    private String contrasena;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    private List<Corte> cortes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    private List<Venta> ventas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    private List<Compra> compras;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_puesto")
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(List<Corte> cortes, Puesto puesto) {
        this.cortes = cortes;
        this.puesto = puesto;
    }

    public List<Corte> getCortes() {
        return cortes;
    }

    public void setCortes(List<Corte> cortes) {
        this.cortes = cortes;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "corte=" + cortes + ", puesto=" + puesto + '}';
    }

}
