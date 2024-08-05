package org.mock.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mock.DataProvider;
import org.mock.persistence.entity.Player;
import org.mock.persistence.repository.PlayerRepositoryImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IPlayerServiceTest {

    @Mock
    private PlayerRepositoryImpl playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerServiceImpl;

    @Test
    public void testFindAll() {
        // MockitoAnnotations.openMocks(this);

        // Given
        when(playerRepository.findAll()).thenReturn(DataProvider.playerListMock());
        // When
        List<Player> result = playerServiceImpl.findAll();
        // Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(1L, result.get(0).getId());
        assertEquals("Cristiano Ronaldo", result.get(0).getName());
        assertEquals("Al Nassr", result.get(0).getTeam());
        assertEquals("Delantero", result.get(0).getPosition());
        verify(this.playerRepository).findAll();
    }

    @Test
    public void testFindById() {
        // Given
        Long id=1L;

        // When
        when(playerRepository.findById(anyLong())).thenReturn(DataProvider.MockPlayer());
        Player player = playerRepository.findById(id);

        // Then
        assertEquals("Cristiano Ronaldo", player.getName());
        assertNotNull(player);
        assertEquals("Al Nassr", player.getTeam());
        assertEquals("Delantero", player.getPosition());
        assertEquals(Long.valueOf(1L), player.getId());
        verify(this.playerRepository, times(1)).findById(anyLong());

    }

    
        

    

}


