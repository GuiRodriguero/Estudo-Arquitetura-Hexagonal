package br.com.pegasus.aplicacao.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @PostMapping
    public void cadastrarAluno() {
        System.out.println("Cadastrando aluno...");
    }
}
