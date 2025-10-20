public class Cliente extends Thread{
    String nombre;
    boolean atendido;

    public Cliente(String nombre, boolean atendido){
        this.nombre = nombre;
        this.atendido = atendido;
    }

    @Override
    public void run() {
        System.out.println("El cliente " + this.nombre + " comienza sus operaciones en el cajero...");
        try {
            Thread.sleep((long) (Math.random() * 4000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El cliente " + this.nombre + " finaliza sus operaciones en el cajero y se aleja!");
        this.atendido = true;
    }

    public String getNombre() {
        return nombre;
    }
}
