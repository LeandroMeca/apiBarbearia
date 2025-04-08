package br.com.dio.barbershopui.mapper;

import br.com.dio.barbershopui.controller.request.SaveScheduleRequest;
import br.com.dio.barbershopui.controller.response.ClientScheduleAppointmentResponse;
import br.com.dio.barbershopui.controller.response.SaveScheduleResponse;
import br.com.dio.barbershopui.controller.response.ScheduleAppointmentMonthResponse;
import br.com.dio.barbershopui.entity.ClientEntity;
import br.com.dio.barbershopui.entity.ScheduleEntity;

import java.util.List;


public interface IScheduleMapper {



      //  @Mapping(target = "clientId", source = "client.id")
        SaveScheduleResponse toSaveResponse(ScheduleEntity entity);

        // demais métodos...

        default ClientEntity fromId(Long id) {
            if (id == null) return null;
            ClientEntity client = new ClientEntity();
            client.setId(id);
            return client;

            }

   // @Mapping(target = "scheduledAppointments", expression = "java(toClientMonthResponse(entities))")
    ScheduleAppointmentMonthResponse toMonthResponse(final int year, final int month, final List<ScheduleEntity> entities);

    List<ClientScheduleAppointmentResponse> toClientMonthResponse(final List<ScheduleEntity> entities);

//    @Mapping(target = "clientId", source = "client.id")
//    @Mapping(target = "clientName", source = "client.name")
//    @Mapping(target = "day", expression = "java(entity.getStartAt().getDayOfMonth())")
    ClientScheduleAppointmentResponse toClientMonthResponse(final ScheduleEntity entity);

}
