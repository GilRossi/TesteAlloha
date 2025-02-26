package org.example;

public class Coffee {

    private static Coffee marcas;

    private Coffee(){

    }

    public static Coffee getMarcas(){
        if (marcas == null){
            synchronized (Coffee.class){
                if (marcas == null) {
                    marcas = new Coffee();
                }
            }
        }
        return marcas;
    }
}
