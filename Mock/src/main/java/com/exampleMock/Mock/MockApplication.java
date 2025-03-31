package com.exampleMock.Mock;

import com.exampleMock.Mock.persistence.entity.Player;
import com.exampleMock.Mock.persistence.entity.Repository.PlayerRepositoryImpl;
import com.exampleMock.Mock.service.PlayerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockApplication {

	public static void main(String[] args) {
/*
		PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
		PlayerServiceImpl playerService = new PlayerServiceImpl(playerRepository);

		System.out.println(playerService.findAll());
		System.out.println(playerService.findById(1L));
		playerService.deleteByID(1L);
		System.out.println(playerService.findAll());

		Player player = new Player(7L, "Luiz Diaz", "Delantero", "Liverpool");
		playerService.save(player);
		System.out.println(playerService.findAll());
*/
	}
}
