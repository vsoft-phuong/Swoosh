package com.chatcore.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chatcore.swoosh.R
import com.chatcore.swoosh.utilities.EXTRA_LEAGUE
import com.chatcore.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league: String? = ""
    var skill: String? = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for $league $skill league near you..."

    }
}
