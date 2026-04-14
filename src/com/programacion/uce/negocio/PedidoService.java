package com.programacion.uce.negocio;

public class PedidoService {

    // @Inject

    // por constructor
    // private NotificadorMail notificadorMail;

    // @Inject
    // public PedidoService(NotificadorMail notificadorMail) {
    // this.notificadorMail = notificadorMail;
    // }

    // por atributo
    // @Inject
    // private NotificadorMail notificadorMail;

    // DI por metodo

    // @ApplicationScoped
    // private NotificadorMail notificadorMail;

    // @Inject
    // public void setNotificador(NotificadorMail notificadorMail) {
    // this.notificadorMail = notificadorMail;
    // }

    private NotificadorMail mail = new NotificadorMail();
    private NotificadorSms sms = new NotificadorSms();

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos...");

        // Lógica: Si el total es mayor a 100 -> Mail. Si no -> SMS.
        if (pedido.getTotal() > 100) {
            mail.enviar(pedido.getCorreo(), "Su pedido supera los 100. Notificación por Mail.");
        } else {
            sms.enviar(pedido.getCorreo(), "Su pedido es menor a 100. Notificación por SmS.");
        }
    }

}
