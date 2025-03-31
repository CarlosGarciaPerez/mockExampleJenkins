package com.exampleMock.Mock;

import com.exampleMock.Mock.persistence.entity.Player;

import java.util.List;

public class DataProvider {

    public static List<Player> playerListMock (){
     System.out.println("Obteniendo listado de jugadores / Mock");

      return List.of(
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
       );
    };


    public static Player playerMock(){
        return new Player(1L, "Cristiano Ronaldo", "Juventus", "Forward");
    };

    public static Player newPlayerMock(){
        return new Player(10L, "Luiz Diaz", "Delantero", "Liverpool");
    }


}
