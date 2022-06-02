package main.java.br.com.letscode.users.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String nome;
    private String email;
    private String cpf;
    private String cep;
}