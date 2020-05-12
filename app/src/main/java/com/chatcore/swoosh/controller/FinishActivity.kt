package com.chatcore.swoosh.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chatcore.swoosh.R
import com.chatcore.swoosh.model.Player
import com.chatcore.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."

    }
}
