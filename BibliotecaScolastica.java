package ES1;

public class BibliotecaScolastica {

	protected int nScaffale;
	protected int nMensola;
	
	public int getnScaffale() {
		return nScaffale;
	}
	public void setnScaffale(int nScaffale) {
		this.nScaffale = nScaffale;
	}
	public int getnMensola() {
		return nMensola;
	}
	public void setnMensola(int nMensola) {
		this.nMensola = nMensola;
	}
	
	public BibliotecaScolastica() {}
	
	public BibliotecaScolastica(int nScaffale, int nMensola) {
		this.nMensola = nMensola;
		this.nScaffale = nScaffale;
	}
	
}
