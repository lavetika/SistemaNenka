
package dominio;

import java.io.Serializable;
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
    private int cantidad;
    
    @Column(name = "precio_unitario", nullable = false)
    private float precioUnitario;
    
    @Column(name = "importe", nullable = false)
    private float importe;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_venta")
    private Venta venta;
    


    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, float precioUnitario, float importe, Producto producto) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
