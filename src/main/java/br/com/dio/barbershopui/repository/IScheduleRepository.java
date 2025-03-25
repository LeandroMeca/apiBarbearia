package br.com.dio.barbershopui.repository;


import br.com.dio.barbershopui.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;

public interface IScheduleRepository extends JpaRepository<ScheduleEntity, Long> {

    List<ScheduleEntity> findByStartAtGreaterThanEqualAndEndAtLessThenEqualOrderByStartAtEndAt(final OffsetDateTime startAt, final OffsetDateTime endAt);

    boolean existsStartAtAndEndAt(final OffsetDateTime startAt, final OffsetDateTime endAt);
}
