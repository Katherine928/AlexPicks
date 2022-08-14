package com.katherine.alexPicks.dao;

import com.katherine.alexPicks.model.Fight;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcFightDao implements FightDao{
    @Override
    public List<Fight> getAllFight() {
        return null;
    }
}
