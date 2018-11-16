package br.com.rrlabs.apps.databindingproject.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import br.com.rrlabs.apps.databindingproject.utils.bindable
import com.android.databinding.library.baseAdapters.BR

class Game(
     val name: String,
     val launchYear: Int,
     val imageUrl: String,
     rating: Int
) : BaseObservable() {
    val isClassic = launchYear < 2000

    @get:Bindable
    var rating by bindable(rating, BR.rating)
}