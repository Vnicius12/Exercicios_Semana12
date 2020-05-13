
public class CartaoDeCredito extends Pagamento {

	private String numeroDoCartao;
	
	public CartaoDeCredito(String n, String c, double v, String nc) {
		super(n, c, v);
		this.numeroDoCartao = nc;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}
	
}
