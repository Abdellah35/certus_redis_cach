package com.softedge.solution.certusrediscacheservice.redisentity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import java.util.concurrent.TimeUnit;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@RedisHash("user_ipv_activation")
public class UserIPVActivation {

    private String username;
    @Id
    @Indexed

    private String emailId;
    private Integer activationCode;
    private String userType;

}
