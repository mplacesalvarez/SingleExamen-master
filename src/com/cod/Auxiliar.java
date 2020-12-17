package com.cod;

public class Auxiliar {
    String e;
    String h = "127.0.0.2";

    public Auxiliar() {
        e = "anonymous@danielcastelao.org";
    }

    public Auxiliar(String param1) {
        this.e = param1;
    }

    public boolean con() {/**Este método es una condicion con if.
     * Retorna true o false
     */
        if (e != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
