package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Addresses {
    private static final List<String> addressList = List.of(
            "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
            "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
            "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
            "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
            "São Paulo", "Sergipe", "Tocantins"
    );

    public static String randomAddress() {
        Random random = new Random();
        int randomIndex = random.nextInt(addressList.size());

        return addressList.get(randomIndex);
    }

}
