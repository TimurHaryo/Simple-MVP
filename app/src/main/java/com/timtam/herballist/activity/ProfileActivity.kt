package com.timtam.herballist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timtam.herballist.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnBackProfile.setOnClickListener {
            onBackPressed()
        }
    }
}
