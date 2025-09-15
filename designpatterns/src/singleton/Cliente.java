package br.univille.singleton;

public class Cliente {
    public static void main(string[] args) {
        var segredo = "Palmeiras tem mundial";

        var singleton = Singleton.getInstance();
        singleton.setSegrdo(segredo);

        System.out.println(
            Singleton.getInstance()
            .getSegredo());



    }
}