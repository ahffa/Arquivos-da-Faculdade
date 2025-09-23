public class Main {
    Retangulo retangulo = new Retangulo();
    public void main(String[] args) {
        
        retangulo.setAltura(5.5);
        retangulo.setLargura(3.2);
  
        retangulo.setLargura(-10);
        retangulo.setAltura(0);

        System.out.println("Largura final: " + retangulo.getLargura());
        System.out.println("Altura final: " + retangulo.getAltura());
    }
}