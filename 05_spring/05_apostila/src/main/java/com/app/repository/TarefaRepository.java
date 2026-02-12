package com.app.repository;

import org.jspecify.annotations.Nullable;

import com.app.models.Tarefa;

public interface TarefaRepository {

    void save(Tarefa tarefa);

    @Nullable
    Object findAll();

}
