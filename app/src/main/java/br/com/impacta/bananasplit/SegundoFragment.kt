package br.com.impacta.bananasplit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.impacta.bananasplit.databinding.FragmentSegundoBinding


class SegundoFragment : Fragment() {

    private var _binding: FragmentSegundoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            var nome = binding.editTextTextPersonName.text.toString()
            var action = SegundoFragmentDirections.actionSegundoFragmentToTerceiroFragment(nome)
            findNavController().navigate(action)
        }
    }

}