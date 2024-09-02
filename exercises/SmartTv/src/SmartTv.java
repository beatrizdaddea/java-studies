//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SmartTv {

  // Atributos

  private boolean ligada;
  private int canal;
  private int volume;

  // Construtor
  public SmartTv() {
    this.ligada = false; // TV inicialmente desligada
    this.canal = 1;      // Canal inicial
    this.volume = 10;    // Volume inicial
  }

  // Métodos para ligar e desligar a TV
  public void ligar() {
    this.ligada = true;
    System.out.println("A TV está ligada.");
  }

  public void desligar() {
    this.ligada = false;
    System.out.println("A TV está desligada.");
  }

  // Método para verificar se a TV está ligada
  public boolean isLigada() {
    return ligada;
  }

  // Métodos para aumentar e diminuir o volume
  public void aumentarVolume() {
    if (ligada && volume < 100) { // Limite superior do volume
      volume++;
      System.out.println("Volume aumentado para: " + volume);
    } else if (!ligada) {
      System.out.println("A TV está desligada. Não é possível aumentar o volume.");
    } else {
      System.out.println("Volume máximo atingido.");
    }
  }

  public void diminuirVolume() {
    if (ligada && volume > 0) { // Limite inferior do volume
      volume--;
      System.out.println("Volume diminuído para: " + volume);
    } else if (!ligada) {
      System.out.println("A TV está desligada. Não é possível diminuir o volume.");
    } else {
      System.out.println("Volume mínimo atingido.");
    }
  }

  // Métodos para mudar de canal
  public void aumentarCanal() {
    if (ligada) {
      canal++;
      System.out.println("Canal mudado para: " + canal);
    } else {
      System.out.println("A TV está desligada. Não é possível mudar de canal.");
    }
  }

  public void diminuirCanal() {
    if (ligada && canal > 1) { // Limite inferior para o canal
      canal--;
      System.out.println("Canal mudado para: " + canal);
    } else if (!ligada) {
      System.out.println("A TV está desligada. Não é possível mudar de canal.");
    } else {
      System.out.println("Você já está no canal mais baixo.");
    }
  }

  public void mudarCanal(int novoCanal) {
    if (ligada && novoCanal > 0) {
      canal = novoCanal;
      System.out.println("Canal mudado para: " + canal);
    } else if (!ligada) {
      System.out.println("A TV está desligada. Não é possível mudar de canal.");
    } else {
      System.out.println("Número de canal inválido.");
    }
  }

  // Métodos para obter os valores dos atributos
  public int getVolume() {
    return volume;
  }

  public int getCanal() {
    return canal;
  }
}