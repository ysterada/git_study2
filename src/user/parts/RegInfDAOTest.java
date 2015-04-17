package user.parts;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import user.bean.RegistrantInfo;

import com.javaranch.unittest.helper.sql.pool.JNDIUnitTestHelper;

public class RegInfDAOTest {

	@Before
	public void setUp() throws Exception {

		JNDIUnitTestHelper.init("WebContent/WEB-INF/classes/jndi_unit_test_helper.properties");
		
	}

	@Test
	public void testInsert() {
		
		RegInfDAO dao = new RegInfDAO();
		
		System.out.println("---START UT002-001---");
		String regId = "004";
		String regName = "佐藤路未央";
		String regAge = "28";
		
		ArrayList<RegistrantInfo> sample = new ArrayList();
		
		sample = dao.getReglist(); 
		
		System.out.println();
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}
		System.out.println();
		
		dao.insert(regId, regName , regAge);
				
		sample = dao.getReglist(); 
		
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}	
		
		System.out.println(" ");						
		System.out.println("---END UT002-001---");
		
	}
	
	@Test	
	public void testUpdate() {
		
		RegInfDAO dao = new RegInfDAO();

		System.out.println("---START UT002-002---");
		String regId = "002";
		String regName = "Michael";
		String regAge = "29";
		
		ArrayList<RegistrantInfo> sample = new ArrayList();
		
		sample = dao.getReglist(); 
		
		System.out.println();
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}
		System.out.println();
		
		dao.update(regId, regName , regAge);
				
		sample = dao.getReglist(); 
		
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}	
		
		System.out.println(" ");						
		System.out.println("---END UT002-002---");
		
	}

	@Test
	public void testDelete() {
	
		RegInfDAO dao = new RegInfDAO();

		System.out.println("---START UT002-003---");
		String regId = "001";
		
		ArrayList<RegistrantInfo> sample = new ArrayList();
		
		sample = dao.getReglist(); 
		
		System.out.println();
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}
		System.out.println();
		
		dao.delete(regId);
				
		sample = dao.getReglist(); 
		
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}	
		
		System.out.println(" ");						
		System.out.println("---END UT002-003---");
				
	}

	@Test
	public void testGetReglist() {

		RegInfDAO dao = new RegInfDAO();

		System.out.println("---START UT002-004---");
		
		ArrayList<RegistrantInfo> sample = new ArrayList();
		
		sample = dao.getReglist(); 
		
		System.out.println();
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
		    System.out.println(data.getrId() + " " + data.getrName() + " " + data.getrAge());

		}
		
		System.out.println(" ");						
		System.out.println("---END UT002-004---");		
				
	}

	@Test
	public void testGetNextId() {
	
		RegInfDAO dao = new RegInfDAO();
		System.out.println("---START UT002-005---");	
		
		ArrayList<RegistrantInfo> sample = new ArrayList();
		
		sample = dao.getReglist(); 

		String regId;
		
		for (int i = 0 ; i < sample.size() ; i++){
			RegistrantInfo data = sample.get(i);
			regId = data.getrId();
			dao.delete(regId);
		}		
		
		String ID = dao.getNextId();
		
		System.out.println("ID:" + ID + "を取得しました。");
		
		dao.insert("001", "鈴木太郎" , "35");
		dao.insert("002", "Tommy" , "25");
		dao.insert("003", "山田花子" , "30");
		
		System.out.println(" ");						
		System.out.println("---END UT002-005---");	
		
	}

}
