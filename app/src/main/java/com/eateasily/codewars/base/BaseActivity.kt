package com.eateasily.codewars.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eateasily.codewars.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}