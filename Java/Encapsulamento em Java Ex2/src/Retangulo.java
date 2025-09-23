public class Retangulo {
    private double Largura;
    private double Altura;

public double getLargura() {
    return Largura;
}
public void setLargura(double largura) {
    if (Largura>0 ) { // a dimnensão não pode ser negativa
        
 } else {
    System.out.println("Dimensão Inválida");
 }
}
 public double getAltura() {
    return Altura;
 }
 public void setAltura(double Altura) {
    if (Altura>0 ) {// a dimnensão não pode ser negativa
        this.Altura = Altura;
 } else {
    System.out.println("Dimensão Inválida");
 }
}

public double calcularArea() {
    return this.Largura * this.Altura;
 }
}