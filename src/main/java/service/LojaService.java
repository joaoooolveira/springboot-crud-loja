package service;

import java.util.List;
import model.LojaMuffato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LojaRepository;

@Service
public class LojaService {
    
    @Autowired
    private LojaRepository repository;
    
    public List<LojaMuffato> produtosList(){
        return repository.produtosList();
    }
}
