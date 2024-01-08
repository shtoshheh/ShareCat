package by.bsuir.tatianakazimirovich.myapplication

import android.annotation.SuppressLint
import android.app.Notification.Action
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.room.util.getColumnIndex

class HomeScreen {

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "NotConstructor")
    @Composable
    fun HomeScreen(
        //items: List<Cat>,
        onClick: () -> Unit
    ) {
        Scaffold(
            topBar = {
                TopAppBar(title = {
                    Text(
                        text = stringResource(R.string.name_app),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(100.dp)
                    )
                },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(R.color.light_green)),
                    actions = {
                        IconButton(onClick = { onClick() }) {
                            Icon(painterResource(R.drawable.info_icon), contentDescription = "")
                        }
                    })
            }, floatingActionButton = {
                FloatingActionButton(onClick = { }) {
                }
            }
        ) {
            /*LazyColumn() {
                itemsIndexed(items) { index, item ->
                    CatItem(cat = item, onRemove = { *//*TODO*//* })
                }
            }*/
        }
    }

    @Composable
    fun CatItem(
        cat: Cat,
        onRemove: () -> Unit,
        modifier: Modifier = Modifier,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = cat.name,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
            Text(text = stringResource(R.string.cat_age) + cat.age)
            Text(text = stringResource(R.string.cat_cut_level) + cat.cuteness_level)
            Text(text = stringResource(R.string.cat_color) + cat.color)
        }
    }
}