package com.mafideju.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rolarDado()
        val botRolandoDads: Button = findViewById(R.id.playbutton)
        botRolandoDads.setOnClickListener {
            val toastAviso = Toast.makeText(this, "Boa Sorte!", Toast.LENGTH_SHORT)
            toastAviso.show()
            rolarDado()
        }
    }

    private fun rolarDado() {
        // INSTANCIA UM NOVO OBJETO DADO E EXECUTA A FUNCÇÃO PARA ROLAR
        val dado = Dado(6)
        val rolandoOsDados = dado.rolarDado()
        val luckyNumber = 6

        val imagemDado: ImageView = findViewById(R.id.imageView)
        val dadoSorteado = when (rolandoOsDados) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imagemDado.setImageResource(dadoSorteado)
        imagemDado.contentDescription = rolandoOsDados.toString()

//        when (diceRoll) {
//            luckyNumber -> println("Acertou!! =)")
//            1 -> println("Opa! Errou!!! Você tirou 1, o numero da sorte é $luckyNumber ")
//            2 -> println("Opa! Errou!!! Você tirou 2, o numero da sorte é $luckyNumber ")
//            3 -> println("Opa! Errou!!! Você tirou 3, o numero da sorte é $luckyNumber ")
//            4 -> println("Opa! Errou!!! Você tirou 4, o numero da sorte é $luckyNumber ")
//            5 -> println("Opa! Errou!!! Você tirou 5, o numero da sorte é $luckyNumber ")
//        }
    }
}

class Dado(private val numSides: Int) {

    fun rolarDado(): Int {
        return (1..numSides).random()
    }
}

/**
 * Adicione um Button a um app Android usando o Layout Editor.
   Modifique a classe MainActivity.kt para adicionar um comportamento interativo ao app.
   Abra uma mensagem Toast como solução temporária para verificar se você está no caminho certo.
   Defina um listener de cliques para um Button usando setOnClickListener() para adicionar um comportamento quando o Button for clicado.
   Quando o app está em execução, você pode atualizar a tela chamando métodos na TextView, no Button ou em outros elementos de IU no layout.
   Adicione comentários ao código para ajudar outras pessoas a entenderem sua abordagem.
   Reformate e limpe o código.
 * **/