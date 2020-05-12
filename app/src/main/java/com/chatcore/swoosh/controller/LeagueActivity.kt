package com.chatcore.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chatcore.swoosh.R
import com.chatcore.swoosh.model.Player
import com.chatcore.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun leagueOnClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }


    fun menBtnClicked(view: View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = if (menBtn.isChecked) menBtn.text.toString() else ""
    }

    fun womenBtnClicked(view: View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = if (womenBtn.isChecked) womenBtn.text.toString() else ""
    }

    fun coedBtnClicked(view: View) {
        womenBtn.isChecked = false
        menBtn.isChecked = false

        player.league = if (coedBtn.isChecked) coedBtn.text.toString() else ""
    }


}
