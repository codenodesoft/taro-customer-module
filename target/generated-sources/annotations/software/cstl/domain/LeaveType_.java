package software.cstl.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import software.cstl.domain.enumeration.LeaveTypeName;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveType.class)
public abstract class LeaveType_ {

	public static volatile SingularAttribute<LeaveType, BigDecimal> totalDays;
	public static volatile SingularAttribute<LeaveType, LeaveTypeName> name;
	public static volatile SingularAttribute<LeaveType, Long> id;

	public static final String TOTAL_DAYS = "totalDays";
	public static final String NAME = "name";
	public static final String ID = "id";

}

