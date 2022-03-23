package jp.techacademy.yuta.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var operator = intent.getIntExtra("operator",0)
        var num1 = intent.getDoubleExtra("num1", 0.0)
        var num2 = intent.getDoubleExtra("num2", 0.0)
        var result = 0.0;

        when(operator) {
            1 -> result = num1 + num2
            2 -> result = num1 - num2
            3 -> result = num1 * num2
            4 -> result = num1 / num2
        }

        tv_result.text = result.toString()
    }
}