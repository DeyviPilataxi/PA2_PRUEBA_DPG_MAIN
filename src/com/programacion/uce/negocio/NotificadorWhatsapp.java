package com.programacion.uce.negocio;

public class NotificadorWhatsapp {

    public void enviar(String wat, String mensaje) {
        System.out.println("-> [WhatsApp] Enviando a: " + wat);
        System.out.println("-> [WhatsApp] Contenido: " + mensaje);
    }

}
