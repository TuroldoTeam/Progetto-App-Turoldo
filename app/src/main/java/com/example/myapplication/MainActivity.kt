package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var bottoneOrario: Button
    lateinit var bottonePTOF: Button
    lateinit var bottoneRegistro: Button
    lateinit var bottoneLibri: Button
    lateinit var url: String            // URL a cui puntano bottoni

    lateinit var bottoneTelefono: LinearLayout      // Telefono

    lateinit var bottoneEmail: LinearLayout         // Email

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bottoneOrario = findViewById<Button>(R.id.orario)
        bottonePTOF = findViewById<Button>(R.id.ptof)
        bottoneRegistro = findViewById<Button>(R.id.registro)
        bottoneLibri = findViewById<Button>(R.id.libri)
        bottoneTelefono = findViewById<LinearLayout>(R.id.telefono)
        bottoneEmail = findViewById<LinearLayout>(R.id.email)



        bottoneOrario.setOnClickListener { v ->
            url = "https://www.istitutoturoldo.edu.it/didattica/calendario-scolastico/orario-scolastico/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        bottonePTOF.setOnClickListener { v ->
            url = "https://www.istitutoturoldo.edu.it/documento/regolamento-istituto/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        bottoneRegistro.setOnClickListener { v ->
            url =  "https://www.istitutoturoldo.edu.it/servizio/registro-elettronico-docenti/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        bottoneLibri.setOnClickListener { v ->
            url =  "https://www.istitutoturoldo.edu.it/didattica/adozioni-libri-di-testo/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        bottoneTelefono.setOnClickListener {
            url = "tel:+39034592210"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        bottoneEmail.setOnClickListener {
            url = "mailto:bgis013003@istruzione.it"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}