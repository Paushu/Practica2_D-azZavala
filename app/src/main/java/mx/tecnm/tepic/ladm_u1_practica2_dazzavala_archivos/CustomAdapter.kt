package mx.tecnm.tepic.ladm_u1_practica2_dazzavala_archivos


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf("Alicia","Luis","Elena","Victor","Mireya","Lina","Raúl","Daniel","Laura","Javier")
    val details = arrayOf("Endodoncia","Limpieza","Extraer incisivos","Resina","Limpieza"
        ,"Brackets","Retenedores","Limpieza","Radioagrafia","Molde superior e inferior")
    val images = intArrayOf(R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,
        R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,
        R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,R.drawable.ohdienteamigo,R.drawable.ohdienteamigo)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detalle)
        }
    }
}