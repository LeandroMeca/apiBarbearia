package br.com.dio.barbershopui.controller.response;



public record ClientDetailsResponse(
        Long id,
        String name,
        String email,
        String phone

) {
}
