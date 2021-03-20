
package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class Empleado extends Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Empleado{" + "corte=" + cortes + ", puesto=" + puesto + '}';
    }
    
     
   
    
}
