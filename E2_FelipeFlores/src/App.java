//Felipe Souza Flores
//Nota: 8
//Tive dificuldade em alguns pontos, mas acho que no geral fui bem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Evento> eventos = new ArrayList();

        eventos.add(new Palestra(
            0, 
            "Como Treinar o Seu Dragão",
            "Soluço",
            15,
            "Dr. Fúria da Noite",
            "Mestre em tecnologias vikings",
            "Treiou dois Fúrias da noite"
        ));
        eventos.add(new Palestra(
            1, 
            "Justiça no Futebol",
            "Márcio Rezende de Freitas",
            22,
            "Ricardo Teixeira",
            "Árbitro de Futebol",
            "Roubou 2005 pro Corinthians"
        ));
        eventos.add(new Oficina(
            2, 
            "Oficina do Diabo",
            "Mente Vazia",
            1,
            "Ansiedade",
            "Ocupar a mente",
            List.of("Pensar", "Se exercitar", "trabalhar")
        ));
        eventos.add(new Oficina(
            3, 
            "Tanto Bate",
            "Água Mole",
            100,
            "Pedra Dura",
            "Até furar",
            List.of("bater", "furar", "molhar")
        ));
        System.out.println("EVENTOS");
        for(Evento e : eventos){
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma palavra chave para buscar o evento: ");
        String palavra = scanner.nextLine();

        System.out.println("\nAqui estão os eventos procurados");
        boolean encontrou = false;
        for (Evento e : eventos) {
            if (e.contemPalavra(palavra)) {
                System.out.println(e);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum evento encontrado para o termo: " + palavra);
        }

        scanner.close();
    }
}