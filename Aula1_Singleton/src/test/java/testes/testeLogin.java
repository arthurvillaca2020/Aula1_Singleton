package testes;

import org.example.LoginBanco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeLogin {

        @Test
        public void deveRetornarServidor() {
            LoginBanco loginBanco = LoginBanco.getInstance();
            loginBanco.setServidor("192.168.1.101");
            assertEquals("192.168.1.102", loginBanco.getInstance().getServidor());
        }


}
