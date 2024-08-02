package org.mock.persistence.repository;

import java.util.List;

import org.mock.persistence.entity.Player;

public interface IPlayerRepository{

    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void deleteById(Long id);

}
