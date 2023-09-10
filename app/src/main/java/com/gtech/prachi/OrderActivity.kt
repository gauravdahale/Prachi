package com.gtech.prachi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class OrderActivity : AppCompatActivity() {
    // COFFEE =20
// TEA =10
// MILK =30
//    BISCUIT =5
//    CHOCOLATE =10
//    CREAM =15
    lateinit var mRadioGroup: RadioGroup
    lateinit var mTotalAmountView: TextView
    lateinit var mFab: FloatingActionButton
    lateinit var mBiscuit: CheckBox
    lateinit var mChocolate: CheckBox
    lateinit var mCream: CheckBox
    val mBiscuitPrice = 5
    val mChocolatePrice = 10
    var mCreamPrice = 0
    var mTotal = 0
    var productCost = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        mCreamPrice = 15
        mRadioGroup = findViewById<RadioGroup>(R.id.radio_group)
        mFab = findViewById<FloatingActionButton>(R.id.fab)
        mTotalAmountView = findViewById(R.id.total_amount)

        mBiscuit = findViewById(R.id.biscuit)
        mChocolate = findViewById(R.id.chocolate)
        mCream = findViewById(R.id.extra_cream)

        mTotalAmountView.text = productCost.toString()
        mBiscuit.setOnClickListener {
            if (this.mTotal != 0) {
                if (mBiscuit.isChecked) {
                    mTotal = mTotal + mBiscuitPrice
                    mTotalAmountView.text = mTotal.toString()
                }
                if (!mBiscuit.isChecked) {
                    mTotal = mTotal - mBiscuitPrice
                    mTotalAmountView.text = mTotal.toString()
                }
            } else Toast.makeText(
                this,
                "Please select coffee, tea or milk first!",
                Toast.LENGTH_SHORT
            ).show()

        }

        mRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.coffee -> {
                    this.productCost = 20
                    mTotal = mTotal + productCost
//                    mTotal += productCost it is same as above
//                    Toast.makeText(this, "Coffee = ${this.productCost}", Toast.LENGTH_SHORT).show()
                    mTotalAmountView.text = mTotal.toString()
                }
                R.id.tea -> {
                    this.productCost = 10
//                    Toast.makeText(this, "Tea selected ${this.productCost}", Toast.LENGTH_SHORT).show()
                    mTotal = productCost
                    mTotalAmountView.text = productCost.toString()

                }
                R.id.milk -> {
                    this.productCost = 30
//                    Toast.makeText(this, "Milk selected ${this.productCost}", Toast.LENGTH_SHORT).show()
                    mTotal = productCost
                    mTotalAmountView.text = mTotal.toString()
                }

            }

        }

        mFab.setOnClickListener {
            val intent = Intent(this, OrderConfirmActivity::class.java)
intent.putExtra("total_amount",mTotal.toString())
            startActivity(intent)
        }
    }
}