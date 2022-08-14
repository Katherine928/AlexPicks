package com.katherine.alexPicks.dao;

import com.katherine.alexPicks.model.Fight;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Component
@CrossOrigin
public interface FightDao {
    List<Fight> getAllFight();
}
