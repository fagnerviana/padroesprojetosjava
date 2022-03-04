package gof.singleton;

public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager() {

    }

    public static SingletonEager getInstancia() {
        if (instancia == null) {
            instancia = new SingletonEager();
        }

        return instancia;

    }
}
