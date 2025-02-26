package org.example;

public class Main {
    public static void main(String[] args) {

        Coffee c = Coffee.getMarcas();
        Coffee c2 = Coffee.getMarcas();
        System.out.println(c + "\n" + c2);
        if (c == c2){
            System.out.println("Funcionou");
        }else {
            System.out.println("Não funcionou");
        }
    }
}