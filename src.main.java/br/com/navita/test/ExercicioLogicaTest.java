package br.com.navita.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.navita.logica.ExercicioLogica;

public class ExercicioLogicaTest {
	
	@Test
	public void testFindFamily() {
		int i;		
		i = ExercicioLogica.findFamliy(12345);
		Assert.assertEquals(54321, i);
		
		i = ExercicioLogica.findFamliy(123456789);
		Assert.assertEquals(-1, i);
		
		i = ExercicioLogica.findFamliy(100000000);
		Assert.assertEquals(100000000, i);

	}

}
