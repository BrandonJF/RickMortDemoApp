package com.digitalmischief.rickandmortyapp

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.digitalmischief.rickandmortyapp.databinding.FragmentCharacterListBinding
import com.digitalmischief.rickandmortyapp.viewModels.CharacterListViewModel


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CharacterListFragment : Fragment() {

    lateinit var  rootView: View
    lateinit var viewModel: CharacterListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProviders.of(this).get(CharacterListViewModel::class.java)
        val binding: FragmentCharacterListBinding = FragmentCharacterListBinding.inflate(inflater, container, false)
        rootView = binding.root
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSubscriptions()


    }

    fun setupSubscriptions(){
        viewModel.characterListLiveData.observe(this, Observer { it ->

        })
    }



    companion object {
        @JvmStatic
        fun newInstance() = CharacterListFragment()
    }
}
