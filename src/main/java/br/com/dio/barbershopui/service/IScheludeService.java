package br.com.dio.barbershopui.service;

import br.com.dio.barbershopui.entity.ScheduleEntity;

public interface IScheludeService {


    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
