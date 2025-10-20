import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Listado de clientes cajero uno
        final ArrayList<Cliente> listaClientesCajeroUno = new ArrayList<>();
        final ArrayList<Cliente> listaClientesCajeroDos = new ArrayList<>();

        // Clientes cajero uno
        Cliente clienteUno = new Cliente("John Doe", false);
        Cliente clienteDos = new Cliente("Jane Doe", false);
        Cliente clienteTres = new Cliente("Pepe Pérez", false);
        Cliente clienteCuatro = new Cliente("Pepa Pérez", false);
        listaClientesCajeroUno.add(clienteUno);
        listaClientesCajeroUno.add(clienteDos);
        listaClientesCajeroUno.add(clienteTres);
        listaClientesCajeroUno.add(clienteCuatro);

        // Clientes cajero dos
        Cliente clienteCinco = new Cliente("Luis García", false);
        Cliente clienteSeis = new Cliente("María López", false);
        Cliente clienteSiete = new Cliente("Carlos Ruiz", false);
        Cliente clienteOcho = new Cliente("Ana Gómez", false);
        listaClientesCajeroDos.add(clienteCinco);
        listaClientesCajeroDos.add(clienteSeis);
        listaClientesCajeroDos.add(clienteSiete);
        listaClientesCajeroDos.add(clienteOcho);

        // Cajeros
        Cajero cajeroUno = new Cajero("Cajero 1", listaClientesCajeroUno);
        Cajero cajeroDos = new Cajero("Cajero 2", listaClientesCajeroDos);

        // Ejecución
        cajeroUno.start();
        cajeroDos.start();
    }
}