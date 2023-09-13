package com.dembasiby.tictactoe.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bot extends Player {
    @Column(name = "bot_rank")
    private int rank;
}
