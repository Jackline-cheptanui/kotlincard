
package com.example.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberRecycleviewAdapter(var numberList:List<BigInteger>): RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_items, parent, false)
        return NumberViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text=numberList.get(position).toString()


    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}
class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)



}