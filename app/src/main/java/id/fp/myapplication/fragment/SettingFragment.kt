package id.fp.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.fp.myapplication.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {

    private var _settingFragment: FragmentSettingBinding? = null
    private val binding get() = _settingFragment as FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _settingFragment = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }
}