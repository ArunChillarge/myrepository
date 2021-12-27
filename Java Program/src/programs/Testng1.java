package programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {

	
	@Test
	public void a2() {
	System.out.println("a2 test method");			
	}
	@BeforeTest
	public void b() {
		System.out.println("b method");
	}
	@BeforeSuite
	public void c()
	{
		System.out.println("c method");
	}
	@BeforeMethod
	public void d()
	{
		System.out.println("d method");
			}
	@BeforeClass
	public void e()
	{
		System.out.println("e method");
			}
	@AfterTest
		public void f() {
		System.out.println("f method");
	}
	@AfterClass
	public void g() {
		System.out.println("g method");
	}
	@AfterMethod
	public void h() {
		System.out.println("h method");
	}
	@AfterSuite
	public void i(){
		System.out.println("i method");
	}
	@Test
	public void a1(){
		System.out.println("a1 test method");
	}
}
