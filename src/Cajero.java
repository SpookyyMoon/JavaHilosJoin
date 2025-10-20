import java.util.ArrayList;

public class Cajero extends Thread{
    String nombre;
    ArrayList<Cliente> listaClientes;

    Cajero(String nombre, ArrayList<Cliente> listaClientes) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
    }
    @Override
    public void run() {
        for (int i = 0; i < listaClientes.size(); i++) {
            listaClientes.get(i).start();
            System.out.println("El cajero " + this.nombre + " está atendiendo al cliente " + listaClientes.get(i).getNombre() + "...");
            try {
                listaClientes.get(i).join();
                System.out.println("El cajero " + this.nombre + " ha terminado de atender al cliente " + listaClientes.get(i).getNombre() + "!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
