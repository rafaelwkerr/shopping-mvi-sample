package shopping.kerrlabs.com.shopping.view.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import shopping.kerrlabs.com.shopping.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configureView()
    }

    private fun configureView() {
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
    }

}