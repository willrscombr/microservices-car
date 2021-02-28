package br.com.willrs.veiculos;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.willrs.veiculos.entity.Veiculo;
import br.com.willrs.veiculos.entity.request.CadastrarVeiculoRequest;

@RestController
public class Controller {

    @Autowired
    VeiculoService service;

    @PostMapping
    public Veiculo cadastrar(@RequestBody @Valid CadastrarVeiculoRequest request){

       Veiculo veiculo = service.salvar(request.toModel());
        
        return veiculo;

    }

    @GetMapping
    public List<Veiculo> listar(){

        List<Veiculo> veiculos = service.listar();
        
        return veiculos;

    }

    @GetMapping(value="{placa}")
    public Veiculo pegar( @PathVariable String placa ) throws Exception {
        Veiculo veiculo = service.buscarPorPlaca(placa);

        return veiculo;

    }
    
}
