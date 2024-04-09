package org.oderay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sucesion de Fibonacci!");

        int limit = 25; //indica el limite al que llegar ya que si no sería una sucesion infinita
        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);
        System.out.println(n2);

        int suma = n1 + n2;

        while (suma < limit){
            System.out.println(suma);
            n1 = n2;
            n2 = suma;
            suma = n1 + n2;
        }



    }
}