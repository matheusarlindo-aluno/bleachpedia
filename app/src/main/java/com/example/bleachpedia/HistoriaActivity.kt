package com.example.bleachpedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HistoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia)

        val historiaTextView: TextView = findViewById(R.id.historia_text)
        historiaTextView.text = """
            Bleach é uma série de anime baseada no mangá de mesmo nome escrito e ilustrado por Tite Kubo. A história segue Ichigo Kurosaki, um adolescente com a habilidade de ver fantasmas, cuja vida muda drasticamente quando ele obtém os poderes de um Shinigami (Ceifador de Almas) chamado Rukia Kuchiki.

            Enredo Principal:
            Introdução e Poderes de Ichigo: Ichigo Kurosaki, um jovem de 15 anos, tem a capacidade de ver fantasmas. Sua vida muda quando ele encontra Rukia Kuchiki, uma Shinigami, que está ferida e transferindo seus poderes para Ichigo para que ele possa salvar sua família de um Hollow (espírito maligno). Assim, Ichigo se torna um substituto de Shinigami, responsável por proteger o mundo humano dos Hollows e guiar almas para a Soul Society.

            Soul Society Arc: Após Rukia ser presa e condenada à execução por transferir seus poderes a um humano, Ichigo e seus amigos – Orihime Inoue, Yasutora "Chad" Sado, e Uryū Ishida – viajam à Soul Society para resgatá-la. Eles enfrentam diversos Shinigamis poderosos e revelam conspirações dentro da própria Soul Society.

            Arrancar Arc: Após os eventos da Soul Society, Ichigo e seus amigos enfrentam uma nova ameaça: os Arrancars, Hollows que adquiriram poderes de Shinigami. Eles são liderados por Sōsuke Aizen, um ex-capitão da Soul Society que traiu a organização. Aizen planeja destruir o mundo humano e Soul Society para criar um novo mundo sob seu controle.

            Fullbring Arc: Após perder seus poderes de Shinigami, Ichigo busca recuperá-los e se envolve com um grupo chamado Xcution, composto por humanos com habilidades sobrenaturais chamadas Fullbring.

            Thousand-Year Blood War Arc: A última e mais extensa saga do anime, onde Ichigo e seus aliados enfrentam o Wandenreich, um grupo de Quincies liderado por Yhwach. Este arco explora segredos profundos sobre a história de Ichigo, suas origens e os verdadeiros poderes que ele possui.

            Temas e Elementos Chave:
            Conflito e Crescimento Pessoal: A série destaca o crescimento de Ichigo e seus amigos enquanto enfrentam desafios cada vez mais difíceis e descobrem suas verdadeiras habilidades e propósitos.

            Conceito de Morte e Espiritualidade: Bleach explora conceitos de vida após a morte, com a Soul Society representando uma espécie de paraíso e os Hollows simbolizando almas perdidas que sucumbiram à negatividade.

            Rivalidade e Amizade: As relações de Ichigo com seus amigos e rivais são centrais para a trama, mostrando como essas conexões os fortalecem e impulsionam suas ações.

            Bleach é conhecido por suas batalhas emocionantes, desenvolvimento profundo de personagens e um enredo complexo que combina ação, drama e elementos sobrenaturais. O anime foi transmitido originalmente de 2004 a 2012, com uma adaptação final cobrindo o arco da Guerra Sangrenta de Mil Anos anunciada posteriormente.
        """.trimIndent()
    }
}