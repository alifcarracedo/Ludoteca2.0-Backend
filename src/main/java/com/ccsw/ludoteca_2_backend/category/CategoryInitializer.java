package com.ccsw.ludoteca_2_backend.category;

import com.ccsw.ludoteca_2_backend.category.model.Category;
import com.ccsw.ludoteca_2_backend.category.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CategoryInitializer implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        if (categoryRepository.existsByName("Juegos")) {
            return;
        }

        Category juegos = new Category();
        juegos.setName("Juegos");

        Category juegosMesa = new Category();
        juegosMesa.setName("Juegos de mesa");
        juegosMesa.setParent(juegos);

        Category videojuegos = new Category();
        videojuegos.setName("Videojuegos");
        videojuegos.setParent(juegos);

        Category estrategiaMesa = new Category();
        estrategiaMesa.setName("Estrategia");
        estrategiaMesa.setParent(juegosMesa);

        Category cartas = new Category();
        cartas.setName("Cartas");
        cartas.setParent(juegosMesa);

        Category roll = new Category();
        roll.setName("Roll");
        roll.setParent(juegosMesa);

        Category cooperativos = new Category();
        cooperativos.setName("Cooperativos");
        cooperativos.setParent(juegosMesa);

        Category narrativos = new Category();
        narrativos.setName("Narrativos");
        narrativos.setParent(juegosMesa);


        Category shooters = new Category();
        shooters.setName("Shooters");
        shooters.setParent(videojuegos);

        Category aventura = new Category();
        aventura.setName("Aventura");
        aventura.setParent(videojuegos);

        Category rolVideojuegos = new Category();
        rolVideojuegos.setName("Rol");
        rolVideojuegos.setParent(videojuegos);

        Category estrategiaVideojuegos = new Category();
        estrategiaVideojuegos.setName("Estrategia");
        estrategiaVideojuegos.setParent(videojuegos);

        Category simulacion = new Category();
        simulacion.setName("Simulación");
        simulacion.setParent(videojuegos);

        Category deportes = new Category();
        deportes.setName("Deportes");
        deportes.setParent(videojuegos);

        Category mundoAbierto = new Category();
        mundoAbierto.setName("Mundo Abierto");
        mundoAbierto.setParent(videojuegos);


    juegos = categoryRepository.save(juegos);

    juegosMesa.setParent(juegos);
    videojuegos.setParent(juegos);

    juegosMesa = categoryRepository.save(juegosMesa);
    videojuegos = categoryRepository.save(videojuegos);

    estrategiaMesa = categoryRepository.save(estrategiaMesa);
    cartas = categoryRepository.save(cartas);
    roll = categoryRepository.save(roll);
    cooperativos = categoryRepository.save(cooperativos);
    narrativos = categoryRepository.save(narrativos);

    shooters = categoryRepository.save(shooters);
    aventura = categoryRepository.save(aventura);
    rolVideojuegos = categoryRepository.save(rolVideojuegos);
    estrategiaVideojuegos = categoryRepository.save(estrategiaVideojuegos);
    simulacion = categoryRepository.save(simulacion);
    deportes = categoryRepository.save(deportes);
    mundoAbierto = categoryRepository.save(mundoAbierto);


    }
}