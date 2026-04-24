package com.example.pokedex.service;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return repository.obtenerPokemones()
                .stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return repository.obtenerPokemones()
                .stream()
                .filter(p -> p.getZonas().stream()
                        .anyMatch(z -> z.equalsIgnoreCase(zona)))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return repository.obtenerPokemones()
                .stream()
                .filter(p -> p.getDebilidades().stream()
                        .anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .collect(Collectors.toList());
    }
}