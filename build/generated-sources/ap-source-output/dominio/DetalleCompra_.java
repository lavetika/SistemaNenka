package dominio;

import dominio.Compra;
import dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ extends EntityBase_ {

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, Float> precioUnitario;
    public static volatile SingularAttribute<DetalleCompra, Float> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Producto> producto;
    public static volatile SingularAttribute<DetalleCompra, Float> importe;

}