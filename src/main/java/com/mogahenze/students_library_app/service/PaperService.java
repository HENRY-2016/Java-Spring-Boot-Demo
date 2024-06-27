package com.mogahenze.students_library_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mogahenze.students_library_app.entity.Paper;
import com.mogahenze.students_library_app.repository.PaperRepository;

@Service
public class PaperService {
    @Autowired
    private PaperRepository paperRepository;

    public Paper savePaper (Paper paper){
        return  paperRepository.save(paper);
    }

    // save a list
    public Iterable<Paper> savePapers (Iterable<Paper> paper){
        return paperRepository.saveAll(paper);
    }
    public Iterable<Paper>  getPapers (){ 
        return  paperRepository.findAll();
    }

    public Paper getPaperById (int id){ 
        return  paperRepository.findById(id).orElse(null);
    }

    public Paper getPaperByName (String name){ 
        return  paperRepository.findByName(name);
    }

    // delete 
    public String deletePaper (int id){
        paperRepository.deleteById(id);
        return  "Paper Deleted Very Well"+id;
    }

    public Paper updatePaper(Paper paper){
        Paper existingPaper = paperRepository.findById(paper.getId()).orElse(null);
        existingPaper.setName(paper.getName());
        existingPaper.setYear(paper.getYear());
        existingPaper.setSemi(paper.getSemi());
        return paperRepository.save(existingPaper);
    }
    
}
