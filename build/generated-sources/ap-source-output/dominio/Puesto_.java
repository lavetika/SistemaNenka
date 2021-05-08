package dominio;

import dominio.Empleado;
import enums.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-08T12:27:59")
@StaticMetamodel(Puesto.class)
public class Puesto_ extends EntityBase_ {

    public static volatile ListAttribute<Puesto, Empleado> empleados;
    public static volatile SingularAttribute<Puesto, Rol> rol;

}