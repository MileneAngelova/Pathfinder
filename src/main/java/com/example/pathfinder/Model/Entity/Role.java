package com.example.pathfinder.Model.Entity;

import com.example.pathfinder.Model.Entity.Enum.RoleName;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleName role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> user;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoleName getName() {
        return role;
    }

    public void setName(RoleName name) {
        this.role = name;
    }
}
