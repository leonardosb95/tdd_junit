import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumeros() {
		Calculadora calc= new Calculadora();
		int soma=calc.somar(10, 5);
		Assert.assertEquals(15, soma);
	}
	

}

