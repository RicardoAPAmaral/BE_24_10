package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository repository;

    public Aluno create (Aluno aluno){
       return repository.save(aluno);
    }
    public List<Aluno> findAll(){
       return repository.findAll();
    }
    public Optional<Aluno> findById(Long id){
        return repository.findById(id);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
