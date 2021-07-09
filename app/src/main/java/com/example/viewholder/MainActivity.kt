package com.example.viewholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumber: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvNumber = findViewById(R.id.rvNumber)
        rvNumber.layoutManager = LinearLayoutManager(baseContext)
        val numbersAdapter = NumberRecycleviewAdapter(fibonacci(100))
        rvNumber.adapter = numbersAdapter

    }

    fun fibonacci(num: Int): List<BigInteger> {
        var result = MutableList<BigInteger>(num, { BigInteger.ZERO })
        var num1 = BigInteger.ZERO
        var num2 = BigInteger.ONE
        result[0] = num1
        result[1] = num2
        for (x in 1..num) {
            val sum= num1 + num2
                    num1 = num2
            num2 = sum
            result[x - 1] = num1
        }
        return result
    }


}







