package com.khusnia.projectenam

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity () {

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedActivity = getIntent()

        if (intentThatStartedActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partName = intentThatStartedActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            tv_item_name.text = partName
            tv_item_id.text = partId
        }
    }
}