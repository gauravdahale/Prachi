package com.gtech.prachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Contact {
    var name: String? = null
    var number: String? = null

    constructor(inputName: String, inputNumber: String) {
        this.name = inputName
        this.number = inputNumber
    }
}

class ContactsActivity : AppCompatActivity() {

    lateinit var mRecyclerView: RecyclerView
    val mList = ArrayList<Contact>()
    lateinit var mContactsAdapter: ContactsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
//        var Prachi2 = Contact()
//Prachi2.name     ="Prachi"
//Prachi2.number     ="32432432"
        val Prachi = Contact("Prachi", "123432424")
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)
        mList.add(Prachi)




        mRecyclerView = findViewById(R.id.recyclerview)
        Toast.makeText(this, "${mList.size}", Toast.LENGTH_SHORT).show()
        mContactsAdapter = ContactsAdapter(mList)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = mContactsAdapter
    }
}