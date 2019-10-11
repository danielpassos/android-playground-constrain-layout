package me.passos.android.playground.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_collapsing_motion_layout.*
import kotlinx.android.synthetic.main.activity_collapsing_traditional.recyclerview

class CollapsingToolbarActivity : AppCompatActivity() {

    private val items = (1..20).map { "item $it" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_motion_layout)
//        setContentView(R.layout.activity_collapsing_traditional)

        back.setOnClickListener {
            finish()
        }

        recyclerview.apply {
            adapter = ItemsAdapter(items)
            layoutManager = LinearLayoutManager(this@CollapsingToolbarActivity,
                    RecyclerView.VERTICAL, false)
        }
    }

}