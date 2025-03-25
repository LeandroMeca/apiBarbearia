package br.com.dio.barbershopui.controller.response;


public record UpdateClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
