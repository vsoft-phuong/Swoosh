package com.chatcore.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chatcore.swoosh.R
import com.chatcore.swoosh.utilities.EXTRA_LEAGUE
import com.chatcore.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league: String? = ""
    var skill: String? = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        skill = if (beginnerBtn.isChecked) beginnerBtn.text.toString() else ""
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        skill = if (ballerBtn.isChecked) ballerBtn.text.toString() else ""
    }

    fun onFinishClicked(view: View) {
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}
