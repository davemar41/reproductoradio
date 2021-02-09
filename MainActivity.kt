package com.example.reproductoraudio

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val path="D://Users//dmart//AndroidStudioProjects//reproductoraudio//app//src//main//assets//buscando.mp3"
        //val clip= File(Environment.getExternalStorageState(),path)
        val mp=MediaPlayer.create(this, R.raw.buscando)
        var posicion = 0
        play.setOnClickListener {
            if (mp.isPlaying() == false) {
                mp.seekTo(posicion)
                mp.start()
            }
        }
        pausa.setOnClickListener {
            if(mp.isPlaying){
                posicion=mp.getCurrentPosition()
                mp.pause()
            }

        }
        stop.setOnClickListener {
            mp.pause()
            posicion=0

        }
    }
}