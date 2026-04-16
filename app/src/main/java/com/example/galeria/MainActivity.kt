package com.example.galeria

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    private val imagenes = intArrayOf(
        R.drawable.pic01, R.drawable.pic02,
        R.drawable.pic03, R.drawable.pic04,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // referencia al imageView principal
        imageView = findViewById(R.id.imageView)

        // referencia al RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // configuración del adaptador
        val adapter = ImagenAdapter(imagenes) { position ->

            // mostrar la imagen seleccionada en grande
            imageView.setImageResource(imagenes[position])
        }

        recyclerView.adapter = adapter
    }
}