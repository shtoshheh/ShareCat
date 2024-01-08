package by.bsuir.tatianakazimirovich.myapplication

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import java.util.UUID

data class Cat(
    val name: String,
    val age: Int,
    val cuteness_level: Float,
    val color: String
)

class HomeViewModel() : ViewModel() {

    val items: SnapshotStateList<Cat> = DefaultCats.toMutableStateList()

    fun onClickRemoveCat(cat: Cat) = items.remove(cat)

    private companion object {

        private val DefaultCats = listOf(
            Cat("Chomuske",15,0.15f,"gray"),
            Cat("Midnight",3,0.76f,"blue")
        )
    }
}