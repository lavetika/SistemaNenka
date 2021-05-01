package dominio;

import dominio.Compra;
import dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-26T21:39:35")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ extends EntityBase_ {

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, Float> precioUnitario;
    public static volatile SingularAttribute<DetalleCompra, Float> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Producto> producto;
    public static volatile SingularAttribute<DetalleCompra, Float> importe;

}