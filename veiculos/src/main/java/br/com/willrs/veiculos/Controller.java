package br.com.willrs.veiculos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import  br.com.willrs.veiculos.entity.Veiculo;

@RestController
public class Controller {

    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo){

        return veiculo;

    }

    @GetMapping
    public List<Veiculo> listar(){

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo());
        return veiculos;

    }

    @GetMapping(value="{placa}")
    public Veiculo pegar( @PathVariable String placa ){


        return new Veiculo();

    }
    
}
