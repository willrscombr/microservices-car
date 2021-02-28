package br.com.willrs.veiculos.entity.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

import br.com.willrs.veiculos.entity.Veiculo;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CadastrarVeiculoRequest {


    @NonNull @NotBlank private String placa;
    @NonNull @NotBlank private String chassi;
    @NonNull @NotBlank private String renavam;
    @NonNull @NotBlank private String uf;


    public Veiculo toModel(){
        return new Veiculo(this.placa, this.chassi, this.renavam, this.uf);
    }

    
}
