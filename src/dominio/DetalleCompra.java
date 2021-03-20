
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
@Table(name = "detalles_compras")
public class DetalleCompra extends EntityBase {

    private static final long serialVersionUID = 1326288083267655811L;
    
    @Column(name = "cantidad", nullable = false)
    private float cantidad;
    
    @Column(name = "precio_unitario", nullable = false)
    private float precioUnitario;
    
    @Column(name = "importe", nullable = false)
    private float importe;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_compra")
    private Compra compra;
    

    public DetalleCompra() {
    }

    public DetalleCompra(float cantidad, float precioUnitario, float importe, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
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
