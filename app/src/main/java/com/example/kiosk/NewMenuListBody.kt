package com.example.kiosk

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class NewMenuListBody: Fragment() {
    var beverageList = arrayOf<Int>(R.id.baverage2,R.id.baverage3,R.id.baverage4,R.id.baverage5,R.id.baverage6)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view : View =  inflater.inflate(R.layout.newmenubody,container,false)
        initEvent(view)
        return view
    }
    fun initEvent(view: View){
        for (index in 0 until beverageList.count()){
            var beverageBtn: Button? = view.findViewById<Button>(beverageList[index])
            beverageBtn!!.setOnClickListener{
                var intent = Intent(context,BeverageSetPage::class.java)
                startActivity(intent)
            }
        }
    }
}