package devandroid.leof.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import devandroid.leof.listadetarefascompose.R
import devandroid.leof.listadetarefascompose.itemlista.TarefaItem
import devandroid.leof.listadetarefascompose.model.Tarefas
import devandroid.leof.listadetarefascompose.ui.theme.Black
import devandroid.leof.listadetarefascompose.ui.theme.Green
import devandroid.leof.listadetarefascompose.ui.theme.White

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
){


    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Green,
                 title = {
                    Text(
                        text = "Lista de Tarefas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = White
                    )
                }
            )
        },
        backgroundColor = Black,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("salvarTarefa")
                },
                backgroundColor = Green
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_add),
                    contentDescription = "Icone de salvar tarefa!!!"
                )
            }
        }
    ) {

        val listaTarefas: MutableList<Tarefas> = mutableListOf(
            Tarefas(
                tarefa = "Jogar futebol",
                descricao = "sdjsdjskdskj",
                prioridade = 0
            ),

            Tarefas(
                tarefa = "Ir ao cinema",
                descricao = "sdjsdjskdskj",
                prioridade = 1
            ),

            Tarefas(
                tarefa = "Ir a faculdade",
                descricao = "sdjsdjskdskj",
                prioridade = 2
            ),

            Tarefas(
                tarefa = "Prova",
                descricao = "sdjsdjskdskj",
                prioridade = 3
            )
        )
        
        LazyColumn{
            itemsIndexed(listaTarefas){position, _ ->
                TarefaItem(position, listaTarefas)
            }
        }
    }
}


