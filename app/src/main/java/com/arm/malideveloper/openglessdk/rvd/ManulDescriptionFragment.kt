package com.arm.malideveloper.openglessdk.rvd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.arm.malideveloper.openglessdk.rvd.databinding.FragmentManulDescriptionBinding
import com.bumptech.glide.Glide


class ManulDescriptionFragment : Fragment(R.layout.fragment_manul_description) {
    val args : ManulDescriptionFragmentArgs by navArgs()



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val manul = args.manul
        var bind = FragmentManulDescriptionBinding.bind(view)
        bind.descr.text=manul.descr
        Glide.with(bind.image.context).load(manul.image).into(bind.image)
        bind.name.text=manul.name

        bind.buttonGoBack.setOnClickListener { findNavController().popBackStack() }
    }


}