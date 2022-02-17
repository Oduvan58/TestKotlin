package by.geekbrains.testkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<MaterialButton>(R.id.test_button)
        button.setOnClickListener {
            Toast.makeText(this, "Hello my friend!", Toast.LENGTH_SHORT).show()
        }
    }
}