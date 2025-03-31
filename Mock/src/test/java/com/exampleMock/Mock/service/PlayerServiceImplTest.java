package com.exampleMock.Mock.service;

import com.exampleMock.Mock.DataProvider;
import com.exampleMock.Mock.persistence.entity.Player;
import com.exampleMock.Mock.persistence.entity.Repository.PlayerRepositoryImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {
    @Mock
    private PlayerRepositoryImpl playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;


    @Test
    public void testFindAll(){
        //given

        //When
        when(playerRepository.findAll()).thenReturn(DataProvider.playerListMock());
        List<Player> result = playerService.findAll();

        //then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("Cristiano Ronaldo", result.get(0).getName());
        assertEquals("Juventus", result.get(0).getTeam());
        assertEquals("Forward", result.get(0).getPosition());
        verify(this.playerRepository, times(1)).findAll();
    }

    @Test
    public void testFindById(){
        //given
        Long id= 1L;

        //When
        when(playerRepository.findById(anyLong())).thenReturn(DataProvider.playerMock());
        Player player = this.playerService.findById(id);

        //Then
        assertNotNull(player);
        assertEquals("Cristiano Ronaldo", player.getName());
        assertEquals("Juventus", player.getTeam());
        assertEquals("Forward", player.getPosition());
        verify(this.playerRepository, times(1)).findById(anyLong());
    }

    @Test
    public void testSave(){
        //given
        Player player = DataProvider.newPlayerMock();

        //When
        this.playerService.save(player);

        //Then
        ArgumentCaptor<Player> playerArgumentCaptor = ArgumentCaptor.forClass(Player.class);
        verify(this.playerRepository).save(any (Player.class));
        verify( this.playerRepository).save(playerArgumentCaptor.capture());
        assertEquals(10L, playerArgumentCaptor.getValue().getId());
        assertEquals("Luiz Diaz", playerArgumentCaptor.getValue().getName());
    }

    @Test
    void testDeleteById(){
        //given
        Long id = 1L;

        //When
        this.playerService.deleteByID(id);

        //Then
        ArgumentCaptor<Long> longArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(this.playerRepository).deleteByID(anyLong());
        verify(this.playerRepository).deleteByID(longArgumentCaptor.capture());
        assertEquals(1l, longArgumentCaptor.getValue());
    }

}
