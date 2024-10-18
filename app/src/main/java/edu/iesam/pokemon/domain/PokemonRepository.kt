package edu.iesam.pokemon.domain

interface PokemonRepository {

    fun getPokemon(pokemonId: String): Pokemon?
    fun getPokemons(): List<Pokemon>
}