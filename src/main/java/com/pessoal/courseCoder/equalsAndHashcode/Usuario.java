package com.pessoal.courseCoder.equalsAndHashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Usuario {

    public String name;
    public String email;

    public Usuario(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Usuario() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario))
            return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getName(), usuario.getName()) &&
                Objects.equals(getEmail(), usuario.getEmail());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getEmail());
    }
}
