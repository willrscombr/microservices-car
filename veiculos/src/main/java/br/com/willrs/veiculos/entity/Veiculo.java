package br.com.willrs.veiculos.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Veiculo {

      
     private String id;
     @NonNull private String placa;
     @NonNull private String chassi;
     @NonNull private String renavam;
     @NonNull private String uf;



    
}
