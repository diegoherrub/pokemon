package edu.iesam.pokemon.data.remote

import edu.iesam.pokemon.domain.Pokemon

class PokemonMockRemoteDataSource {

    private val pokemons = listOf(
        Pokemon("5", "charmeleon", 6, "fire", null, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png"),
        Pokemon("15", "beedrill", 19, "bug", "poison", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png"),
        Pokemon("25", "pikachu", 36, "electric", null,"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"),
        Pokemon("35", "clefairy", 65, "fairy", null, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png"),
        Pokemon("45", "vileplume", 79, "grass", "poison", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png"),
        Pokemon("55", "golduck", 95, "water", null, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/55.png"),
        Pokemon("65", "alakazam", 106, "psychic", null, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/65.png"),
        Pokemon("75", "graveler", 118, "rock", "ground", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/75.png"),
        Pokemon("85", "dodrio", 139, "normal", "flying", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/85.png"),
        Pokemon("95", "onix", 152, "rock", "ground", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/95.png"),
    )

    fun getPokemon(pokemonId: String): Pokemon? {
        return pokemons.firstOrNull { pokemon ->
            pokemon.id == pokemonId
        }
    }

    fun getPokemons(): List<Pokemon> {
        return pokemons
    }
}