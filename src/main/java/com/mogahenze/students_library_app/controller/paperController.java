package com.mogahenze.students_library_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mogahenze.students_library_app.entity.Paper;
import com.mogahenze.students_library_app.service.PaperService;

@RestController
public class paperController {

    @Autowired
    private PaperService paperService;

    @GetMapping("/test")
    public String testApp(){ return "App Is Running";}

    @PostMapping("/addPaper")
    public Paper addPaper(@RequestBody Paper paper){
        return  paperService.savePaper(paper);
    }

    @PostMapping("/addPapers")
    public Iterable<Paper> addPaper(@RequestBody Iterable<Paper> papers)
        {return  paperService.savePapers(papers);}
    //  JSON payLoad {"name": "","year": "","semi": ""}


    @GetMapping("/listPapers")
    public Iterable<Paper> listPapers ()
        {return  paperService.getPapers();}

    @GetMapping("/list/paper/by/id/{id}")
    public Paper listPaperById (@PathVariable int id)
        {return  paperService.getPaperById(id);}

    @GetMapping("/list/paper/by/name/{name}")
    public Paper listPaperByName (@PathVariable String name)
        {return  paperService.getPaperByName(name);}


    @PutMapping ("/update")
    public Paper updatePaper(@RequestBody Paper paper)
        {return  paperService.updatePaper(paper);}
        //  JSON payLoad {"id":,"name": "","year": "","semi": ""}

    @DeleteMapping("/delete/{id}")
    public String deletePaper(@PathVariable int id)
        {return paperService.deletePaper(id);}
        //  JSON payLoad {"id":,"name": "","year": "","semi": ""}
}
