package com.ccsw.ludoteca_2_backend.game;

import com.ccsw.ludoteca_2_backend.game.model.Game;
import com.ccsw.ludoteca_2_backend.game.model.GameDto;

import java.util.List;

public interface GameService {

    List<Game> find(String title, Long idCategory);

    void save(Long id, GameDto dto);

    Game get(Long id);
}
