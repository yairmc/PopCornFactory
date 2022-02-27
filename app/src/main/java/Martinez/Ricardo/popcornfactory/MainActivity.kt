package Martinez.Ricardo.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton:Button= findViewById(R.id.botonP)
        boton.setOnClickListener(){
            var intent: Intent= Intent(this,Catalogo::class.java)
            startActivity(intent)
        }
    }
}