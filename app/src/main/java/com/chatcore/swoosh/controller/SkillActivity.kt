package com.chatcore.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chatcore.swoosh.R
import com.chatcore.swoosh.model.Player
import com.chatcore.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }

    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        player.skill = if (beginnerBtn.isChecked) beginnerBtn.text.toString() else ""
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        player.skill = if (ballerBtn.isChecked) ballerBtn.text.toString() else ""
    }

    fun onFinishClicked(view: View) {
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}
