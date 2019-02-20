import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="mgr_store")
@DiscriminatorValue(value="MGR")
public class Manager extends Emp{
	
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + "]";
	}

	public Manager(int empId, String empName, float empSal, String deptName) {
		super(empId, empName, empSal);
		this.deptName = deptName;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, String empName, float empSal) {
		super(empId, empName, empSal);
		// TODO Auto-generated constructor stub
	}
	
}
