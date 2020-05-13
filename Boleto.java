
public class Boleto extends Pagamento {
	
	private String numeroDoBoleto;
	private int dia;
	private int mes;
	private int anoDeVencimento;

	public Boleto(String n, String c, double v, String nb, int d, int m, int a) {
		super(n, c, v);
		this.numeroDoBoleto = nb;
		this.dia = d;
		this.mes = m;
		this.anoDeVencimento = a;
	}

	public String getNumeroDoBoleto() {
		return numeroDoBoleto;
	}

	public void setNumeroDoBoleto(String numeroDoBoleto) {
		this.numeroDoBoleto = numeroDoBoleto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnoDeVencimento() {
		return anoDeVencimento;
	}

	public void setAnoDeVencimento(int anoDeVencimento) {
		this.anoDeVencimento = anoDeVencimento;
	}
	
	

}
