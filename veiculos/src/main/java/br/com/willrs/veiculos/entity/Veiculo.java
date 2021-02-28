package br.com.willrs.veiculos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo {

     @Id
     @GeneratedValue
     private Long id;
     @NonNull private String placa;
     @NonNull private String chassi;
     @NonNull private String renavam;
     @NonNull private String uf;

    
}
