package com.exampleMock.Mock.persistence.entity.Repository;

import com.exampleMock.Mock.persistence.entity.Player;

import java.util.List;

public interface IPlayerRepository {

    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void deleteByID(Long id);
}
