package com.timtam.herballist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.timtam.herballist.R
import com.timtam.herballist.adapter.AdvantagesAdapter
import kotlinx.android.synthetic.main.activity_content.*

class ContentActivity : AppCompatActivity() {
    private lateinit var adapter: AdvantagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        val bundle = intent.extras!!
        val layoutInflater = LinearLayoutManager(applicationContext)

        tvDetailName.text = bundle.getString("name")
        tvDetailCategory.text = bundle.getString("category")
        tvDetailOtherName.text = bundle.getString("latinName")
        tvDetailHowToUse.text = bundle.getString("usage")
        tvDetailDesc.text = bundle.getString("desc")
        imageViewDetail.setImageResource(bundle.getInt("image"))

        adapter = AdvantagesAdapter(bundle.getStringArrayList("advs"))
        recyclerViewDetail.itemAnimator = DefaultItemAnimator()
        recyclerViewDetail.layoutManager = layoutInflater
        recyclerViewDetail.adapter = adapter

        btnBackToMain.setOnClickListener {
            onBackPressed()
        }
    }
}
