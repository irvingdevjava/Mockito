package org.mock.Service;

import static org.junit.jupiter.api.Assertions.*;
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

    

    
        

    

}


