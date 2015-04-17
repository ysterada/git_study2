package employ;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import user.bean.RegistrantInfo;
import user.parts.RegInfDAO;

public class OutLogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		System.out.println("---START UT003-001---");	

		OutLog.outLogDmp("sampleÅFÉTÉìÉvÉã");

		System.out.println("---END UT003-001---");	
		
	}

	@Test
	public void test2() {
		
		System.out.println("---START UT003-002---");	

		OutLog.outLogDmp(12345);

		System.out.println("---END UT003-002---");	
		
	}
	
}
