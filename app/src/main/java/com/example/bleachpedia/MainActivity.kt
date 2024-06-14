package com.example.bleachpedia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAnime: Button = findViewById(R.id.button_anime)
        val buttonNovel: Button = findViewById(R.id.button_novel)
        val buttonPersonagens: Button = findViewById(R.id.button_personagens)
        val buttonHistoria: Button = findViewById(R.id.button_historia)

        buttonAnime.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.crunchyroll.com/pt-br/series/G63VGG2NY/bleach"))
            startActivity(intent)
        }

        buttonNovel.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://e-novel.online/novel/bleach-cant-fear-your-own-world-ler-online/volume-01/prologo/"))
            startActivity(intent)
        }

        buttonPersonagens.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://bleach.fandom.com/pt-br/wiki/Personagens"))
            startActivity(intent)
        }

        buttonHistoria.setOnClickListener {
            val intent = Intent(this, HistoriaActivity::class.java)
            startActivity(intent)
        }
    }
}