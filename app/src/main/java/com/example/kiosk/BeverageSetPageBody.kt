package com.example.kiosk

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class BeverageSetPageBody: Fragment() {
    var beverageCount:Int = 1
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view : View =  inflater.inflate(R.layout.beveragesetbody,container,false)
        initEvent(view)
        return view
    }

    fun initEvent(view : View){
        var beverageCountView:TextView? = view.findViewById<TextView>(R.id.beverageCount)
        beverageCountView!!.setText(beverageCount.toString())

        var payBtn: Button? = view.findViewById<Button>(R.id.payBtn)
        payBtn!!.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.mainlayout,PayPageBody()).commit()
        }

        var minusBtn: Button? = view.findViewById<Button>(R.id.minusBtn)
        minusBtn!!.setOnClickListener {
            if (beverageCount == 1) {
                showPopupView()
            } else {
                beverageCount -= 1
                beverageCountView!!.setText(beverageCount.toString())
            }
        }
        var plusBtn:Button? = view.findViewById<Button>(R.id.plusBtn)
        plusBtn!!.setOnClickListener{
            beverageCount += 1
            beverageCountView!!.setText(beverageCount.toString())
        }
    }

    fun showPopupView() {
        var popupView = getLayoutInflater().inflate(R.layout.popupwindow, null);
        var alertdialog = AlertDialog.Builder(context).create()
        var popupBackBtn = popupView.findViewById<Button>(R.id.backBtn)
        popupBackBtn!!.setOnClickListener {
            alertdialog.hide()
        }
        alertdialog.setView(popupView)
        alertdialog.show()
        alertdialog.window!!.setLayout(600,400)
    }
}
