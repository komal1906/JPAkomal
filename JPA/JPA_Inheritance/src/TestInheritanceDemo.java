import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ems.util.JPAUtil;

public class TestInheritanceDemo {
	public static void main(String args[])
	{
		Emp rahul=new Emp();
		rahul.setEmpName("Rahul");
		rahul.setEmpSal(78945);
		Manager vaishali= new Manager();
		vaishali.setEmpName("VaishaliS");
		vaishali.setEmpSal(5000.0F);
		vaishali.setDeptName("Java");
		
		EntityManager em=JPAUtil.getEntityManager();
		EntityTransaction tran =em.getTransaction();
		tran.begin();
		em.persist(rahul);
		em.persist(vaishali);
		tran.commit();
		System.out.println("Data is inserted");
		
		
		Manager ee1=em.find(Manager.class, 70);
		System.out.println(ee1.getEmpName());
		
	}

}
