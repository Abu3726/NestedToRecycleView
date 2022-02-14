package com.conamobile.nestedtorecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.nestedtorecycleview.adapter.MemberAdapter
import com.conamobile.nestedtorecycleview.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView)
        recyclerView?.isScrollContainer = false
        recyclerView?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30){
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        }
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        recyclerView!!.adapter = adapter
    }
}