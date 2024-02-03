package com.softedge.solution.certusrediscacheservice.redisentity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;


@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@RedisHash("user")
public class User {

    @Id
    @Indexed
    private Long id;
    private String username;
    @Indexed
    private String emailId;
    private String companyName;
    @Indexed
    private Long companyId;
    private String category;
    private String gender;
    private String nationality;
    private String photoUrl;
    private List<Permission> permissions;
    private List<Roles> roles;
    private boolean forcePasswordChanged;
    private boolean profileCompleted;
    private boolean ipvCompleted;
}
