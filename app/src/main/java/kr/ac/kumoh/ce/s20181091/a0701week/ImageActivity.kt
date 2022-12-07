package kr.ac.kumoh.ce.s20181091.a0701week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ImageActivvity::class.java)
            startActivity(intent)
        }
    }
}