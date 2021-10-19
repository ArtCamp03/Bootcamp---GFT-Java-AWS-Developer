package com.ArturLabs.SpringwebMVC.repository;

import java.util.List;
import java.util.ArrayList;

import com.ArturLabs.SpringwebMVC.model.Jedi;
import org.springframework.stereotype.Repository;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Lucke","Skywalker"));
    }

    public List<Jedi> getAllJedi(){
        return this.jedi;
    }

    public void add(final Jedi jedi){
        this.jedi.add(jedi);
    }
}
