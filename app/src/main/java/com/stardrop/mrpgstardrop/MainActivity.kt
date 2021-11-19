package com.stardrop.mrpgstardrop

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.stardrop.mrpgstardrop.friend.FriendFragment
import com.stardrop.mrpgstardrop.home.HomeFragment
import com.stardrop.mrpgstardrop.more.MoreFragment
import com.stardrop.mrpgstardrop.search.SearchFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mainAdapter: MainAdapter
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout: TabLayout

    //private var icons_on = arrayOf(R.drawable.dice_on, R.drawable.search_on, R.drawable.freind_on ,  R.drawable.more_on )
    //private var icons_off = arrayOf(R.drawable.dice_off, R.drawable.search_off, R.drawable.freind_off ,  R.drawable.more_off )
    private var icon_selector = arrayOf(R.drawable.tab_dice_selector, R.drawable.tab_search_selector, R.drawable.tab_friend_selector ,  R.drawable.tab_more_selector )
    /*
    private var icons_on = arrayOf(AppCompatResources.getDrawable(this, R.drawable.dice_on), AppCompatResources.getDrawable(this, R.drawable.search_on),
        AppCompatResources.getDrawable(this, R.drawable.freind_on), AppCompatResources.getDrawable(this, R.drawable.more_on) )

    private var icons_off = arrayOf(AppCompatResources.getDrawable(this, R.drawable.dice_off), AppCompatResources.getDrawable(this, R.drawable.search_off),
        AppCompatResources.getDrawable(this, R.drawable.freind_off), AppCompatResources.getDrawable(this, R.drawable.more_off) )

     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        init()
    }

    private fun init(){
        Toast.makeText(this, "ddddddddddddddd",Toast.LENGTH_SHORT).show()
        mainAdapter = MainAdapter(this)
        //mainAdapter.addFragment(HomeFragment())
        //mainAdapter.addFragment(SearchFragment())
        //mainAdapter.addFragment(FriendFragment())
        //mainAdapter.addFragment(MoreFragment())

        tabLayout = findViewById(R.id.main_bottom_nav)
        viewPager = findViewById(R.id.main_viewpager2)

        //supportFragmentManager.beginTransaction().replace(R.id.fra)

        viewPager.adapter = mainAdapter
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter?.notifyDataSetChanged()


        createMenus()
        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.icon = AppCompatResources.getDrawable(this, icon_selector[position])
        }.attach()


    }


    private fun createMenus(){
        for (i in icon_selector.indices){
            //var newTab : TabLayout.Tab = TabLayout.Tab()
            //newTab.icon = AppCompatResources.getDrawable(this, icons_off[i])
            tabLayout.addTab(tabLayout.newTab().setIcon(icon_selector[i]))
        }

    }

}