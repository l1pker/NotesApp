
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NoteScreen(navController: NavHostController) {
    Scaffold (modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize().padding(8.dp),
                ){
                    Text(
                        text = "title",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 16.dp).fillMaxWidth(),
                        textAlign = TextAlign.Center,

                    )
                    Text(
                        text = "subtitle",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 12.dp),
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}