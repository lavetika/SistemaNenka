package dominio;

import dominio.Producto;
import dominio.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ extends EntityBase_ {

    public static volatile SingularAttribute<DetalleVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleVenta, Double> precioUnitario;
    public static volatile SingularAttribute<DetalleVenta, Double> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleVenta, Double> importe;

}