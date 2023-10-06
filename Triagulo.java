/* 
   Alunos: Vitor Mendes, Leandro Barbosa
   RA: 2204827, 2204703
*/

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return (base * altura) / 2;
    }
}