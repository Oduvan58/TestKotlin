package by.geekbrains.testkotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var helloButton: MaterialButton
    lateinit var firstNameTextView: TextView
    lateinit var lastNameTextView: TextView

    private lateinit var friendList: List<Friend>

    private val fullName = Friend("Pavel", "Yancheuski")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFriendsList()

        firstCycle()
        secondCycle()
        thirdCycle()

        initViews()
        helloButton.setOnClickListener {
            firstNameTextView.text = fullName.firstName
            lastNameTextView.text = Person.getPerson().lastName
        }
    }

    private fun initViews() {
        firstNameTextView = findViewById(R.id.first_name_text_view)
        lastNameTextView = findViewById(R.id.last_name_text_view)
        helloButton = findViewById(R.id.test_button)
    }

    private fun initFriendsList() {
        friendList = listOf(Friend("James", "Bond"))
    }

    private fun firstCycle() {
        for (friend in friendList) {
            Log.i("TAG", friend.toString())
        }
    }

    private fun secondCycle() {
        for (i in 1..10) {
            Log.i("TAG", "Hello")
        }
    }

    private fun thirdCycle() {
        for (i in 10 downTo 1 step 2) {
            Log.i("TAG", "Friend")
        }
    }
}