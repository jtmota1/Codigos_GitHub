package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("A expessura da ponta é: "+this.ponta);
        System.out.println("A cor da caneta é "+this.cor);
        System.out.println("Está tampada? "+this.tampada);

    }

       void tampar(){
        this.tampada = true;
        }
    void destampar(){
            this.tampada = false;
         }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }
        else {
            System.out.println("Estou rabiscando");
        }
    }

}