package com.exampleMock.Mock.persistence.entity.Repository;

import com.exampleMock.Mock.persistence.entity.Player;

import java.util.ArrayList;
import java.util.List;



public class PlayerRepositoryImpl implements IPlayerRepository {

/*
    private List<Player> playerDatabase = new ArrayList<>(List.of(
           new Player(1L, "Cristiano Ronaldo", "Juventus", "Forward"),
            new Player(2L, "Lionel Messi", "Paris Saint-Germain", "Forward"),
            new Player(3L, "Neymar Jr", "Paris Saint-Germain", "Forward"),
            new Player(4L, "Kylian Mbappe", "Paris Saint-Germain", "Forward"),
            new Player(5L, "Mohamed Salah", "Liverpool", "Forward"),
            new Player(6L, "Kevin De Bruyne", "Manchester City", "Midfielder"),
            new Player(7L, "Robert Lewandowski", "Bayern Munich", "Forward"),
            new Player(8L, "Karim Benzema", "Real Madrid", "Forward"),
            new Player(9L, "Harry Kane", "Tottenham Hotspur", "Forward"),
            new Player(10L, "Sadio Mane", "Liverpool", "Forward")
    ));
*/

    private List<Player> playerDatabase = new ArrayList<>();

    @Override
    public List<Player> findAll() {
        System.out.println("-> Metodo FindAll  / Mock");
        return this.playerDatabase;
    }

    @Override
    public Player findById(Long id) {
        System.out.println("-> Metodo Find by ID  / Mock");
        return this.playerDatabase.stream().
                filter( player -> player.getId() == id).
                findFirst().
                orElseThrow();
    }


    @Override
    public void save(Player player) {
        System.out.println("-> Metodo Save / Mock");
        this.playerDatabase.add(player);
    }

    @Override
    public void deleteByID(Long id) {
        System.out.println("-> Metodo Delete / Mock");
        this.playerDatabase = this.playerDatabase.stream().
                filter( player -> player.getId() != id).
                toList();
    }
}
