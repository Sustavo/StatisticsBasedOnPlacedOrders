package generator;

import java.util.List;
import java.util.Random;

public class Names {
    private static final List<String> namesList = List.of(
            "Ana", "João", "Maria", "Matheus", "Carla", "Pedro", "Sofia", "Rafael", "Laura", "Bruno", "Isabella", "Lucas", "Beatriz",
            "Gabriel", "Camila", "Leonardo", "Juliana", "Felipe", "Luiza", "Thiago", "Letícia", "Gustavo", "Mariana", "André", "Clara", "Felícia",
            "Fernando", "Alice", "Guilherme", "Carolina", "Vinícius", "Helena", "Eduardo", "Larissa", "Rodrigo", "Natália", "José", "Amanda", "Diego",
            "Manuela", "Antônio", "Lívia", "Marcelo", "Bianca", "Vitor", "Valentina", "Cristiano", "Isadora", "Miguel", "Sophia", "Fernanda", "Arthur",
            "Vanessa", "Caio", "Aline", "Ricardo", "Julia", "César", "Fernando", "Viviane", "Feliciano", "Tatiana", "Luana", "Rafaela", "Henrique",
            "Emanuela", "Raul", "Carine", "Thales", "Gabriela", "Marina", "Leonel", "Rosa", "Débora", "Joaquim", "Regina", "Laís", "Ricardo", "Camille",
            "Natasha", "Renan", "Cláudia", "Carmen", "Isaac", "Lorena", "Tiago", "Mirella", "Giovanni", "Sabrina", "Cassiano", "Fátima", "Luísa", "Yasmin",
            "Ronaldo", "Elisa", "Hugo", "Ruth", "Fábio", "Leila", "Bernardo", "Marta", "Davi", "Elaine", "Olívia", "Vivian", "Renato", "Ingrid", "Loreno",
            "Luciana", "Raquel", "Cristina", "Talita", "Daniel", "Larisse", "Marcos", "Marcela", "Paulo", "Tatiane", "Larissa", "Cléo", "Rafael", "Valeska",
            "Pedro", "Sâmara", "Juliano", "Cecília", "Fernandes", "Giovanna", "Marconi", "Alícia", "Joana", "Jéssica", "Cleber", "Jenifer", "Emanuel", "Igor",
            "Nicole", "Clara", "Milena", "Matias", "Simone", "Caio", "Érica", "Roberto", "Priscila", "Luana", "Hélio", "Lucas", "Nathália", "Andressa", "Renan",
            "Fernanda", "Gustavo", "Ana Beatriz", "Gisele", "Eduardo", "Alana", "Bernardo", "Michele", "Luan", "Andréia", "Maicon", "Ester", "Arthur", "Adriana",
            "Ítalo", "Elisabete", "Samuel", "Elaine", "Rafael", "Márcia", "Marina", "Aline", "Hugo", "Suelen", "Paula", "Monique", "Leandro", "Alessandra",
            "Kaique", "Raíssa", "Vitória", "Ricardo", "Catarina", "Ronaldo", "Jéssica", "Diana", "Sandra", "Ícaro", "Mônica", "Júlio", "Fernandes", "Luan",
            "Lorena", "Felipe", "Elisângela", "Augusto", "Julieta", "Alexandre", "Tainara", "Lúcio", "Vitória", "Thiago", "Verônica", "Bruna", "Isabel",
            "Leonardo", "Karla", "Laisa", "Cintia", "Luciano", "Vitória", "Laísa", "Angélica", "Rafael", "Talita", "Fábio", "Evelyn", "Kauã", "Karina",
            "Erick", "Monique", "Yago", "Mirela", "Mariano", "Renata", "Roberta", "Cássio", "Regina", "Elton", "Solange", "Lucas", "Cleusa", "Amanda",
            "Talissa", "Lucas", "Natália", "Aline", "Leonardo", "Sônia", "Hélio", "Daniela", "Alan", "Alane", "Bianca", "Márcio", "Marcelo", "Renata",
            "Adriano", "Joice", "Sandro", "Ananda", "Vinícius", "Carolina", "Rogério", "Cláudia", "Joaquim", "Fabiana", "Marcela", "Thiago", "Elaine",
            "Isaías", "Elisa", "Rafael", "Melissa", "Emanuel", "Lorena", "Sílvio", "Roberta", "Rafael", "Larissa", "Gustavo", "Júlia", "Ricardo",
            "Sueli", "Leonardo", "Tábata", "Mauro", "Rafaela", "Paulo", "Larisse", "Vítor", "Cléo", "Bruno", "Valeska", "Luís", "Sâmara", "Diogo",
            "Cecília", "Higor", "Jenifer", "Eduardo", "Luana", "Lucas", "Nádia", "Emerson", "Fernanda", "Josué", "Giovanna", "Silas", "Luísa", "Gustavo",
            "Yasmin", "Guilherme", "Ruth", "Felipe", "Vivian", "Ismael", "Marta", "Aurélio", "Cleide", "Enzo", "Elaine", "Marcos", "Tatiane", "Samuel",
            "Cláudia", "Cauã", "Lucas", "Estela", "Nathália", "Thaís", "Lucas", "Adrielle", "Daniel", "Larissa", "Neymar", "Valeska", "Mário", "Lívia",
            "Ariel", "Lorraine", "Heitor", "Renata", "Miguel", "Larisse", "Nicolas", "Jéssica", "Luiz", "Laisa", "Arthur", "Ana Luiza", "Gael", "Lígia",
            "Maurício", "Giovana", "Santiago", "Larissa", "Max", "Raquel", "Emanuel", "Cristina", "Pedro", "Talita", "Rodrigo", "Evelyn", "Davi",
            "Juliana", "Bruno", "Isabel", "Bernardo", "Karla", "Calebe", "Cintia", "Roberto", "Vitória", "Eduardo", "Angélica", "Joaquim", "Talita",
            "Carlos", "Evelyn", "Rafael", "Karina", "Feliciano", "Monique", "Dario", "Mirela", "Otávio", "Renata", "William", "Elisângela", "Lorenzo",
            "Julieta", "Heitor", "Tainara", "Juan", "Vitória", "Henrique", "Verônica", "Gabriel", "Isabela", "Leandro", "Larissa", "Gustavo", "Evelyn",
            "Emanuel", "Karla", "Yago", "Monique", "Thiago", "Renata", "Ricardo", "Elisângela", "Lucca", "Julieta", "Bruno", "Tainara", "Davi", "Verônica",
            "Caio", "Isabela", "Carlos", "Larissa", "Feliciano", "Evelyn", "Calebe", "Karina", "Lucas", "Monique", "Roberto", "Mirela", "Eduardo", "Renata",
            "Luiz", "Elisângela", "Arthur", "Julieta", "Miguel", "Tainara", "Nicolas", "Verônica", "Luiz", "Isabela", "Nicolas", "Lucas"
    );

    public static List<String> getNames() {
        return namesList;
    }
}
