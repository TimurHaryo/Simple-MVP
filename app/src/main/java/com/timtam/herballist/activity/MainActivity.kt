package com.timtam.herballist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.timtam.herballist.AdvVars.alvokatAdv
import com.timtam.herballist.AdvVars.jaheAdv
import com.timtam.herballist.AdvVars.jintanAdv
import com.timtam.herballist.AdvVars.kangkungAdv
import com.timtam.herballist.AdvVars.kelorAdv
import com.timtam.herballist.AdvVars.kencurAdv
import com.timtam.herballist.AdvVars.kmanisAdv
import com.timtam.herballist.AdvVars.kunyitAdv
import com.timtam.herballist.AdvVars.lbuayaAdv
import com.timtam.herballist.AdvVars.seledriAdv
import com.timtam.herballist.AdvVars.sirihAdv
import com.timtam.herballist.AdvVars.temulwakAdv
import com.timtam.herballist.DescVars.alvokatDesc
import com.timtam.herballist.DescVars.jaheDesc
import com.timtam.herballist.DescVars.jintanDesc
import com.timtam.herballist.DescVars.kangkungDesc
import com.timtam.herballist.DescVars.kelorDesc
import com.timtam.herballist.DescVars.kencurDesc
import com.timtam.herballist.DescVars.kmanisDesc
import com.timtam.herballist.DescVars.kunyitDesc
import com.timtam.herballist.DescVars.lbuayaDesc
import com.timtam.herballist.DescVars.seledriDesc
import com.timtam.herballist.DescVars.sirihDesc
import com.timtam.herballist.DescVars.temulwakDesc
import com.timtam.herballist.R
import com.timtam.herballist.adapter.PlantsAdapter
import com.timtam.herballist.model.Plants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter: PlantsAdapter
    private var myData: List<Plants>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myLayoutManager = LinearLayoutManager(applicationContext)
        setAllData()

        btnToProfile.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
        }

        myAdapter = PlantsAdapter(this@MainActivity, this.myData!!)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.layoutManager = myLayoutManager
        recyclerView.adapter = myAdapter
    }

    private fun setAllData() {
        myData = listOf(
            Plants(
                name = "Kunyit",
                desc = kunyitDesc,
                image = R.drawable.kunyit,
                category = "Rempah-rempah",
                advantages = kunyitAdv,
                latinName = "Curcuma longa",
                usage = "Dibuat jamu, untuk bumbu masak"
            ),
            Plants(
                name = "Jahe",
                desc = jaheDesc,
                image = R.drawable.jahe,
                category = "Rempah-rempah",
                advantages = jaheAdv,
                latinName = "Zingiber officinale",
                usage = "Dibuat minuman, dioleskan untuk kulit"
            ),
            Plants(
                name = "Avokad",
                desc = alvokatDesc,
                image = R.drawable.avokad,
                category = "Buah",
                advantages = alvokatAdv,
                latinName = "Persea americana",
                usage = "Dibuat jus, dimakan langsung"
            ),
            Plants(
                name = "Daun Kelor",
                desc = kelorDesc,
                image = R.drawable.daunkelor,
                category = "Dedaunan",
                advantages = kelorAdv,
                latinName = "Moringa oleifera",
                usage = "Dibuat minuman, makanan, dsb"
            ),
            Plants(
                name = "Daun Sirih",
                desc = sirihDesc,
                image = R.drawable.daunsirih,
                category = "Dedaunan",
                advantages = sirihAdv,
                latinName = "Piper betle",
                usage = "Direbus dan diminum, dibuat cuci wajah"
            ),
            Plants(
                name = "Kangkung",
                desc = kangkungDesc,
                image = R.drawable.kangkung,
                category = "Sayuran",
                advantages = kangkungAdv,
                latinName = "Ipomoea aquatica",
                usage = "Dimasak"
            ),
            Plants(
                name = "Kencur",
                desc = kencurDesc,
                image = R.drawable.kencur,
                category = "Rempah-rempah",
                advantages = kencurAdv,
                latinName = "Kaempferia galanga",
                usage = "Dibuat jamu"
            ),
            Plants(
                name = "Kayu Manis",
                desc = kmanisDesc,
                image = R.drawable.kayumanis,
                category = "Rempah-rempah",
                advantages = kmanisAdv,
                latinName = "Cinnamomum verum",
                usage = "Dibuat ekstrak, dibuat cairan, dsb"
            ),
            Plants(
                name = "Jintan Hitam",
                desc = jintanDesc,
                image = R.drawable.jintanhitam,
                category = "Rempah-rempah",
                advantages = jintanAdv,
                latinName = "Nigella sativa",
                usage = "Ditumbuk dan dioleskan ke wajah"
            ),
            Plants(
                name = "Temulawak",
                desc = temulwakDesc,
                image = R.drawable.temulawak,
                category = "Rempah-rempah",
                advantages = temulwakAdv,
                latinName = "Curcuma zanthorrhiza",
                usage = "Dibuat jamu dan vitamin"
            ),
            Plants(
                name = "Lidah Buaya",
                desc = lbuayaDesc,
                image = R.drawable.lidahbuaya,
                category = "Dedaunan",
                advantages = lbuayaAdv,
                latinName = "Aloe vera",
                usage = "Dibuat sampo, dibuat makanan"
            ),
            Plants(
                name = "Daun Seledri",
                desc = seledriDesc,
                image = R.drawable.daunseledri,
                category = "Dedaunan",
                advantages = seledriAdv,
                latinName = "Apium graveolens",
                usage = "Direbus, dicampur makanan"
            )
        )
    }

}
