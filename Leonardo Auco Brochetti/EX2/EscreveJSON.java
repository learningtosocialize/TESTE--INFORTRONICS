package EX2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class EscreveJSON {
    public static void main(String[] args) throws IOException {
        
        Usuario usuario1 = new Usuario();
        usuario1.setCpf("11122233344");
        usuario1.setLogin("adilson");
        usuario1.setSenha("202050");
        usuario1.setNome("Adilson Mendes");

        Usuario usuario2 = new Usuario();
        usuario2.setCpf("55566677788");
        usuario2.setLogin("natalino");
        usuario2.setSenha("202053");
        usuario2.setNome("Natalino Silva");

        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);


        String jsonUser = new Gson().toJson(usuarios);
        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter("C:\\Users\\leona\\Desktop\\Leonardo Auco Brochetti\\EX2");
        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();
    }

}