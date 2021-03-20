
package dominio;

import java.util.Date;
import enums.TipoCorte;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dianacastro
 */
@Entity
@Table(name = "cortes")
public class Corte implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "monto", nullable = false)
    private float monto;
    
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    
    @Column(name="tipo_corte", nullable = false, length = 8 )
    @Enumerated(value = EnumType.STRING)
    private TipoCorte tipoCorte;
    
    public Corte() {
    }

    public Corte(float monto, Date fecha, TipoCorte tipoCorte) {
        this.monto = monto;
        this.fecha = fecha;
        this.tipoCorte = tipoCorte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoCorte getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(TipoCorte tipoCorte) {
        this.tipoCorte = tipoCorte;
    }
        
    
}
