import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestInheritanceDemo {

	public static void main(String[] args) {
		Emp rahul=new Emp();
		rahul.setEmpName("Rahul Chauhan");
		rahul.setEmpSal(50000.0F);
		Manager vaishali=new Manager();
		vaishali.setEmpName("VaishaliS");
		vaishali.setEmpSal(5000.0F);
		vaishali.setDeptName("JAVA");
		EntityManager em=JPAUtil.getEntiManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		em.persist(rahul);
		em.persist(vaishali);
		tran.commit();
		System.out.println("data inserted");
		

	}

}
