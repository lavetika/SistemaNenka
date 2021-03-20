
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dianacastro
 */

@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "calle", length = 50, nullable = false)
    private String calle;
    
    @Column(name = "numero", nullable = false)
    private int numero;
    
    @Column(name = "colonia", length = 20, nullable = false)
    private String colonia;
    
    @OneToOne(mappedBy="direccion")
    private Cliente cliente;
    
    @OneToOne(mappedBy="direccion")
    private Proveedor provedor;

    public Direccion() {
    }

    public Direccion(String calle, int numero, String colonia) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public Proveedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Proveedor provedor) {
        this.provedor = provedor;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + '}';
    }
    
    
    
}
