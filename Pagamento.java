
public class Pagamento {
	
	private String nomeDoPagador;
	private String cpf;
	private double valorASerPago;
	
	public Pagamento(String n, String c, double v) {
		
	this.nomeDoPagador = n;
	this.cpf = c;
	this.valorASerPago = v;
	}

	public String getNomeDoPagador() {
		return nomeDoPagador;
	}

	public void setNomeDoPagador(String nomeDoPagador) {
		this.nomeDoPagador = nomeDoPagador;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getValorASerPago() {
		return valorASerPago;
	}

	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}
}
