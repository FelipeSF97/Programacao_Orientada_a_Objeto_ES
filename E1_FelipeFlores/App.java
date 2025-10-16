public class App {

	public static void main(String[] args) {
		Revista revista = new Revista("Champions League");

		Artigo artigo1 = new Artigo("Real Madrid", "Xabi Alonso", 902);
		Artigo artigo2 = new Artigo("PSG", "Luis Henrique", 970);
		Artigo artigo3 = new Artigo("Chelsea", "Enzo Maresca", 905);
		Artigo artigo4 = new Artigo("Internazionale", "Cristian Chivu", 908);

		revista.adicionarArtigo(artigo1);
		revista.adicionarArtigo(artigo2);
		revista.adicionarArtigo(artigo3);
		revista.adicionarArtigo(artigo4);

		System.out.println(revista);
        System.out.println("Total de páginas: " + revista.getTotalPaginas());
        System.out.println("Média de páginas por artigo: " + revista.getMediaPaginas());
	}

}
