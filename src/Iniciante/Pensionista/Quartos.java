package Iniciante.Pensionista;

public class Quartos {
    private String nome;
    private String email;
    private Integer numberRoom;

    public Quartos(String nome, String email, Integer numberRoom) {
        this.nome = nome;
        this.email = email;
        this.numberRoom = numberRoom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(Integer numberRoom) {
        this.numberRoom = numberRoom;
    }

    @Override
    public String toString() {
        return "Quartos " +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", numberRoom=" + numberRoom +
                ' ';
    }
}
