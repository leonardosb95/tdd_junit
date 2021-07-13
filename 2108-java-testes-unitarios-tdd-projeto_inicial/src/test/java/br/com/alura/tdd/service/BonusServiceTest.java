package br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service= new BonusService();
		BigDecimal bonus=service.calcularBonus(new Funcionario("Rodrigo",LocalDate.now(),new BigDecimal("25000")));
		assertEquals(new BigDecimal("0.00"),bonus);
	}
	
	@Test
	void bonusDeveriaSer10PorCentroDoSalario() {
		BonusService service= new BonusService();
		BigDecimal bonus=service.calcularBonus(new Funcionario("Rodrigo",LocalDate.now(),new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.00"),bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatatamento1000() {
		BonusService service= new BonusService();
		BigDecimal bonus=service.calcularBonus(new Funcionario("Rodrigo",LocalDate.now(),new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"),bonus);
	}

}
