package application;

public class Tarifa {

	private static final Double VALOR_BASE = 3.00;
	private String horaViagem;
	private DiaDaSemana diaDaSemana;
	private Boolean isFeriado;
	private Boolean isNatalouAnoNovo;
	private Double kmsRodados;
	
	public Tarifa() {
		
	}
	
	public Tarifa(String horaViagem, DiaDaSemana diaDaSemana, boolean isFeriado, boolean isNatalouAnoNovo, double kmsRodados) {
		this.horaViagem = horaViagem;
		this.diaDaSemana = diaDaSemana;
		this.isFeriado = isFeriado;
		this.isNatalouAnoNovo = isNatalouAnoNovo;
		this.kmsRodados = kmsRodados;
	}

	public String getHoraViagem() {
		return horaViagem;
	}

	public void setHoraViagem(String horaViagem) {
		this.horaViagem = horaViagem;
	}

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public boolean isFeriado() {
		return isFeriado;
	}

	public void setFeriado(boolean isFeriado) {
		this.isFeriado = isFeriado;
	}

	public boolean isNatalouAnoNovo() {
		return isNatalouAnoNovo;
	}

	public void setNatalouAnoNovo(boolean isNatalouAnoNovo) {
		this.isNatalouAnoNovo = isNatalouAnoNovo;
	}

	public double getKmsRodados() {
		return kmsRodados;
	}

	public void setKmsRodados(double kmsRodados) {
		this.kmsRodados = kmsRodados;
	}

	public static double getValorBase() {
		return VALOR_BASE;
	}

	
	
	
}
