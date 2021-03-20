
package dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name = "total", nullable = false)
    private float total;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    private List<DetalleVenta> detallesVentas;
    

    public Venta() {
    }

    public Venta(Date fecha, float total, Empleado empleado, Cliente cliente) {
        this.fecha = fecha;
        this.total = total;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<DetalleVenta> getDetallesVentas() {
        return detallesVentas;
    }

    public void setDetallesVentas(List<DetalleVenta> detallesVentas) {
        this.detallesVentas = detallesVentas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    
}
