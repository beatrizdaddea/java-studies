public class Main {
  public static void main(String[] args) {
    SmartTv minhaTV = new SmartTv();

    minhaTV.ligar();
    minhaTV.aumentarVolume();
    minhaTV.diminuirVolume();
    minhaTV.aumentarCanal();
    minhaTV.mudarCanal(5);
    minhaTV.desligar();
  }
}
