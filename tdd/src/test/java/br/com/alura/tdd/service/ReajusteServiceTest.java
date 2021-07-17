package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de todos");
	}
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de todos");
	}
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana",LocalDate.now(),new BigDecimal("1000.00"));
	}

	@Test
	void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}

}
