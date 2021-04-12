package dominio;

import dominio.DetalleCompra;
import dominio.Empleado;
import dominio.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T00:24:29")
@StaticMetamodel(Compra.class)
public class Compra_ extends EntityBase_ {

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Float> total;
    public static volatile ListAttribute<Compra, DetalleCompra> detalleCompras;
    public static volatile SingularAttribute<Compra, Empleado> empleado;
    public static volatile SingularAttribute<Compra, Proveedor> proveedor;

}