package edu.iesam.pokemon.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import edu.iesam.pokemon.R
import edu.iesam.pokemon.app.extensions.loadUrl
import edu.iesam.pokemon.domain.Pokemon

class PokemonDetailActivity: AppCompatActivity() {

    private lateinit var pokemonFactory: PokemonFactory
    private lateinit var viewModel: PokemonDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)

        pokemonFactory = PokemonFactory(this)
        viewModel = pokemonFactory.buildPokemonDetailViewModel()

        getPokemonId()?.let { pokemonId ->
            viewModel.viewCreated(pokemonId)
        }

        setupObserver()
    }

    private fun setupObserver() {
        val pokemonObserver = Observer<PokemonDetailViewModel.UiState> { uiState ->
            uiState.pokemon?.let {
                bindData(it)
            }
            uiState.errorApp?.let {
                Log.d("@dev", "Error")
            }
            if (uiState.isLoading) {
                Log.d("@dev", "Cargando...")
            } else {
                Log.d("@dev", "Cargado!")
            }
        }
        viewModel.uiState.observe(this, pokemonObserver)
    }

    private fun getPokemonId(): String? {
        return intent.getStringExtra(KEY_POKEMON_ID)
    }

    private fun bindData(pokemon: Pokemon) {
        val imageView = findViewById<ImageView>(R.id.image)
        imageView.loadUrl(pokemon.image)
    }

    companion object {

        val KEY_POKEMON_ID = "key_pokemon_id"

        fun getIntent(context: Context, pokemonId: String): Intent {
            val intent = Intent(context, PokemonDetailActivity::class.java)
            intent.putExtra(KEY_POKEMON_ID, pokemonId)
            return intent
        }
    }
}