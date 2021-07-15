package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario= new Funcionario("Ana",LocalDate.now(),new BigDecimal("1000.00"));
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario= new Funcionario("Ana",LocalDate.now(),new BigDecimal("1000.00"));
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario= new Funcionario("Ana",LocalDate.now(),new BigDecimal("1000.00"));
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}

}
