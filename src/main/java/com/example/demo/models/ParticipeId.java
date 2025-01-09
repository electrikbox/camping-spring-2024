package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ParticipeId implements java.io.Serializable {
    private static final long serialVersionUID = -8343683772476837324L;
    @Column(name = "id_client", nullable = false)
    private Integer idClient;

    @Column(name = "id_services", nullable = false)
    private Integer idServices;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParticipeId entity = (ParticipeId) o;
        return Objects.equals(this.idServices, entity.idServices) &&
                Objects.equals(this.idClient, entity.idClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServices, idClient);
    }

}