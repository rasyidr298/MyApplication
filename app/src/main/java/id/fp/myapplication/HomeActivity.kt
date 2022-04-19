package id.fp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import id.fp.myapplication.databinding.ActivityHomeBinding
import id.fp.myapplication.fragment.HistoryFragment
import id.fp.myapplication.fragment.HomeFragment
import id.fp.myapplication.fragment.PaymentFragment
import id.fp.myapplication.fragment.SettingFragment

class HomeActivity : AppCompatActivity() {

    private val binding: ActivityHomeBinding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        navigationChange(HomeFragment())

        binding.bottomNavigationContainer.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    navigationChange(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.menu_payment -> {
                    navigationChange(PaymentFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.menu_history -> {
                    navigationChange(HistoryFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.menu_setting -> {
                    navigationChange(SettingFragment())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun navigationChange(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameContainer, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }
}