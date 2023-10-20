package com.example.mad_practical_10_22172012004

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter

class PersonAdapter(context:Context,val array: ArrayList<PersonClass>):ArrayAdapter<PersonClass>(context,0,array)
{
    override fun getView(position: Int, convertView: View?,
}