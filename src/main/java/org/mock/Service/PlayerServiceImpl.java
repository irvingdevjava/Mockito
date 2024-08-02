package org.mock.Service;

import java.util.List;

import org.mock.persistence.entity.Player;
import org.mock.persistence.repository.PlayerRepositoryImpl;

public class PlayerServiceImpl implements IPlayerService{

    private PlayerRepositoryImpl playerRepository;

    public PlayerServiceImpl(PlayerRepositoryImpl playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void deleteById(Long id) {
        this.playerRepository.deleteById(id);
        
    }

    @Override
    public List<Player> findAll() {
        return this.playerRepository.findAll();
    }

    @Override
    public Player findById(Long id) {
        return this.playerRepository.findById(id);
    }

    @Override
    public void save(Player player) {
        this.playerRepository.save(player);
    }
}
