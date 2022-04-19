package id.fp.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.fp.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _homeFragment: FragmentHomeBinding? = null
    private val binding get() = _homeFragment as FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _homeFragment = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
}