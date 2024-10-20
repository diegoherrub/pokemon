package edu.iesam.pokemon.presentation

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.pokemon.R
import edu.iesam.pokemon.app.extensions.loadUrl
import edu.iesam.pokemon.domain.Pokemon

class PokemonsActivity : AppCompatActivity() {

    private lateinit var pokemonFactory: PokemonFactory
    private lateinit var viewModel: PokemonsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemons)

        pokemonFactory = PokemonFactory(this)
        viewModel = pokemonFactory.buildViewModel()

        val pokemons = viewModel.viewCreated()
        bindData(pokemons)
    }

    private fun bindData(pokemons: List<Pokemon>) {

        findViewById<ImageView>(R.id.pokemon_image_1).loadUrl(pokemons[0].image)
        findViewById<TextView>(R.id.pokemon_id_1).text = "id - " + pokemons[0].id
        findViewById<TextView>(R.id.pokemon_name_1).text = "name - " + pokemons[0].name
        findViewById<TextView>(R.id.pokemon_order_1).text = "order - " + pokemons[0].order.toString()
        findViewById<TextView>(R.id.pokemon_type1_1).text = "type 1 - " + pokemons[0].type1
        if(pokemons[0].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type1_2).text = "type 2 - " + pokemons[0].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type1_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_1).setOnClickListener {
            navigateToPokemonDetail(pokemons[0].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_2).loadUrl(pokemons[1].image)
        findViewById<TextView>(R.id.pokemon_id_2).text = "id - " + pokemons[1].id
        findViewById<TextView>(R.id.pokemon_name_2).text = "name - " + pokemons[1].name
        findViewById<TextView>(R.id.pokemon_order_2).text = "order - " + pokemons[1].order.toString()
        findViewById<TextView>(R.id.pokemon_type1_2).text = "type 1 - " + pokemons[1].type1
        if(pokemons[1].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type2_2).text = "type 2 - " + pokemons[1].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type2_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_2).setOnClickListener {
            navigateToPokemonDetail(pokemons[1].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_3).loadUrl(pokemons[2].image)
        findViewById<TextView>(R.id.pokemon_id_3).text = "id - " + pokemons[2].id
        findViewById<TextView>(R.id.pokemon_name_3).text = "name - " + pokemons[2].name
        findViewById<TextView>(R.id.pokemon_order_3).text = "order - " + pokemons[2].order.toString()
        findViewById<TextView>(R.id.pokemon_type3_1).text = "type 1 - " + pokemons[2].type1
        if(pokemons[2].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type3_2).text = "type 2 - " + pokemons[2].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type3_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_3).setOnClickListener {
            navigateToPokemonDetail(pokemons[2].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_4).loadUrl(pokemons[3].image)
        findViewById<TextView>(R.id.pokemon_id_4).text = "id - " + pokemons[3].id
        findViewById<TextView>(R.id.pokemon_name_4).text = "name - " + pokemons[3].name
        findViewById<TextView>(R.id.pokemon_order_4).text = "order - " + pokemons[3].order.toString()
        findViewById<TextView>(R.id.pokemon_type4_1).text = "type 1 - " + pokemons[3].type1
        if(pokemons[3].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type4_2).text = "type 2 - " + pokemons[3].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type4_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_4).setOnClickListener {
            navigateToPokemonDetail(pokemons[3].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_5).loadUrl(pokemons[4].image)
        findViewById<TextView>(R.id.pokemon_id_5).text = "id - " + pokemons[4].id
        findViewById<TextView>(R.id.pokemon_name_5).text = "name - " + pokemons[4].name
        findViewById<TextView>(R.id.pokemon_order_5).text = "order - " + pokemons[4].order.toString()
        findViewById<TextView>(R.id.pokemon_type5_1).text = "type 1 - " + pokemons[4].type1
        if(pokemons[4].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type5_2).text = "type 2 - " + pokemons[4].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type5_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_5).setOnClickListener {
            navigateToPokemonDetail(pokemons[4].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_6).loadUrl(pokemons[5].image)
        findViewById<TextView>(R.id.pokemon_id_6).text = "id - " + pokemons[5].id
        findViewById<TextView>(R.id.pokemon_name_6).text = "name - " + pokemons[5].name
        findViewById<TextView>(R.id.pokemon_order_6).text = "order - " + pokemons[5].order.toString()
        findViewById<TextView>(R.id.pokemon_type6_1).text = "type 1 - " + pokemons[5].type1
        if(pokemons[5].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type6_2).text = "type 2 - " + pokemons[5].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type6_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_6).setOnClickListener {
            navigateToPokemonDetail(pokemons[5].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_7).loadUrl(pokemons[6].image)
        findViewById<TextView>(R.id.pokemon_id_7).text = "id - " + pokemons[6].id
        findViewById<TextView>(R.id.pokemon_name_7).text = "name - " + pokemons[6].name
        findViewById<TextView>(R.id.pokemon_order_7).text = "order - " + pokemons[6].order.toString()
        findViewById<TextView>(R.id.pokemon_type7_1).text = "type 1 - " + pokemons[6].type1
        if(pokemons[6].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type7_2).text = "type 2 - " + pokemons[6].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type7_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_7).setOnClickListener {
            navigateToPokemonDetail(pokemons[6].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_8).loadUrl(pokemons[7].image)
        findViewById<TextView>(R.id.pokemon_id_8).text = "id - " + pokemons[7].id
        findViewById<TextView>(R.id.pokemon_name_8).text = "name - " + pokemons[7].name
        findViewById<TextView>(R.id.pokemon_order_8).text = "order - " + pokemons[7].order.toString()
        findViewById<TextView>(R.id.pokemon_type8_1).text = "type 1 - " + pokemons[7].type1
        if(pokemons[7].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type8_2).text = "type 2 - " + pokemons[7].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type8_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_8).setOnClickListener {
            navigateToPokemonDetail(pokemons[7].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_9).loadUrl(pokemons[8].image)
        findViewById<TextView>(R.id.pokemon_id_9).text = "id - " + pokemons[8].id
        findViewById<TextView>(R.id.pokemon_name_9).text = "name - " + pokemons[8].name
        findViewById<TextView>(R.id.pokemon_order_9).text = "order - " + pokemons[8].order.toString()
        findViewById<TextView>(R.id.pokemon_type9_1).text = "type 1 - " + pokemons[8].type1
        if(pokemons[8].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type9_2).text = "type 2 - " + pokemons[8].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type9_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_9).setOnClickListener {
            navigateToPokemonDetail(pokemons[8].id)
        }

        findViewById<ImageView>(R.id.pokemon_image_10).loadUrl(pokemons[9].image)
        findViewById<TextView>(R.id.pokemon_id_10).text = "id - " + pokemons[9].id
        findViewById<TextView>(R.id.pokemon_name_10).text = "name - " + pokemons[9].name
        findViewById<TextView>(R.id.pokemon_order_10).text = "order - " + pokemons[9].order.toString()
        findViewById<TextView>(R.id.pokemon_type10_1).text = "type 1 - " + pokemons[9].type1
        if(pokemons[9].type2 != null) {
            findViewById<TextView>(R.id.pokemon_type10_2).text = "type 2 - " + pokemons[9].type2
        } else {
            findViewById<TextView>(R.id.pokemon_type10_2).text = "type 2 - "
        }
        findViewById<LinearLayout>(R.id.layout_10).setOnClickListener {
            navigateToPokemonDetail(pokemons[9].id)
        }
    }

    private fun navigateToPokemonDetail(pokemonId: String) {
        startActivity(PokemonDetailActivity.getIntent(this, pokemonId))
    }
}