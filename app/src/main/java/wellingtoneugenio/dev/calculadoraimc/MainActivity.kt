package wellingtoneugenio.dev.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "entrei no RESUME - agora voc~e pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - a tela perdeu o foco. você não pode interagir")
    }

    override fun onStop(){
        super.onStop()
        Log.w("lifecycle","STOP - a tela não está visível mais ainda existe")
    }

    override fun onRestart(){
        super.onRestart()
        Log.w("lifecycle", "\nentrei no RESTART - a tela esta retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "\nentrei no DESTROY -oh não! a tela foi destruída!")
    }
}