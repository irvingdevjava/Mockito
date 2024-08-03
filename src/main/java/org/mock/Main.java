package org.mock;

import org.mock.Service.PlayerServiceImpl;
import org.mock.persistence.entity.Player;
import org.mock.persistence.repository.PlayerRepositoryImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlayerRepositoryImpl playerRepositoryImpl=new PlayerRepositoryImpl();

        PlayerServiceImpl playerServiceImpl=new PlayerServiceImpl(playerRepositoryImpl);

        // playerServiceImpl.deleteById(1L);

        // System.out.println(playerServiceImpl.findAll());

        Player player=new Player();
        
        player.setId(7L);
        player.setName("Joancho");
        player.setTeam("Carroñeros");
        player.setPosition("Recoge balones");

        playerServiceImpl.save(player);

        System.out.println(playerServiceImpl.findById(7L));
    }
}