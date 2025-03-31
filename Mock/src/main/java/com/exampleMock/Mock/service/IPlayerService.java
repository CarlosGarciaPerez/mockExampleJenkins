package com.exampleMock.Mock.service;

import com.exampleMock.Mock.persistence.entity.Player;

import java.util.List;

public interface IPlayerService {

    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void deleteByID(Long id);


}
