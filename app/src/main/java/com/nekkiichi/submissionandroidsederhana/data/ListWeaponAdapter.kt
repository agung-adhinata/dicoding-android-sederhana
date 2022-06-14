package com.nekkiichi.submissionandroidsederhana.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.nekkiichi.submissionandroidsederhana.R

class ListWeaponAdapter(private val listWeapon: ArrayList<Weapon>) :
    RecyclerView.Adapter<ListWeaponAdapter.ListViewHolder>() {

    interface OnItemClickCallback {fun onItemClicked(data:Weapon)}


    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById<TextView>(R.id.tv_wpn_title)
        var tvDescription: TextView = itemView.findViewById<TextView>(R.id.tv_wpn_description)
        var imgWpn: ImageView? = itemView.findViewById(R.id.img_wpn)
        var tvStatAtk: TextView? = itemView.findViewById<TextView>(R.id.tv_wpn_attr_atk)
        var tvStatWeight: TextView? = itemView.findViewById<TextView>(R.id.tv_wpn_attr_weight)
        var tvStatSkill: TextView? = itemView.findViewById(R.id.tv_wpn_skill)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_weapons, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val weapon = listWeapon[position]
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listWeapon[holder.adapterPosition])
        }
        holder.imgWpn?.let {
            Glide.with(holder.itemView.context)
                .load(weapon.image)
                .apply(RequestOptions().override(100,100))
                .into(it)
        }
        holder.tvTitle.text = weapon.title
        holder.tvDescription.text = weapon.description
        holder.tvStatAtk?.text = weapon.stat.atk.toString()
        holder.tvStatWeight?.text = weapon.stat.weight.toString()
        holder.tvStatSkill?.text = weapon.stat.skill
    }

    override fun getItemCount(): Int {
        return listWeapon.size
    }

}