package com.example.takasimura.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.takasimura.R
import com.example.takasimura.model.KatalogChar
import com.squareup.picasso.Picasso

class KatalogAdapter (var data: ArrayList<Int>, var context: Activity?) : PagerAdapter() {
    lateinit var layoutInflater: LayoutInflater

    override fun getCount(): Int {
        return data.size
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }


    @NonNull
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_slider, container, false)

        //init
        val imageView: ImageView
        imageView = view.findViewById(R.id.imej)

        imageView.setImageResource(data[position])
        container.addView(view, 0)

        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, @NonNull `object`: Any) {
        container.removeView(`object` as View)
    }
}

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
//
//        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.list_katalog, parent, false)
//        return ItemHolder(itemHolder)
//    }
//
//    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
//
//        var katalogChar:KatalogChar = arrayList.get(position)
//
////        holder.icons.setImageResource(R.drawable.gambar1)
//        val ikon = (R.drawable.gambar1)
//        Picasso.get()
//            .load(ikon)
//            .placeholder(R.drawable.gambar1)
//            .error(R.drawable.gambar1)
//            .into(holder.icons)
//    }
//
//    override fun getItemCount(): Int {
//       return arrayList.size
//    }
//
//    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        var icons :ImageView = itemView.findViewById<ImageView>(R.id.ikon)
//
//    }
//}