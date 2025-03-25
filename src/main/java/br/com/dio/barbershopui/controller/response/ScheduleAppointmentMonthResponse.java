package br.com.dio.barbershopui.controller.response;


import java.util.List;

public record ScheduleAppointmentMonthResponse(

        int year,
        int month,
        List<ClientScheduleAppointementDetailResponse> scheduleAppointements
) {
}
