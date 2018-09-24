package me.passos.android.playground.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_collapsing_traditional.*

class CollapsingToolbarActivity : AppCompatActivity() {

    private val items = (1..20).map { "item $it" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_motion_layout)
//        setContentView(R.layout.activity_collapsing_traditional)

        recyclerview.apply {
            adapter = SimpleAdapter(items)
            layoutManager = LinearLayoutManager(this@CollapsingToolbarActivity,
                    RecyclerView.VERTICAL, false)
        }

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}