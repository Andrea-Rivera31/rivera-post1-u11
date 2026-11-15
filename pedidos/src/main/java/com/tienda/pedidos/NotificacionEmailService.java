package com.tienda.pedidos;

public class NotificacionEmailService {
    public void enviar(String email, String mensaje) {
        System.out.println("Correo a " + email + ": " + mensaje);
    }
}