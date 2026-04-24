package com.example.pokedex.repository;

import com.example.pokedex.model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokemonRepository {

    public List<Pokemon> obtenerPokemones() {
        return List.of(
                new Pokemon("Charmander", "Fuego",
                        List.of("Agua", "Roca", "Tierra"),
                        List.of("Montaña", "Cueva"),
                        "Kanto"),

                new Pokemon("Squirtle", "Agua",
                        List.of("Planta", "Eléctrico"),
                        List.of("Mar", "Lago"),
                        "Kanto"),

                new Pokemon("Pikachu", "Eléctrico",
                        List.of("Tierra"),
                        List.of("Bosque"),
                        "Kanto")
        );
    }
}