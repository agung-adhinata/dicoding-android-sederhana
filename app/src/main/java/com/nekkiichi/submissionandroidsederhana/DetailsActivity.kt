package com.nekkiichi.submissionandroidsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions

class DetailsActivity : AppCompatActivity() {

    companion object {
        const val WPN_TITLE = "wpn_title"
        const val WPN_DESC = "wpn_desc"
        const val WPN_ATK = "wpn_atk"
        const val WPN_WEIGHT = "wpn_weight"
        const val WPN_IMG = "wpn_img"
        const val WPN_SKILL = "wpn_skill"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = "Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val wpnTitle = intent.getStringExtra(WPN_TITLE)
        val wpnDesc = intent.getStringExtra(WPN_DESC)
        val wpnAtk = intent.getStringExtra(WPN_ATK)
        val wpnWeight = intent.getStringExtra(WPN_WEIGHT)
        val wpnImage = intent.getIntExtra(WPN_IMG, 0)
        val wpnSkill = intent.getStringExtra(WPN_SKILL)

        val tvTitle: TextView = findViewById(R.id.tv_wpn_title)
        val tvDescription: TextView = findViewById(R.id.tv_wpn_description)
        val imgWpn: ImageView? = findViewById(R.id.img_wpn)
        val tvStatAtk: TextView? = findViewById(R.id.tv_wpn_attr_atk)
        val tvStatWeight: TextView? = findViewById(R.id.tv_wpn_attr_weight)
        val tvStatSkill: TextView? = findViewById(R.id.tv_wpn_skill)

        imgWpn?.let {
            Glide.with(this).load(wpnImage)
                .apply(RequestOptions().override(400,400))
                .into(imgWpn)
        }

        tvTitle.text = wpnTitle
        tvDescription.text = wpnDesc
        tvStatAtk?.text = wpnAtk
        tvStatWeight?.text = wpnWeight
        tvStatSkill?.text = wpnSkill
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}