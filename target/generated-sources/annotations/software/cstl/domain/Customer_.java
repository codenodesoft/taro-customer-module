package software.cstl.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import software.cstl.domain.enumeration.GenderType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> fatherOrHusband;
	public static volatile SingularAttribute<Customer, String> engineNo;
	public static volatile SingularAttribute<Customer, String> gassOrWaterOrElectricityBillContentType;
	public static volatile SingularAttribute<Customer, String> address;
	public static volatile SingularAttribute<Customer, String> passportAttachmentContentType;
	public static volatile SingularAttribute<Customer, byte[]> gassOrWaterOrElectricityBill;
	public static volatile SingularAttribute<Customer, GenderType> sex;
	public static volatile SingularAttribute<Customer, String> preRegnNo;
	public static volatile SingularAttribute<Customer, String> voterIdNo;
	public static volatile SingularAttribute<Customer, String> voterIdAttachmentContentType;
	public static volatile SingularAttribute<Customer, byte[]> birthCertificateAttachment;
	public static volatile SingularAttribute<Customer, LocalDate> dateOfBirth;
	public static volatile SingularAttribute<Customer, String> guardiansName;
	public static volatile SingularAttribute<Customer, String> phoneNo;
	public static volatile SingularAttribute<Customer, Vehicle> vehicle;
	public static volatile SingularAttribute<Customer, byte[]> passportAttachment;
	public static volatile SingularAttribute<Customer, String> poOrBank;
	public static volatile SingularAttribute<Customer, String> nationality;
	public static volatile SingularAttribute<Customer, Integer> yearsOfMfg;
	public static volatile SingularAttribute<Customer, String> chassisNo;
	public static volatile SingularAttribute<Customer, String> name;
	public static volatile SingularAttribute<Customer, String> birthCertificateAttachmentContentType;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, byte[]> voterIdAttachment;

	public static final String FATHER_OR_HUSBAND = "fatherOrHusband";
	public static final String ENGINE_NO = "engineNo";
	public static final String GASS_OR_WATER_OR_ELECTRICITY_BILL_CONTENT_TYPE = "gassOrWaterOrElectricityBillContentType";
	public static final String ADDRESS = "address";
	public static final String PASSPORT_ATTACHMENT_CONTENT_TYPE = "passportAttachmentContentType";
	public static final String GASS_OR_WATER_OR_ELECTRICITY_BILL = "gassOrWaterOrElectricityBill";
	public static final String SEX = "sex";
	public static final String PRE_REGN_NO = "preRegnNo";
	public static final String VOTER_ID_NO = "voterIdNo";
	public static final String VOTER_ID_ATTACHMENT_CONTENT_TYPE = "voterIdAttachmentContentType";
	public static final String BIRTH_CERTIFICATE_ATTACHMENT = "birthCertificateAttachment";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String GUARDIANS_NAME = "guardiansName";
	public static final String PHONE_NO = "phoneNo";
	public static final String VEHICLE = "vehicle";
	public static final String PASSPORT_ATTACHMENT = "passportAttachment";
	public static final String PO_OR_BANK = "poOrBank";
	public static final String NATIONALITY = "nationality";
	public static final String YEARS_OF_MFG = "yearsOfMfg";
	public static final String CHASSIS_NO = "chassisNo";
	public static final String NAME = "name";
	public static final String BIRTH_CERTIFICATE_ATTACHMENT_CONTENT_TYPE = "birthCertificateAttachmentContentType";
	public static final String ID = "id";
	public static final String VOTER_ID_ATTACHMENT = "voterIdAttachment";

}

