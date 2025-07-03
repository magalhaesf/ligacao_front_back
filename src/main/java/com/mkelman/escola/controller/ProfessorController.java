package com.mkelman.escola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkelman.escola.dto.ProfessorDto;
import com.mkelman.escola.modelo.Professor;

@RestController // Transforma a nossa classe em um controller antigamente chamado bean
@RequestMapping(value = "/professor")//Mapeando a url, navegador chama pelo valor
public class ProfessorController {

    @GetMapping( value = "/")//Mapeamento do método imprimir
    public void imprimir() {//void não retorna nada
        System.out.println("Chamou o metodo imprimir");

    }

    @GetMapping( value = "/ola")
    public String ola() {//Adicionado retorno com string - Tipo texto // Nao quer dizer html
        return"<h1>Fernanda<h1>";//return -> Devolve o retorno para quem chamou

    }

    @GetMapping (value ="/insert")
    public String insert(@RequestBody ProfessorDto professorDto) {

        Professor professor = professorDto.novoProfessor();
        System.out.println(professor.toString());

        return"<h1>Fernanda linda e maravilhosa <3 <h1>";
    }

    
    
}
