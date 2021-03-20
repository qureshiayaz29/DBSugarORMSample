package `in`.insideandroid.sugardbsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savePersonButton.setOnClickListener {

            val name = nameInput.text.toString()
            val age = ageInput.text.toString()

            if(name.isNotEmpty() && age.isNotEmpty()){
                savePerson(name, age)

                nameInput.setText("")
                ageInput.setText("")
            }
        }
    }

    private fun savePerson(name: String, age: String) {

        val person = Person(name, age.toInt())
        person.save()
    }
}