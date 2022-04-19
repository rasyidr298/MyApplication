package id.fp.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.fp.myapplication.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private var _historyFragment: FragmentHistoryBinding? = null
    private val binding get() = _historyFragment as FragmentHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _historyFragment = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }
}