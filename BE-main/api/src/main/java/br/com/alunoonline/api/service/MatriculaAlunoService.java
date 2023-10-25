package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {
    @Autowired
    MatriculaAlunoRepository repository;

    public void create(MatriculaAluno matriculaAluno) {
        matriculaAluno.setStatus("MATRICULADO");
        repository.save(matriculaAluno);

        //matriculaAluno.setNota1(null);
        //matriculaAluno.setNota2(null);
        //ou tratamento de exceção para menor custo processual

    }
}
