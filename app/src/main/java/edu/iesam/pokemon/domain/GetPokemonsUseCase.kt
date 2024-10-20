package edu.iesam.pokemon.domain

class GetPokemonsUseCase(private val pokemonRepository: PokemonRepository) {

    operator fun invoke(): List<Pokemon> {

        return pokemonRepository.getPokemons()
    }
}