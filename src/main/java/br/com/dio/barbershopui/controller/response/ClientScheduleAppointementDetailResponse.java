package br.com.dio.barbershopui.controller.response;

import java.time.OffsetDateTime;

public record ClientScheduleAppointementDetailResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
