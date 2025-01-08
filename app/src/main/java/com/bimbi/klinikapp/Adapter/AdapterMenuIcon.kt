package com.bimbi.klinikapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bimbi.klinikapp.R
import com.bimbi.klinikapp.model.ModelIcon

class AdapterMenuIcon (

    val itemMenuList: List<ModelIcon>
): RecyclerView.Adapter<AdapterMenuIcon.MyviewHolder>(){
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgIcon : ImageView = itemView.findViewById(R.id.imgIcon)
        var txtMenu : TextView = itemView.findViewById(R.id.txtMenu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menuicon,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.imgIcon.setImageResource(currentItem.icon)
        holder.txtMenu.setText(currentItem.iconName)
    }

}