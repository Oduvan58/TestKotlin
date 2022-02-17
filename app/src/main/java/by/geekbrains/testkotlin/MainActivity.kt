package by.geekbrains.testkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var helloButton: MaterialButton
    lateinit var firstNameTextView: TextView
    lateinit var lastNameTextView: TextView

    private val fullName = Friend("Pavel", "Yancheuski")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        helloButton.setOnClickListener {
            firstNameTextView.text = fullName.firstName
            lastNameTextView.text = Person.getPerson().lastName
        }
    }

    fun initViews() {
        firstNameTextView = findViewById(R.id.first_name_text_view)
        lastNameTextView = findViewById(R.id.last_name_text_view)
        helloButton = findViewById(R.id.test_button)
    }
}