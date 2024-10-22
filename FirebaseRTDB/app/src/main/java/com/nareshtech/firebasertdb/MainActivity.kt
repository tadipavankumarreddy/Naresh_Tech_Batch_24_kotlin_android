package com.nareshtech.firebasertdb

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var tin: TextInputLayout
    lateinit var tia: TextInputLayout
    lateinit var progressBar: ProgressBar
    lateinit var result: TextView
    lateinit var firebaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initializeUIComponents()
        progressBar.visibility = ProgressBar.INVISIBLE

        firebaseReference = Firebase.database.getReference("users")
    }


    fun saveData(view: View) {
        progressBar.visibility = ProgressBar.VISIBLE
        val name:String = tin.editText?.text.toString()
        val age:Int = tia.editText?.text.toString().toInt()
        val user:User = User(name,age)

        // TODO 1: Set up the firebase Project and enable the real time databases feature.
        // TODO 2: Push the data to firebase
        firebaseReference.push().setValue(user).addOnSuccessListener {
            progressBar.visibility = ProgressBar.INVISIBLE
            Snackbar.make(view,"Data saved Successfully",Snackbar.LENGTH_LONG).show()
        }.addOnFailureListener {
            Snackbar.make(view,"Data saved unsuccessful",Snackbar.LENGTH_LONG).show()
        }

        tia.editText?.text?.clear()
        tin.editText?.text?.clear()
    }

    fun loadData(view: View) {
        progressBar.visibility = ProgressBar.VISIBLE
        val getListener:ValueEventListener = object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val stringBuilder = StringBuilder()
                for(s in snapshot.children){
                    val user = s.getValue(User::class.java) as User
                    stringBuilder.append("${user.name}  ${user.age}\n\n")
                }
                progressBar.visibility = ProgressBar.INVISIBLE
                result.text = stringBuilder.toString()
                Snackbar.make(view,"Data Loaded Successfully",Snackbar.LENGTH_LONG).show()
            }

            override fun onCancelled(error: DatabaseError) {
                progressBar.visibility = ProgressBar.INVISIBLE
                Snackbar.make(view,"Data load unsuccessful",Snackbar.LENGTH_LONG).show()
            }

        }

        // invoke the getListener
        firebaseReference.addValueEventListener(getListener)
    }

    data class User(val name:String, val age:Int){
        constructor():this("",0)
    }

    private fun initializeUIComponents() {
        tin = findViewById(R.id.textInputName)
        tia = findViewById(R.id.textInputAge)
        result = findViewById(R.id.result)
        progressBar = findViewById(R.id.progressBar)
    }
}