package by.bsuir.tatianakazimirovich.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutScreen {
    companion object{
        val aboutMeStrings = listOf(
            R.string.dev_name,R.string.dev_age, R.string.dev_status
        )
        val aboutAppStrings = listOf(
            R.string.app_name, R.string.year
        )
    }

    @Composable
     fun AboutScreenFun(){
        Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(R.drawable.me),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(20.dp)
                    .size(250.dp)
                    .clip(RoundedCornerShape(35.dp))
            )
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp)
            ){
                Column(){
                    Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)){
                        Text(
                            text = stringResource(R.string.info_dev), fontWeight = FontWeight.ExtraBold, fontSize = 15.sp, textAlign = TextAlign.Center
                        )
                    }
                    Column(  modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, bottom = 15.dp, start = 15.dp)){
                        for(fact in aboutMeStrings) Text(text = stringResource(id =fact))
                    }
                }
            }
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp)
            ){

                Row(verticalAlignment = Alignment.CenterVertically){
                    Image(painter = painterResource(R.drawable.icon),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(20.dp)
                            .size(100.dp)
                            .clip(RoundedCornerShape(35.dp))
                    )
                    Column( horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = stringResource(R.string.info_app),
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 15.sp

                        )
                        Column( modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp, start = 15.dp)
                        ) {

                            for (fact in aboutAppStrings) Text(text = stringResource(id = fact))
                        }
                    }
                }


            }
        }
    }
}
