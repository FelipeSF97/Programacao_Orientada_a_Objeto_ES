import java.util.ArrayList;
import java.util.List;

public class Revista {

	private int codigos;

	private static int proximoCodigo = 1000;

	private String titulo;

	private List <Artigo> artigo;

	public Revista(String titulo) {
		this.codigos = proximoCodigo;
		this.titulo = titulo;
		this.artigo = new ArrayList<>();
	}

	public void adicionarArtigo(Artigo artigo) {
		artigo.add(artigo);
	}

	public int getTotalPaginas() {
		int total = 0;
		for(Artigo a : artigo){
			total += a.getPaginas();
		}
		return total;
	}

	public double getMediaPaginas() {
		if(artigo.isEmpty()) return 0;
		return (double) getTotalPaginas() / artigo.size();
	}

	public String toString() {
		return "Revista: " + titulo + "\nCodigo: " + codigos;
	}

}
