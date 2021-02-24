package kz.step.cw2_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var registrationButton: Button? = null
    var nameEditText: EditText? = null
    var emailEditText: EditText? = null
    var passwordEditText: EditText? = null
    var passwordConfirmEditText: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    fun initializeViews(){
        registrationButton = findViewById(R.id.button_main_activity_registration_button)
        nameEditText = findViewById(R.id.textview_main_activity_name_text)
        emailEditText = findViewById(R.id.textview_main_activity_email_text)
        passwordEditText = findViewById(R.id.textview_main_activity_password_text)
        passwordConfirmEditText = findViewById(R.id.textview_main_activity_password_confirm_text)
    }

    fun initializeLiseners(){

    }
}