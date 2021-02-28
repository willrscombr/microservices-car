package br.com.willrs.veiculos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.willrs.veiculos.entity.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    public Optional<Veiculo> findByPlaca(String placa);
    
}
