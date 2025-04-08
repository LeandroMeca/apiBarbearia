package br.com.dio.barbershopui.entity;

import br.com.dio.barbershopui.controller.request.SaveScheduleRequest;
import jakarta.persistence.*;


import java.time.OffsetDateTime;
import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(
        name = "SCHEDULES",
        uniqueConstraints = {
                @UniqueConstraint(name = "UK_SCHEDULE_INTERVAL", columnNames = {"start_at", "end_at"}),
        }
)


public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false, name = "start_at")
    private OffsetDateTime startAt;

    @Column(nullable = false, name = "end_at")
    private OffsetDateTime endAt;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client = new ClientEntity();


    // Remover de ScheduleEntity.java:

    public ScheduleEntity toEntity(SaveScheduleRequest request) {
        var entity = new ScheduleEntity();
        entity.setStartAt(request.startAt());
        entity.setEndAt(request.endAt());

        var client = new ClientEntity();
        client.setId(request.clientId());
        entity.setClient(client);

        return entity;
    }



    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ScheduleEntity that)) return false;
        return Objects.equals(id, that.id) &&
                Objects.equals(startAt, that.startAt) &&
                Objects.equals(endAt, that.endAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startAt, endAt);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
    }

    public OffsetDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(OffsetDateTime endAt) {
        this.endAt = endAt;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }
}
