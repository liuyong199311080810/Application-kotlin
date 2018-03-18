package com.example.demo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.demo2.R

/**
 * Created by 19915 on 2018/3/18.
 * StudentAdapter
 */
class StudentAdapter(private val list: List<Student>, private val listener: OnItemClickListener) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.student_recycle_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = list[position]
        holder.tv.text = student.name
        holder.tv2.text = student.age.toString()
        holder.tv3.text = student.address

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var tv: TextView = itemView!!.findViewById(R.id.tv)
        var tv2: TextView = itemView!!.findViewById(R.id.tv2)
        var tv3: TextView = itemView!!.findViewById(R.id.tv3)

        init {
            itemView!!.setOnClickListener(this@ViewHolder)
        }

        override fun onClick(v: View?) {
            listener.onItemClick(v,adapterPosition)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(itemView: View?,index: Int)
    }

}