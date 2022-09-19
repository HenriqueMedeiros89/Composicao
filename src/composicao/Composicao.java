package composicao;

public class Composicao {

    public static void main(String[] args) {
        //primeira forma de chamar os condutores
//
//        Carro carro = new Carro();
//        Carro carro2 = new Carro(2000);
//
        //Segunda forma de chamar os condutores
//        Carro carro3 = new Carro();
//        carro3.ligarCarro(2000);
//
        //Terceira forma de chamar os metodos
        Carro carro4 = new Carro(0);
        Motor motor = new Motor();
        Motor motor2 = new Motor(2000);

        carro4.setMotor(motor);
        
        
        carro4.ImprimeDados();
    }

}
