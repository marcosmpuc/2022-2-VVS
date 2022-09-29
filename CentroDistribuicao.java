public class CentroDistribuicao {

	public enum SITUACAO { NORMAL, SOBRAVISO, EMERGENCIA }
	public enum TIPOPOSTO { COMUM, ESTRATEGICO }
	
	public static final int MAX_ADITIVO = 500;
	public static final int MAX_ALCOOL = 2500;
	public static final int MAX_GASOLINA = 10000;
	
	private SITUACAO situacao;
	private int tAditivo = 0;
	private int tGasolina = 0;
	private int tAlcool1 = 0;
	private int tAlcool2 = 0;
	
	public CentroDistribuicao (int tAditivo, int tGasolina, int tAlcool1, int tAlcool2) {
		// Controlar valores de entrada
		if (tAlcool1 != tAlcool2
			|| tAditivo < 0
			|| tGasolina < 0
			|| tAlcool1 < 0
			|| tAlcool2 < 0
			|| tAlcool1 != tAlcool2)
			throw ILLEGAL_ARGUMENT_EXCEPTION;
		this.tAditivo = tAditivo;
		this.tGasolina = tGasolina;
		this.tAlcool1 = tAlcool1;
		this.tAlcool2 = tAlcool2;
		defineSituacao();
	}
	public void defineSituacao(){
		if (this.tGasolina >= MAX_GASOLINA / 2
			&& this.tAditivo >= MAX_ADITIVO / 2
			&& this.tAlcool1 + this.tAlcool2 >= MAX_ALCOOL / 2)
			this.situacao = NORMAL;
		else if (this.tGasolina >= MAX_GASOLINA / 4
			&& this.tAditivo >= MAX_ADITIVO / 4
			&& this.tAlcool1 + this.tAlcool2 >= MAX_ALCOOL / 4)
			this.situacao = SOBRAVISO;
		else this.situacao = EMERGENCIA;
	}
	public SITUACAO getSituacao(){
		return this.situacao;
	}
	public int gettGasolina(){
		return this.tGasolina;
	}
	public int gettAditivo(){
		return this.tAditivo;
	}
	public int gettAlcool1(){
		return this.tAlcool1;
	}
	public int gettAlcool2(){
		return this.tAlcool2;
	}
	public int recebeAditivo(int qtdade) {
		if (qtdade < 0) return -1;
		int qtdAArmazenar = this.tAditivo - (MAX_ADITIVO - qtdade);
		this.tAditivo += qtdAArmazenar;
		return qtdAArmazenar;
	}
	public int recebeGasolina(int qtdade) {
		if (qtdade < 0) return -1;
		int qtdAArmazenar = this.tGasolina - (MAX_ADITIVO - qtdade);
		this.tGAsolina += qtdAArmazenar;
		return qtdAArmazenar;
	}
	public int recebeAlcool(int qtdade) {
		if (qtdade < 0) return -1;
		int qtdAArmazenar = (this.tAlcool1 + this.tAlcool2) - (MAX_ADITIVO - qtdade);
		this.tAlcool1 += qtdAArmazenar / 2;
		this.tAlcool2 += qtdAArmazenar / 2;
		return qtdAArmazenar - (qtdAArmazenar % 2);
	}
	public int[] encomendaCombustivel(int qtdade, TIPOPOSTO tipoPosto) {
		if (qtdade < 0) return new int {-7};
		switch (getSituacao()){
			case NORMAL: return entregaNPorCento(100);
			case SOBRAVISO: {
				switch(TIPOPOSTO){
					COMUM: return entregaNPorCento(50);
					ESTRATEGICO: return entregaNPorCento(100);
				}
			}
			case EMERGENCIA: {
				switch(TIPOPOSTO){
					COMUM: return new int {-14};
					ESTRATEGICO: return entregaNPorCento(50);
				}
			}
		}
	}

	public int[] entregaNPorCento(int n){
		// Criar caso onde a mistura não pode ser feita
		this.tAditivo -= qtdade * 100 / 100 * 5 / 100 * n / 100;
		this.tGasolina -= qtdade * 100 / 100 * 70 / 100 * n / 100;
		this.tAlcool1 -= qtdade * 100 / 2 / 100 * 25 / 100 * n / 100;
		this.tAlcool2 -= qtdade * 100 / 2 / 100 * 70 / 100 * n / 100;
		defineSituacao();
		return new int {this.tAditivo, this.tGasolina, this.tAlcool1, this.tAlcool2};
	}






















}
