package com.nekkiichi.submissionandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nekkiichi.submissionandroidsederhana.data.ListWeaponAdapter
import com.nekkiichi.submissionandroidsederhana.data.Weapon
import com.nekkiichi.submissionandroidsederhana.data.WeaponData

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvWeapon: RecyclerView
    private var list: ArrayList<Weapon> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvWeapon = findViewById(R.id.rv_weapons)
        rvWeapon.setHasFixedSize(true)
        setSupportActionBar(findViewById(R.id.toolbar))

        list.addAll(WeaponData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvWeapon.layoutManager = LinearLayoutManager(this)
        val listWeaponAdapter = ListWeaponAdapter(list)
        rvWeapon.adapter = listWeaponAdapter

        listWeaponAdapter.setOnItemClickCallback(object : ListWeaponAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Weapon) {
                showWeaponDetails(data)
            }
        })
    }

    private fun showWeaponDetails(data: Weapon) {
        val intentNew = Intent(this, DetailsActivity::class.java)
        intentNew.putExtra(DetailsActivity.WPN_TITLE, data.title)
        intentNew.putExtra(DetailsActivity.WPN_DESC, data.description)
        intentNew.putExtra(DetailsActivity.WPN_ATK, data.stat.atk.toString())
        intentNew.putExtra(DetailsActivity.WPN_WEIGHT, data.stat.weight.toString())
        intentNew.putExtra(DetailsActivity.WPN_IMG, data.image)
        intentNew.putExtra(DetailsActivity.WPN_SKILL,data.stat.skill)
        startActivity(intentNew)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    //my function
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.bnavbar_about -> {
                val aboutIntent = Intent(this, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}


