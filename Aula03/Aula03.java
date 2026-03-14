package Aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Crystal";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80; //esta dentro de uma classe, que usa a classe caneta
        //c1.tampada = true;
        
        c1.status();
        c1.tampar();
    }
    
}
