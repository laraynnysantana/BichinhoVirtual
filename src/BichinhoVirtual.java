public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int energia;
    private String humor;


    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.energia = 50;
        this.humor = "Normal";
    }
    public BichinhoVirtual(String nome, int fome, int energia, String humor) {
        this.nome = nome;
        this.fome = fome;
        this.energia = energia;
        this.humor = humor;
    }
    public int getEnergia(){
        return energia;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public String getHumor() {
        int x = energia - fome;
        if (x > 75) {
            return humor = " Muito Feliz";
        } else if (x > 50) {
            return humor = "Feliz";
        } else if ( x >= 0) {
            return humor = "Normal";
        } else if (x > -30) {
            return humor = "Cansado";
        }else{
           return humor = "Triste";

        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setEnergia(int energia) {
        if(energia >= 0 && energia <= 100){
            this.energia = energia;
        }else{
            IO.println("Digite um valor válido");
        }


    }

    @Override
    public String toString() {
        return "BichinhoVirtual{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome + getHumor() +
                ", energia=" + energia +
                ", humor='" + humor + '\'' +
                '}';
    }
}
