package com.cod;

public class Main {
    public static void main(String[] args) {
        /**Esto es el método main.
         * Saca el mensaje "Listo" o "Fallo"
         */
        if (metodo1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (metodo2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean metodo1(String u) {
        /**Este método utiliza el objeto obx1 y muestra a donde se esta conectando
         * y con que usuario se esta conectando
         */
        Auxiliar obx1 = new Auxiliar(u);
        System.out.println("Conectando a " + obx1.h + ", con el usuario " + u);
        return obx1.con();
    }

    public static boolean metodo2() {
        /**Este método utiliza el objeto obx2 y muestra a donde se esta conectando
         * y con que usuario se esta conectando
         */
        Auxiliar obx2 = new Auxiliar();
        System.out.println("Conectando a " + obx2.h + ", con el usuario " + obx2.e);
        return obx2.con();
    }
}
