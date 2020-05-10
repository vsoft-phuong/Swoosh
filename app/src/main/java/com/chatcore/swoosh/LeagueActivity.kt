package com.chatcore.swoosh

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun leagueOnClicked(view: View) {
        if (selected != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selected)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

    var selected = ""
    fun menBtnClicked(view: View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false

        selected = if (menBtn.isChecked) menBtn.text.toString() else ""
    }

    fun womenBtnClicked(view: View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false

        selected = if (womenBtn.isChecked) womenBtn.text.toString() else ""
    }

    fun coedBtnClicked(view: View) {
        womenBtn.isChecked = false
        menBtn.isChecked = false

        selected = if (coedBtn.isChecked) coedBtn.text.toString() else ""
    }


}
