package br.com.impacta.bananasplit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import br.com.impacta.bananasplit.databinding.FragmentTerceiroBinding


class TerceiroFragment : Fragment() {

    private var _binding: FragmentTerceiroBinding? = null
    private val binding get() = _binding!!
    private val args: TerceiroFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTerceiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nome = args.nomeUsuario
        binding.textView3.text = "Olá $nome, seja muito bem vindo"
    }

}