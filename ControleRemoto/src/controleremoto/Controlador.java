
package controleremoto;

public interface Controlador {
    
  // Lista de métodos:
  public abstract void Ligar();
    
  public abstract void Desligar();
    
  public abstract void Menu();
        
  public abstract void fecharMenu();

  public abstract void maisVolume();
    
  public abstract void menosVolume();
    
  public abstract void ligarMudo();
    
  public abstract void desligarMudo();
  
  public abstract void play();
    
  public abstract void pause();
    
}
