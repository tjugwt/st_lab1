package test;

import org.junit.Before;
import org.junit.Test;

import check.Check;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class test {

	Check c = null;
	String mes="测试正确";
	
	@Before
	public void testBeforeClass(){
		c = new Check();
	}
	
	@Test
	public void test6() {
		boolean r=c.check(4);
		Assert.assertFalse(r);
	}
	
	@Test
	public void test8() {
		boolean r=c.check(1);
		Assert.assertTrue(r);
	}
	
//	@Test
//	public void test1() {
//		boolean r=c.check(78);
////		String message="测试正确";
//		Assert.assertTrue(r);
//	}
//	
//	@Test
//	public void test2() {
//		boolean r=c.check(70);
//		Assert.assertTrue(r);
//	}
//	
//	@Test
//	public void test3() {
//		boolean r=c.check(56);
//		Assert.assertTrue(r);
//	}
	
//	@Test
//	public void test4() {
//		boolean r=c.check(54);
//		Assert.assertFalse(r);
//	}
//	
//	@Test
//	public void test5() {
//		boolean r=c.check(26);
//		Assert.assertTrue(r);
//	}
//		
//	@Test
//	public void test7() {
//		boolean r=c.check(3);
//		Assert.assertTrue(r);
//	}
	
	
}
