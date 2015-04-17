package user.parts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class RegInfCheckTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test	
	public void testCheckName1() {

		System.out.println("---START UT001-001---");	
		
		RegInfCheck test = new RegInfCheck();
		test.checkName("0123456789");
		
		String msg = "";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-001---");

	}
	
	@Test	
	public void testCheckName2() {

		System.out.println("---START UT001-002---");	
		
		RegInfCheck test = new RegInfCheck();
		test.checkName("あいうえおかきくけこ");
		
		String msg = "";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-002---");

	}
		
	@Test	
	public void testCheckName3() {

		System.out.println("---START UT001-003---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkName("01234567890");
		
		String msg = "名前は10桁以内で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-003---");

	}
	
	@Test	
	public void testCheckName4() {

		System.out.println("---START UT001-004---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkName("あいうえおかきくけこさ");
		
		String msg = "名前は10桁以内で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-004---");

	}
		
	@Test
	public void testCheckAge1() {
		
		System.out.println("---START UT001-005---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("16");
		
		String msg = "";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-005---");

	}

	@Test
	public void testCheckAge2() {
		
		System.out.println("---START UT001-006---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("60");
		
		String msg = "";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-006---");

	}
	
	@Test
	public void testCheckAge3() {
		
		System.out.println("---START UT001-007---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("15");
		
		String msg = "年齢は(16-60)の範囲で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-007---");

	}

	@Test
	public void testCheckAge4() {
		
		System.out.println("---START UT001-008---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("61");
		
		String msg = "年齢は(16-60)の範囲で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-008---");

	}
	
	@Test
	public void testCheckAge5() {
		
		System.out.println("---START UT001-009---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("１６");
		
		String msg = "年齢は数値(半角)で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-009---");

	}
	
	@Test
	public void testCheckAge6() {
		
		System.out.println("---START UT001-010---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("あいうえお");
		
		String msg = "年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-010---");

	}
	
	@Test
	public void testCheckAge7() {
		
		System.out.println("---START UT001-011---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkAge("16あいうえお");
		
		String msg = "年齢は数値(半角)で入力してください。<br />年齢は(16-60)の範囲で入力してください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-011---");

	}
	
	@Test
	public void testCheckId1() {

		System.out.println("---START UT001-012---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkId("999");
		
		String msg = "";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-012---");

	}
	
	@Test
	public void testCheckId2() {

		System.out.println("---START UT001-013---");
		
		RegInfCheck test = new RegInfCheck();
		test.checkId("1000");
		
		String msg = "登録可能なID（999）を超えています。管理者に問い合わせてください。<br />";
		
		assertEquals(msg, test.getErrMsg());
		
		System.out.println("---END UT001-013---");

	}
}
