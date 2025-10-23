package barriga.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    @DisplayName("Teste de criação do usuário | Sucesso")
    public void deveCriarUsuarioValido() {
        Usuario usuario = new Usuario(
                1L,
                "Usuario valido",
                "user@gmail.com",
                "123456");

        Assertions.assertEquals(1L, usuario.getId());
        Assertions.assertEquals("Usuario valido", usuario.getNome());
        Assertions.assertEquals("user@gmail.com", usuario.getEmail());
        Assertions.assertEquals("123456", usuario.getSenha());
    }
}
