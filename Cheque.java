
public class Cheque extends Pagamento {

	private String numeroDoCheque;
	
	public Cheque(String n, String c, double v, String ndc) {
		super(n, c, v);
		this.numeroDoCheque = ndc;
	}

	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}

	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}
	
}
