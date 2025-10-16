import java.util.Random;
import java.util.random.*;
public class Lampada {
    private boolean estado;
    private boolean queimada;

    public Lampada(){
        desligar();
        this.queimada = false;
    }
    public void ligar(){
        if(this.queimada) return;
        
        Random random = new Random();
        double numeroSorteado = random.nextDouble();

        if(numeroSorteado < 0.3){
            this.queimada = true;
            desligar();
        }else{
            this.estado = true;
        }
    }
    public void desligar(){
        this.estado = false;   
    }
    public boolean isLigada(){
        return this.estado;
    }
}
