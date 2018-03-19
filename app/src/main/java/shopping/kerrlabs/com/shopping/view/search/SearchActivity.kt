package shopping.kerrlabs.com.shopping.view.search

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import shopping.kerrlabs.com.shopping.R

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configureView()
    }

    private fun configureView() {
        setContentView(R.layout.activity_search)
        setSupportActionBar(toolbar)
    }

}