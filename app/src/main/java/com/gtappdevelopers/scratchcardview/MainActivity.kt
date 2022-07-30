package com.gtappdevelopers.scratchcardview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cooltechworks.views.ScratchImageView


class MainActivity : AppCompatActivity() {
    lateinit var scratchImageView: ScratchImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scratchImageView = findViewById(R.id.idScratchCardIv)
        scratchImageView.setRevealListener(object : ScratchImageView.IRevealListener {
            override fun onRevealed(iv: ScratchImageView) {
                Toast.makeText(this@MainActivity, "Image is revealed", Toast.LENGTH_SHORT).show()
            }
            override fun onRevealPercentChangedListener(siv: ScratchImageView, percent: Float) {
            }
        })
    }
}