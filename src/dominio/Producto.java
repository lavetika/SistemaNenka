
package dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "productos")
public class Producto extends EntityBase{

    private static final long serialVersionUID = -7635722091768576018L;
    
    @Column(name = "codigo", nullable = false)
    private int codigo;
    
    @Column(name = "precio", nullable = false)
    private float precio;
    
    @Column(name = "nombre", length = 80, nullable = false)
    private String nombre;
    
    @Column(name = "stock", nullable = false)
    private double stock;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
    
    public Producto() {
    }

    public Producto(int codigo, float precio, String nombre, double stock, Categoria categoria, Proveedor proveedor) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.proveedor = proveedor;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor provedor) {
        this.proveedor = provedor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", "
                + "nombre=" + nombre + ", stock=" + stock + ", categoria=" + categoria + '}';
        
    }
    
    
    
}
