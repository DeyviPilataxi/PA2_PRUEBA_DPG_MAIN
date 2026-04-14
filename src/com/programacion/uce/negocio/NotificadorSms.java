package com.programacion.uce.negocio;

public class NotificadorSms {

    public void enviar(String numero, String mensaje) {
        System.out.println("Se envia un SMS al numero: " + numero);
        System.out.println("Mensaje: " + mensaje);
    }

}
