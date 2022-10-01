package com.ua.javarush.mentor.persist.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role_to_permission")
@Data
public class RoleToPermission implements Serializable {
    @Id
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private Role roleId;
    @Column(name = "permission", length = 200, nullable = false)
    private String permission;
}
