package wellingtoneugenio.dev.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.alturaEDT
import kotlinx.android.synthetic.main.activity_main.calcularBTN
import kotlinx.android.synthetic.main.activity_main.pesoEDT
import kotlinx.android.synthetic.main.activity_main.titleTXT
import kotlinx.android.synthetic.main.meurelative.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners(){
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        calcularBTN.setOnClickListener {
            calcularIMC( pesoEDT.text.toString(), alturaEDT.text.toString())
        }

    }


    private fun calcularIMC( peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso!= null && altura!= null) {
            val imc = peso / (altura * altura)
            titleTXT.text = "Seu IMC é %3f".format(imc)
        }
    }


}

