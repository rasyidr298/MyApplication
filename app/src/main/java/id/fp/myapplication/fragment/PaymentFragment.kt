package id.fp.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.fp.myapplication.databinding.FragmentPaymentBinding

class PaymentFragment : Fragment() {

    private var _paymentFragment: FragmentPaymentBinding? = null
    private val binding get() = _paymentFragment as FragmentPaymentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _paymentFragment = FragmentPaymentBinding.inflate(inflater, container, false)
        return binding.root
    }
}