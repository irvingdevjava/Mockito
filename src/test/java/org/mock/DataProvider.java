package org.mock;

import java.util.List;

import org.mock.persistence.entity.Player;

public class DataProvider {

    public static List<Player> playerListMock(){
        return List.of(
            new Player(1L, "Cristiano Ronaldo", "Al Nassr", "Delantero"),
            new Player(2L, "Lionel Messi", "Inter Miami", "Delantero"),
            new Player(3L, "Neymar Jr.", "Paris Saint-Germain", "Delantero"),
            new Player(4L, "Kylian Mbappé", "Paris Saint-Germain", "Delantero"),
            new Player(5L, "Kevin De Bruyne", "Manchester City", "Volante"),
            new Player(6L, "Virgil van Dijk", "Liverpool", "Defensa")
    );
    }
}
