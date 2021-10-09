package com.stardrop.mrpgstardrop

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.stardrop.mrpgstardrop.friend.FriendFragment
import com.stardrop.mrpgstardrop.home.HomeFragment
import com.stardrop.mrpgstardrop.more.MoreFragment
import com.stardrop.mrpgstardrop.search.SearchFragment
import java.util.ArrayList

class MainAdapter(fm:FragmentActivity) : FragmentStateAdapter(fm) {

    /*
    var fragments : ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
        notifyItemInserted(fragments.size-1)
    }

    fun removeFragment() {
        fragments.removeLast()
        notifyItemRemoved(fragments.size)
    }
     */

    //private var fragments = arrayOf( HomeFragment.newInstance(),  SearchFragment.newInstance(), FriendFragment.newInstance(), MoreFragment.newInstance() )

    override fun createFragment(position: Int): Fragment {
        //return fragments[position]

        return when(position){
            1 ->  SearchFragment()
            2 ->  FriendFragment()
            3 ->  MoreFragment()
            else ->  HomeFragment()
        }

    }

    override fun getItemCount(): Int {
        return 4
    }

}