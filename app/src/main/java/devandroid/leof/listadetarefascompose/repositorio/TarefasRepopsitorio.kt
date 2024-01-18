package devandroid.leof.listadetarefascompose.repositorio

import devandroid.leof.listadetarefascompose.datasource.DataSource

class TarefasRepopsitorio {

    private val dataSource = DataSource()
    fun salvarTarefa(tarefa: String, descricao: String, prioridade: Int){
        dataSource.salvarTarefa(tarefa, descricao, prioridade)
    }

}