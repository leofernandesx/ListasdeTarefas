package devandroid.leof.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import devandroid.leof.listadetarefascompose.componentes.Botao
import devandroid.leof.listadetarefascompose.componentes.CaixaDeTexto
import devandroid.leof.listadetarefascompose.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SalvarTarefa(
    navController: NavController
) {

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Green,
                title = {
                    Text(text = "Salvar Tarefa",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = White
                    )
                }
            )
        }
    ) {

        var tituloTarefa by remember {
            mutableStateOf("")
        }

        var descricaoTarefa by remember {
            mutableStateOf("")
        }

        var semPrioridadeTarefa by remember {
            mutableStateOf(false)
        }

        var prioridadeBaixaTarefa by remember {
            mutableStateOf(false)
        }

        var prioridadeMediaTarefa by remember {
            mutableStateOf(false)
        }

        var prioridadeAltaTarefa by remember {
            mutableStateOf(false)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                ) {

                CaixaDeTexto(
                    value = tituloTarefa,
                    onValueChange = {
                      tituloTarefa = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 0.dp),
                    label = "Titulo Da Tarefa" ,
                    maxLines = 1,
                    keyBoardType = KeyboardType.Text
                )

            CaixaDeTexto(
                value = descricaoTarefa,
                onValueChange = {
                    descricaoTarefa = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(20.dp, 20.dp, 20.dp, 0.dp),
                label = "Descrição" ,
                maxLines = 5,
                keyBoardType = KeyboardType.Text
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Nivél de prioridade")
                RadioButton(
                    selected = prioridadeBaixaTarefa,
                    onClick = {
                            prioridadeBaixaTarefa = !prioridadeBaixaTarefa
                        },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_GREEN_DISABLED,
                        selectedColor = RADIO_BUTTON_GREEN_SELECTED
                    )
                    )

                RadioButton(
                    selected = prioridadeMediaTarefa,
                    onClick = {
                        prioridadeMediaTarefa = !prioridadeMediaTarefa
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_YELLOW_DISABLED,
                        selectedColor = RADIO_BUTTON_YELLOW_SELECTED
                    )
                )

                RadioButton(
                    selected = prioridadeAltaTarefa,
                    onClick = {
                        prioridadeAltaTarefa = !prioridadeAltaTarefa
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_RED_DISABLED,
                        selectedColor = RADIO_BUTTON_RED_SELECTED
                    )
                )
            }

            Botao(onClick = {

            },
                modifier = Modifier.fillMaxWidth().height(80.dp).padding(20.dp),
                texto = "Salvar"
            )
        }
    }

}