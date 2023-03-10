package com.example.myapplication

import android.content.Intent
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MyAdapter (val listtache:ArrayList<Data>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(myview:View,var my_data:Data?=null):RecyclerView.ViewHolder(myview) {
        //init {

            //itemView.setOnClickListener{
                //Toast.makeText(itemView.context,my_data?.Nomtache,Toast.LENGTH_LONG).show()
               /*var otheractivity= Intent(itemView.context,MainActivity2::class.java)
                otheractivity.putExtra("Description",my_data?.Description)
                itemView.context.startActivity(otheractivity)*/
                /*var aa=LayoutInflater.from(this)
                var v=aa.inflate(R.layout.update,null)
                val adddialo=AlertDialog.Builder(this)
                adddialo.setView(v)
                adddialo.show()
            }*/
        //}
        val text_tache=itemView.findViewById(R.id.textView) as TextView
        var delete=itemView.findViewById(R.id.mydelete)as ImageButton
        var edut=itemView.findViewById(R.id.imageupdate) as ImageButton

       /*fun deleted(listA :ArrayList<String>){
            delete.setOnClickListener(View.OnClickListener {
                Toast.makeText(itemView.context,my_data?.Nomtache,Toast.LENGTH_LONG).show()
               
            })
        }*/

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.row_recycleview,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //val data:Data=listtache[position]
        val data=listtache[position]
        holder.text_tache.text=data.Nomtache
        holder.my_data=data
        holder.delete.setOnClickListener { remove(position) }

        holder.edut.setOnClickListener {
            //val context: Context
            //Toast.makeText(holder.edut.context,"hello",Toast.LENGTH_LONG).show()
            var aa=LayoutInflater.from(holder.itemView.context)
            var v=aa.inflate(R.layout.update,null)
            val adddialo=AlertDialog.Builder(holder.itemView.context)

            val titleInput: EditText = v.findViewById(R.id.nomtacheup)
            val updateButton:Button = v.findViewById(R.id.updatetachee)
            titleInput.setText(data.Nomtache)

            updateButton.setOnClickListener {
                data.Nomtache= titleInput.text.toString()
                this.notifyItemChanged(position)
                Toast.makeText(holder.edut.context, "Task Updated", Toast.LENGTH_SHORT).show()
                //var v1=aa.inflate(R.layout.activity_main,null)
                adddialo.setCancelable(true)
            }
            adddialo.setView(v)
            adddialo.show()
}

}




private fun remove(position: Int) {
listtache.removeAt(position)
notifyItemRemoved(position)
//or for modification notifyDataSetChanged()
}

override fun getItemCount(): Int {
return  listtache.size
}


}