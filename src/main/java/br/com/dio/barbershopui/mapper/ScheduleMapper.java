package br.com.dio.barbershopui.mapper;

import br.com.dio.barbershopui.controller.request.SaveScheduleRequest;
import br.com.dio.barbershopui.controller.response.ClientScheduleAppointmentResponse;
import br.com.dio.barbershopui.controller.response.SaveScheduleResponse;
import br.com.dio.barbershopui.controller.response.ScheduleAppointmentMonthResponse;
import br.com.dio.barbershopui.entity.ClientEntity;
import br.com.dio.barbershopui.entity.ScheduleEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ScheduleMapper {

    public static ScheduleEntity toEntity(SaveScheduleRequest request) {
        ScheduleEntity entity = new ScheduleEntity();
        entity.setStartAt(request.startAt());
        entity.setEndAt(request.endAt());

        ClientEntity client = new ClientEntity();
        client.setId(request.clientId());
        entity.setClient(client);

        return entity;
    }

    public static SaveScheduleResponse toSaveResponse(ScheduleEntity entity) {
        return new SaveScheduleResponse(
                entity.getId(),
                entity.getStartAt(),
                entity.getEndAt(),
                entity.getClient().getId()
        );
    }

    public static ScheduleAppointmentMonthResponse toMonthResponse(int year, int month, List<ScheduleEntity> entities) {
        List<ClientScheduleAppointmentResponse> responses = toClientMonthResponse(entities);
        return new ScheduleAppointmentMonthResponse(year, month, responses);
    }

    public static List<ClientScheduleAppointmentResponse> toClientMonthResponse(List<ScheduleEntity> entities) {
        return entities.stream()
                .map(ScheduleMapper::toClientMonthResponse)
                .collect(Collectors.toList());
    }

    public static ClientScheduleAppointmentResponse toClientMonthResponse(ScheduleEntity entity) {
        return new ClientScheduleAppointmentResponse(
                entity.getId(),
                entity.getStartAt().getDayOfMonth(),
                entity.getStartAt(),
                entity.getEndAt(),
                entity.getClient().getId(),
                entity.getClient().getName()
        );
    }
}
