package br.com.rrlabs.apps.databindingproject.ui.gameinfo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.rrlabs.apps.databindingproject.R
import br.com.rrlabs.apps.databindingproject.databinding.ActivityGameInfoBinding
import br.com.rrlabs.apps.databindingproject.model.Game
import br.com.rrlabs.apps.databindingproject.utils.contentView

class GameInfoActivity : AppCompatActivity() {
    //criação do databinding e o tipo do binding é gerado automaticamente
    //deve-se realizar um make no project antes de iniciar esta programação
    /*val binding: ActivityGameInfoBinding by lazy {
        DataBindingUtil.setContentView<ActivityGameInfoBinding>(
            this,
            R.layout.activity_game_info
        )
    }*/
    val binding: ActivityGameInfoBinding by contentView(R.layout.activity_game_info)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_game_info)

        //Criarei um novo objeto para o databinding
        val game = Game("River Raid",1984,"https://static.wixstatic.com/media/894d3e_8971fcbc8b764a57a81a2b164872ec86~mv2.png"2)

        binding.game = game

    }
    //parei na pagina 25
}
