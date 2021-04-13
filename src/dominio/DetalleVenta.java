
package dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "detalles_ventas")
public class DetalleVenta extends EntityBase {

    private static final long serialVersionUID = 2017822841704871770L;
    
    @Column(name = "cantidad", nullable = false)
    private double cantidad;
    
    @Column(name = "precio_unitario", nullable = false)
    private double precioUnitario;
    
    @Column(name = "importe", nullable = false)
    private double importe;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_venta")
    private Venta venta;
    


    public DetalleVenta() {
    }

    public DetalleVenta(double cantidad, double precioUnitario, double importe, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleVenta other = (DetalleVenta) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "DetalleVenta{" + "cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", importe=" + importe + ", producto=" + producto + '}';
    }
}
