package software.cstl.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import software.cstl.domain.enumeration.AttendanceMarkedAs;
import software.cstl.domain.enumeration.EmployeeCategory;
import software.cstl.domain.enumeration.EmployeeType;
import software.cstl.domain.enumeration.LeaveAppliedStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Attendance.class)
public abstract class Attendance_ {

	public static volatile SingularAttribute<Attendance, Instant> attendanceTime;
	public static volatile SingularAttribute<Attendance, AttendanceMarkedAs> markedAs;
	public static volatile SingularAttribute<Attendance, Line> line;
	public static volatile SingularAttribute<Attendance, Employee> employee;
	public static volatile SingularAttribute<Attendance, EmployeeCategory> employeeCategory;
	public static volatile SingularAttribute<Attendance, EmployeeType> employeeType;
	public static volatile SingularAttribute<Attendance, LeaveAppliedStatus> leaveApplied;
	public static volatile SingularAttribute<Attendance, Grade> grade;
	public static volatile SingularAttribute<Attendance, String> machineNo;
	public static volatile SingularAttribute<Attendance, String> employeeMachineId;
	public static volatile SingularAttribute<Attendance, Long> id;
	public static volatile SingularAttribute<Attendance, Designation> designation;
	public static volatile SingularAttribute<Attendance, Department> department;
	public static volatile SingularAttribute<Attendance, EmployeeSalary> employeeSalary;

	public static final String ATTENDANCE_TIME = "attendanceTime";
	public static final String MARKED_AS = "markedAs";
	public static final String LINE = "line";
	public static final String EMPLOYEE = "employee";
	public static final String EMPLOYEE_CATEGORY = "employeeCategory";
	public static final String EMPLOYEE_TYPE = "employeeType";
	public static final String LEAVE_APPLIED = "leaveApplied";
	public static final String GRADE = "grade";
	public static final String MACHINE_NO = "machineNo";
	public static final String EMPLOYEE_MACHINE_ID = "employeeMachineId";
	public static final String ID = "id";
	public static final String DESIGNATION = "designation";
	public static final String DEPARTMENT = "department";
	public static final String EMPLOYEE_SALARY = "employeeSalary";

}

