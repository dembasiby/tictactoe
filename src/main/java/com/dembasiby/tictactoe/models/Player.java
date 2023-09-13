package com.dembasiby.tictactoe.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player extends BaseModel {
    private String name;
    private int age;
}

