package com.example.centsoftrecipelist.ui.recipe_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.centsoftrecipelist.R

class RecipeListFragment : Fragment() {

   companion object {
      fun newInstance() = RecipeListFragment()
   }

   private lateinit var viewModel: RecipeListViewModel

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {
      return inflater.inflate(R.layout.fragment_recipe_list, container, false)
   }

   override fun onActivityCreated(savedInstanceState: Bundle?) {
      super.onActivityCreated(savedInstanceState)
      viewModel = ViewModelProvider(this).get(RecipeListViewModel::class.java)
      // TODO: Use the ViewModel
   }

}