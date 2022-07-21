package br.com.impacta.bananasplit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.impacta.bananasplit.databinding.FragmentPrimeiroBinding


class PrimeiroFragment : Fragment() {

    private var _binding: FragmentPrimeiroBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPrimeiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            var action = PrimeiroFragmentDirections.actionPrimeiroFragmentToSegundoFragment()
            findNavController().navigate(action)
        }
    }

}