package wellingtoneugenio.dev.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListenes()

    }

    fun setListenes(){
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

    }


}