package com.katherine.alexPicks.Controller;

import com.katherine.alexPicks.dao.FightDao;
import com.katherine.alexPicks.model.Fight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FightController {

    @Autowired
    private FightDao fightDao;

    @RequestMapping(path = "/fights", method = RequestMethod.GET)
    public List<Fight> getAllFights() {
        return fightDao.getAllFight();
    }
}
