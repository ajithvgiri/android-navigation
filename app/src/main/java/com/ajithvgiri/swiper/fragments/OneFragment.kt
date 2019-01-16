package com.ajithvgiri.swiper.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ajithvgiri.swiper.R
import com.ajithvgiri.swiper.utils.inTransaction
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewOne.setOnClickListener {
            activity!!.supportFragmentManager.inTransaction {
                add(R.id.fragment, TwoFragment())
            }
        }
    }
}
