package com.example.case2bugrayus.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Quarter {
    String name;
    @JsonIgnore
    @OneToOne
    District district;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Quarter quarter = (Quarter) o;
        return id != null && Objects.equals(id, quarter.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
