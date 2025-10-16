public class App {
    public static void main(String[] args){
        Lampada l1 = new Lampada();

        l1.ligar();

        if(l1.isLigada()){
            System.out.println("A lampada ligou!!!");
        }else{
            System.out.println("A lampada queimou.");
        }
    }
}
