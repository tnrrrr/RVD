package com.arm.malideveloper.openglessdk.rvd


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.arm.malideveloper.openglessdk.rvd.databinding.FragmentManulListBinding


class ManulListFragment : Fragment(R.layout.fragment_manul_list) {

    fun showDescr(manul:Manul){
        val direction = ManulListFragmentDirections.actionManulListFragmentToManulDescriptionFragment2(manul)
        findNavController().navigate(direction)
    }

    val adapter = ManulAdapter{
        showDescr(it)
    }

    private val manulsList = listOf(
        Manul("Чериш",R.drawable.manul0,"Чериш - вірний тавариш кожного мандрівника, може носити з собою казанок вод"),
        Manul("Ратік",R.drawable.manul1,"Ратік - захисник вогнища і трішки на агресівічах, постоїть за своїх"),
        Manul("Міщурчик",R.drawable.manul2,"Міщурчик - миле створіннячко, скільки не годуй буде негодувати, гиги))"),
        Manul("Велик",R.drawable.manul3,"Велик - анчик, довагий паравозик хутра, а ще який теплий, ммм))) оаоаоао . тільки притуліться до нього"),
        Manul("Діанон",R.drawable.manul4,"Діанон - дсть знати про себе з перших хвилин вашого знайомства, у нього запальний характер"),
        Manul("Пеприлик",R.drawable.manul5,"Пеприлик - сич настоящий, весь час буде сичитаи як не на вас, так на ворон, цим звуком відганятиме від себе в моменти , коли вважатиме за потрібне, тобто завше"),
        Manul("Іденогу",R.drawable.manul6,"Іденогу - атакуючий манул, вичікує в засітці поки жертва не наблизиться, і він на неї не накинеться та порве на клапті"),
        Manul("Вайшау",R.drawable.manul7,"Вайшау - та якийсь бєшєний трохи, якшо чесно, йому краще не кажіть, бо він це і так знає"),
        Manul("QlqMXM",R.drawable.manul8,"Легенда, сніжний король манулів і лідер клану та повелитель стихії зими - QLQMXM. Дасть мудру пораду кожному манулу, не дивлячись на йог опоходження."),
        Manul("Голодиш",R.drawable.manul9,"Голдиш - родом із Запоріжжя, тому не чекайте від нього пощади, попри його милий і безобідний вигляд"),
        Manul("Перепен",R.drawable.manul10,"Перепен - уоособлення манулячого смуточку(( *плак-плак, погладьте його по голові і дайте кусочок соковитого бівштекс"),
        Manul("Вишкіл",R.drawable.manul11,"Вишкіл - та який каранчунч, але приховує монструозну силу, силу лягти на пузо і полежати"),

        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var bind= FragmentManulListBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        bind.apply{
            rcView.layoutManager=LinearLayoutManager(context)
            rcView.adapter=adapter
        }
        adapter.addManuls(manulsList)


    }


}