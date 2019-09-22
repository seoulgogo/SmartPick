package com.seoulapp.startpick.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.seoulapp.startpick.R
import kotlinx.android.synthetic.main.activity_write.*

class WriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        /* 뒤로가기 */
        back_arrow.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }

        /* 근무지역 필터 클릭시 화면 전환 */
        workarea.setOnClickListener {
            var intent = Intent(this, WorkArea::class.java)
            startActivity(intent)
        }
    }
}
