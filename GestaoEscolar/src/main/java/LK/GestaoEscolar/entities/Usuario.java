package LK.GestaoEscolar.entities;

import LK.GestaoEscolar.enums.Perfil;

public abstract class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;

    private Perfil perfil;
}
