package com.example.pokedex;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PokedexApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService service) {
        return args -> {

            System.out.println("=== FILTRO POR TIPO ===");
            imprimir(service.filtrarPorTipo("Agua"));

            System.out.println("=== FILTRO POR ZONA ===");
            imprimir(service.filtrarPorZona("Bosque"));

            System.out.println("=== FILTRO POR DEBILIDAD ===");
            imprimir(service.filtrarPorDebilidad("Tierra"));
        };
    }

    private void imprimir(List<Pokemon> pokemones) {
        pokemones.forEach(p ->
                System.out.println("[PKMN] Nombre: " + p.getNombre()
                        + " | Tipo: " + p.getTipo()
                        + " | Debilidades: " + String.join(", ", p.getDebilidades()))
        );
    }
}