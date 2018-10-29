package suites;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import basic.BasicTest;
import basic.CarTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BasicTest.class,
   CarTest.class
})

public class FluxoBasicoSuite { 
	
	@BeforeClass
	public static void startingSuite(){
		System.out.println("INICIANDO SUITE DE TESTES");
	}

	@AfterClass
	public static void doneSuite(){
		System.out.println("SUITE DE TESTES EXECUTADA!");
	}
}  


