package com.alexocampo.model;




import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "individuo")
public class User {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;

    private String nombre;
    private String apellido;
    private String correo;
    private String Telefono;
    private String edad;
}
