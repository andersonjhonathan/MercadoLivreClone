package br.com.andersonsouza.mercadolivreclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.andersonsouza.mercadolivreclone.databinding.AnuncioItemBinding
import br.com.andersonsouza.mercadolivreclone.model.Anuncio

class AnuncioAdapter(private val context: Context, val listaAnuncios: MutableList<Anuncio>):
    RecyclerView.Adapter<AnuncioAdapter.AnuncioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnuncioViewHolder {
        val itemLista = AnuncioItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return AnuncioViewHolder(itemLista)
    }

    override fun getItemCount() = listaAnuncios.size

    override fun onBindViewHolder(holder: AnuncioViewHolder, position: Int) {
        holder.imgAnuncio.setImageResource(listaAnuncios[position].img!!)
    }

    inner class AnuncioViewHolder(binding: AnuncioItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgAnuncio = binding.anuncio
    }

}