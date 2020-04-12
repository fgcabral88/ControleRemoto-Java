
package controleremoto;

public class Controle implements Controlador{
    
    // Atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Construtor:
    public Controle() {
        volume = 50;
        ligado = true;
        tocando = false;
    }
    
    // Gets:

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }
    
    // Sets:

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //-------------------------------------------------------------------------

    @Override
    public void Ligar() {
        ligado = true;
    }

    @Override
    public void Desligar() {
        ligado = false;
    }

    @Override
    public void Menu() {
        System.out.println("--- ABRIR MENU ---");
        System.out.println("Está ligado?! " + ligado);
        System.out.println("Está tocando?! " + tocando);
        System.out.println("Volume: " + volume);
        
        for (int i = 0; i <= volume; i+= 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\n");
        System.out.println("Fechando menu..");
    }

    @Override
    public void maisVolume() {
        if(ligado == true){
            volume = volume + 5;
        }else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(ligado == true){
            volume = volume - 5;
        }
        else {
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(ligado == true && volume > 0){
            volume = 0;
        }
    }

    @Override
    public void desligarMudo() {
        if(ligado == true && volume == 0){
            volume = 50;
        }
    }

    @Override
    public void play() {
        if(ligado == true && tocando != true){
            tocando = true;
        }else {
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if(ligado == true && tocando == true){
            tocando = false;
        }else {
            System.out.println("Não consegui pausar.");
        }
    }

    
}
