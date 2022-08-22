package Lab4;
import Lab4.Employee;
import java.util.*;
public interface EmpServices {
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
}
