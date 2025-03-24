package br.com.dio.barbershopui.mapper;

import br.com.dio.barbershopui.controller.request.SaveClientRequest;
import br.com.dio.barbershopui.controller.request.UpdateClientRequest;
import br.com.dio.barbershopui.controller.response.*;
import br.com.dio.barbershopui.entity.ClientEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ClientMapper {

    public static ClientEntity toEntity(SaveClientRequest request) {
        ClientEntity entity = new ClientEntity();
        entity.setName(request.name());
        entity.setEmail(request.email());
        entity.setPhone(request.phone());
        return entity;
    }

    public static ClientEntity toEntity(Long id, UpdateClientRequest request) {
        ClientEntity entity = new ClientEntity();
        entity.setId(id);
        entity.setName(request.name());
        entity.setEmail(request.email());
        entity.setPhone(request.phone());
        return entity;
    }

    public static SaveClientResponse toSaveResponse(ClientEntity entity) {
        return new SaveClientResponse(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhone());
    }

    public static UpdateClientResponse toUpdateResponse(ClientEntity entity) {
        return new UpdateClientResponse(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhone());
    }

    public static ClientDetailResponse toDetailResponse(ClientEntity entity) {
        return new ClientDetailResponse(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhone());
    }

    public static List<ListClientResponse> toListResponse(List<ClientEntity> entities) {
        return entities.stream()
                .map(e -> new ListClientResponse(e.getId(), e.getName(), e.getEmail(), e.getPhone()))
                .collect(Collectors.toList());
    }
}
