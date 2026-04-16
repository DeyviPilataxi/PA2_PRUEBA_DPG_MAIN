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
    private NotificadorWhatsapp wat = new NotificadorWhatsapp();

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos...");

        if (pedido.getTotal() > 100) {
            // Caso 1: Mail
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido (Email)");

        } else if (pedido.getTotal() < 50) {
            // Caso 3: WhatsApp (Nombre de clase corregido aquí)
            NotificadorWhatsapp n3 = new NotificadorWhatsapp();
            n3.enviar(pedido.getCliente(), "Se ha creado un pedido para ser atendido (WhatsApp)");

        } else {
            // Caso 2: SMS (Entre 50 y 100)
            NotificadorSms n2 = new NotificadorSms();
            n2.enviar(pedido.getCliente(), "Se ha creado un pedido para ser atendido (SMS)");
        }

    }
}
