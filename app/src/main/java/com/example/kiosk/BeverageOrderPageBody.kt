package com.example.kiosk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class BeverageOrderPageBody: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view : View =  inflater.inflate(R.layout.categorybody,container,false)
        initEvent(view)
        return view
    }
    fun initEvent(view: View){
        var newBeverageBtn: Button? = view.findViewById<Button>(R.id.newBeverage)
        newBeverageBtn!!.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.beverageSpace,NewMenuListBody()).commit()
        }
        var coffeeBtn:Button? = view.findViewById<Button>(R.id.coffee)
        coffeeBtn!!.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.beverageSpace,CoffeeListBody()).commit()
        }
        var iceFlakeBtn:Button? = view.findViewById<Button>(R.id.iceFlake)
        iceFlakeBtn!!.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.beverageSpace,NewMenuListBody()).commit()
        }
        var cakeBtn:Button? = view.findViewById<Button>(R.id.cake)
        cakeBtn!!.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.beverageSpace,NewMenuListBody()).commit()
        }
    }
}
