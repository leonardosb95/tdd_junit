import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora cal= new Calculadora();
		int soma =cal.somar(3, 7);
		
		 soma =cal.somar(3, 0);
		
		 soma =cal.somar(0, 0);
		
		 soma =cal.somar(3, -1);

	}

}
