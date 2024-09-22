package org.example;

import lombok.Data;

@Data
public class Door {
    private boolean hasPrize;

    public Door(boolean hasPrize) {
        this.hasPrize = hasPrize;
    }
}
