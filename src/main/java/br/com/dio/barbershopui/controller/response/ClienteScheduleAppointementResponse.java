package br.com.dio.barbershopui.controller.response;


import java.time.OffsetDateTime;

public record ClienteScheduleAppointementResponse(

        Long id,
        Integer day,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        Long clientId,
        String clientName
) {
}
