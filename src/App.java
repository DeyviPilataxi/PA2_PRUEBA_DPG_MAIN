import com.programacion.uce.negocio.Pedido;
import com.programacion.uce.negocio.PedidoService;

public class App {
        public static void main(String[] args) throws Exception {

                PedidoService service = new PedidoService();

                // Caso 1
                Pedido pedidoGrande = new Pedido("Deyvi Pilataxi", "Jugo de Naranja", 1200, "deyvipilataxi@gmail.com");
                System.out.println("CASO 1...");
                service.registrar(pedidoGrande);

                System.out.println("------------------------------------");

                // CASO 2
                Pedido pedidoPequeño = new Pedido("Deyvi Pilataxi", "Caramelo", 25, "01235732");
                System.out.println("CASO 2...");
                service.registrar(pedidoPequeño);

                System.out.println("--- Fin ---");
        }

}
