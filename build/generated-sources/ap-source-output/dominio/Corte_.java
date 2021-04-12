package dominio;

import dominio.Empleado;
import enums.TipoCorte;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T00:24:29")
@StaticMetamodel(Corte.class)
public class Corte_ extends EntityBase_ {

    public static volatile SingularAttribute<Corte, Date> fecha;
    public static volatile SingularAttribute<Corte, Float> monto;
    public static volatile SingularAttribute<Corte, Empleado> empleado;
    public static volatile SingularAttribute<Corte, TipoCorte> tipoCorte;

}