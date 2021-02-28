package br.com.willrs.veiculos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.willrs.veiculos.entity.Veiculo;


@Component
public class VeiculoService {

    @Autowired
    VeiculoRepository repository;

    public Veiculo salvar(Veiculo veiculo){

        return repository.save(veiculo);
        
    }

	public List<Veiculo> listar() {
		return repository.findAll();
	}

	public Veiculo buscarPorPlaca(String placa) throws Exception {
		Optional<Veiculo> veiculo = repository.findByPlaca(placa);
        if(!veiculo.isPresent()){
            throw new Exception("Veículo não encontrado");
        }
        return veiculo.get();
	}
    
}
