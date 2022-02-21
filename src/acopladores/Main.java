/*
@autor Francisco Bañuelos.
*/
package trucos.acopladores;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = Cliente.obtenerClienteX();
        String region = cliente.getRegion();

        System.out.println(region);


        
    }
}
