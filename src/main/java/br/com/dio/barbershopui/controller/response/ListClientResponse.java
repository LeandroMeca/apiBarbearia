package br.com.dio.barbershopui.controller.response;


public record ListClientResponse(

        Long id,
        String name,
        String email,
        String phone
) {
}
