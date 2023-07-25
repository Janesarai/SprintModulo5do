package com.example.sprintmodulo5do

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintmodulo5do.databinding.ItemLayoutBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {


  var zapatillas = mutableListOf<ZapatillaList>()


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
    var binding =ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent , false)
    return ViewHolder(binding)
  }

  override fun getItemCount(): Int {
    return zapatillas.size
  }

  override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
    var item = zapatillas[position]
    holder.bind(item)
  }
  fun setData(listazapatos: List<Zapatillas>){
    zapatillas = listazapatos.toMutableList()
  }

  inner class ViewHolder (val binding: ItemLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(item:Zapatillas){

      binding.txZapatilla.text = item.nombre
      binding.txPrecio.text = item.precio.toString()
      binding.imgZapatilla.load(item.imgUrl)
      val bundle = Bundle()
      bundle.putString("nombre",item.nombre)
      bundle.putString("precio", item.precio.toString())
      bundle.putString("url",item.imgUrl)
      binding.CardViewComprar.setOnClickListener({
        Navigation.findNavController(binding.root).navigate(R.id.action_fragmentComprar_to_fragmentDetalle,bundle)
      })
    }
  }
}