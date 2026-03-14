package Aula03;

public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar() {
        this.tampada = true; //aqui posso mecher no tampar, estou dentro da classe
        System.out.println("Estou tampada da silva! ");

    }

    public void destampar() {
        this.tampada = false; //aqui posso mecher no tampar, estou dentro da classe
        System.out.println("Estou destampadinha!");
    } 
    
}
    
