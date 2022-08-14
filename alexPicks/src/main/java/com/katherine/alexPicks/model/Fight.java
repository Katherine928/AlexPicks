package com.katherine.alexPicks.model;

import java.math.BigDecimal;

public class Fight {
    private String fight_No;
    private String playName;
    private BigDecimal salary;

    public String getFight_No() {
        return fight_No;
    }

    public void setFight_No(String fight_No) {
        this.fight_No = fight_No;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
