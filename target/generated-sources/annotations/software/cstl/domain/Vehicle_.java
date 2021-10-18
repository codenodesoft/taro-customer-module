package software.cstl.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import software.cstl.domain.enumeration.ColourType;
import software.cstl.domain.enumeration.CylinderNumber;
import software.cstl.domain.enumeration.FuelType;
import software.cstl.domain.enumeration.VehicleType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vehicle.class)
public abstract class Vehicle_ {

	public static volatile SingularAttribute<Vehicle, Integer> horsePower;
	public static volatile SingularAttribute<Vehicle, String> engineNumber;
	public static volatile SingularAttribute<Vehicle, Integer> wheelBase;
	public static volatile SingularAttribute<Vehicle, Integer> cubicCapacity;
	public static volatile SingularAttribute<Vehicle, String> noOfStandee;
	public static volatile SingularAttribute<Vehicle, Integer> maxLaden;
	public static volatile SingularAttribute<Vehicle, Integer> unladenWeight;
	public static volatile SingularAttribute<Vehicle, VehicleType> type;
	public static volatile SingularAttribute<Vehicle, Integer> seats;
	public static volatile SingularAttribute<Vehicle, Integer> rpm;
	public static volatile SingularAttribute<Vehicle, String> prevRegnNo;
	public static volatile SingularAttribute<Vehicle, String> chassisNumber;
	public static volatile SingularAttribute<Vehicle, Integer> yearsOfManufacture;
	public static volatile SingularAttribute<Vehicle, ColourType> colour;
	public static volatile SingularAttribute<Vehicle, String> makersName;
	public static volatile SingularAttribute<Vehicle, String> typeOfBody;
	public static volatile SingularAttribute<Vehicle, FuelType> fuelUsed;
	public static volatile SingularAttribute<Vehicle, String> name;
	public static volatile SingularAttribute<Vehicle, String> classOfVehicle;
	public static volatile SingularAttribute<Vehicle, Long> id;
	public static volatile SingularAttribute<Vehicle, String> vehicleId;
	public static volatile SingularAttribute<Vehicle, CylinderNumber> numberOfCylinders;
	public static volatile SingularAttribute<Vehicle, String> makersCountry;

	public static final String HORSE_POWER = "horsePower";
	public static final String ENGINE_NUMBER = "engineNumber";
	public static final String WHEEL_BASE = "wheelBase";
	public static final String CUBIC_CAPACITY = "cubicCapacity";
	public static final String NO_OF_STANDEE = "noOfStandee";
	public static final String MAX_LADEN = "maxLaden";
	public static final String UNLADEN_WEIGHT = "unladenWeight";
	public static final String TYPE = "type";
	public static final String SEATS = "seats";
	public static final String RPM = "rpm";
	public static final String PREV_REGN_NO = "prevRegnNo";
	public static final String CHASSIS_NUMBER = "chassisNumber";
	public static final String YEARS_OF_MANUFACTURE = "yearsOfManufacture";
	public static final String COLOUR = "colour";
	public static final String MAKERS_NAME = "makersName";
	public static final String TYPE_OF_BODY = "typeOfBody";
	public static final String FUEL_USED = "fuelUsed";
	public static final String NAME = "name";
	public static final String CLASS_OF_VEHICLE = "classOfVehicle";
	public static final String ID = "id";
	public static final String VEHICLE_ID = "vehicleId";
	public static final String NUMBER_OF_CYLINDERS = "numberOfCylinders";
	public static final String MAKERS_COUNTRY = "makersCountry";

}

