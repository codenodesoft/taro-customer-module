package software.cstl.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import software.cstl.domain.enumeration.WeekDay;
import software.cstl.domain.enumeration.WeekendStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Weekend.class)
public abstract class Weekend_ {

	public static volatile SingularAttribute<Weekend, Long> id;
	public static volatile SingularAttribute<Weekend, WeekDay> day;
	public static volatile SingularAttribute<Weekend, WeekendStatus> status;

	public static final String ID = "id";
	public static final String DAY = "day";
	public static final String STATUS = "status";

}

