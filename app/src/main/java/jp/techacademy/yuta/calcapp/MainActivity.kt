package jp.techacademy.yuta.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_plus.setOnClickListener(this)
        bt_minus.setOnClickListener(this)
        bt_mul.setOnClickListener(this)
        bt_div.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var operator = 0;
        when(v.id){
            R.id.bt_plus -> {operator = 1}
            R.id.bt_minus -> {operator = 2}
            R.id.bt_mul -> {operator = 3}
            R.id.bt_div -> {operator = 4}
        }

        if(operator != 0 && editText1.text.isNotEmpty() && editText2.text.isNotEmpty()) {
            Log.d("calc", "isNotEmpty")
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("operator", operator)
            intent.putExtra("num1", editText1.text.toString().toDouble())
            intent.putExtra("num2", editText2.text.toString().toDouble())
            startActivity(intent)
        } else {
            Log.d("calc", "Empty")
            textView.text = "値を入力してください"
        }
    }
}