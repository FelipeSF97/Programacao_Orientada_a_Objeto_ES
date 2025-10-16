public class Artigo {

	private String titulo;

	private String autor;

	private int paginas;

	public Artigo(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public String toString() {
		return "Titulo: " + titulo + "/nAutor: " + autor + "/n Numero de Paginas: " + paginas;
	}

    public void add(Artigo artigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
