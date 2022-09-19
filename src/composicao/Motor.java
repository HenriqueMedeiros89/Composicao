package composicao;

public class Motor {

    private int potencia;

    public Motor() {
        potencia = 1000; //valor padrao 
    }

    public Motor(int potencia) {
        this.potencia = potencia; // valor definido pelo usuario, que caso nao definido ele assume que a potencia é igual a 1.0
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
