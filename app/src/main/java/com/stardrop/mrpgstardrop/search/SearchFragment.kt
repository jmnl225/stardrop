package com.stardrop.mrpgstardrop.search

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.stardrop.mrpgstardrop.MainActivity
import com.stardrop.mrpgstardrop.R

class SearchFragment : Fragment() {

    /*
    companion object{
        fun newInstance() : SearchFragment = newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.search_fragment_layout, container, false)
    }
}