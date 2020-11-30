package ufcg.ccc.domino;

import ufcg.ccc.domino.estrategia.EstrategiaDeJogo;
import ufcg.ccc.domino.estrategia.EstrategiaInvalidaException;
import ufcg.ccc.domino.estrategia.JogaPrimeiraPossivel;

/**
 * Exemplo de como fazer um um main com uma disputa de muuuitos jogos entre duas
 * estratégias.
 * 
 */
public class DominoBrutalRepetido {

	public static void main(String[] args) throws EstrategiaInvalidaException, JogadaInvalidaException {
		int vitoriasJ1 = 0, vitoriasJ2 = 0, empates = 0, batidaUnica = 0, laelo = 0, carroca = 0, quadrado = 0, batidaUnica2 = 0, laelo2 = 0, carroca2 = 0, quadrado2 = 0;

		EstrategiaDeJogo estrategia1 = new JogaPrimeiraPossivel(), estrategia2 = new JogaPrimeiraPossivel(); 
		
		for (int i = 0; i < 10000; i++) {
			Jogo j = new Jogo("J1", estrategia1, "J2", estrategia2, 12);
			HistoricoDeJogo historico = j.jogaJogoCompleto();
			
			if (historico.isEmpate()) {
				empates++;
			}
			else if (historico.getVencedor() == "J1") {
				vitoriasJ1++;
				if (j.contabilizaVitoriasjogador1() == 6) {
					quadrado ++;
				}
				if (j.contabilizaVitoriasjogador1() == 3) {
					laelo ++;
				}
				if (j.contabilizaVitoriasjogador1() == 2) {
					carroca ++;
				}
				if (j.contabilizaVitoriasjogador1() == 1 ) {
					batidaUnica ++;
				}
			} else if (historico.getVencedor() == "J2") {
				vitoriasJ2++;
				if (j.contabilizaVitoriasjogador2() == 6) {
					quadrado2 ++;
				}
				if (j.contabilizaVitoriasjogador2() == 3) {
					laelo2 ++;
				}
				if (j.contabilizaVitoriasjogador2() == 2) {
					carroca2 ++;
				}
				if (j.contabilizaVitoriasjogador2() == 1 ) {
					batidaUnica2 ++;
				}
			}
			
		}


		System.out.println(
				"Jogos: " + (empates + vitoriasJ1 + vitoriasJ2) + "\n" + "\n" +
				
				"Vitórias J1: " + vitoriasJ1 + "\n" + 
				"Quadrado J1: "+ quadrado+ "\n" +
				"Batida Única J1: " + batidaUnica + "\n" +
				"Lá e Ló J1: " + laelo + "\n" +
				"Carroça J1: " + carroca + "\n" + "\n" +
				"-------------------" + "\n" + "\n" +
				"VitóriaS J2: "+ vitoriasJ2 + "\n"+
				"Quadrado J2: "+ quadrado2+ "\n" +
				"Batida Única J2: " + batidaUnica2 + "\n" +
				"Lá e Ló J2: " + laelo2 + "\n" +
				"Carroça J2: " + carroca2 + "\n" + "\n" +
				"-------------------" + "\n\n" +
				"Empates: " + empates);
				
				
	}
	/**
	public void contabilizaVitoria() {
			
	if(this.verificaPontuacao(jogador1) == 6) {
		this.jogador1.setCruzada();
	}
	if(this.verificaPontuacao(jogador1) == 2) {
		this.jogador1.setCarroca();
	}
	if(this.verificaPontuacao(jogador1) == 3) {
		this.jogador1.setLaelo();
	}
	if(this.verificaPontuacao(jogador2) == 1) {
		this.jogador1.setBatidaUnica();
	}
	}
	**/
}
