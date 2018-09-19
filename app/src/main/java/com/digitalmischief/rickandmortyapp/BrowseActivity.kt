package com.digitalmischief.rickandmortyapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_browse.*

class BrowseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_browse)
        supportFragmentManager.beginTransaction()
                .add(cl_container.id, CharacterListFragment.newInstance()).commit()
    }
}
