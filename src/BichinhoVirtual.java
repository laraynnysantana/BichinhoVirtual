public class BichinhoVirtual {
    private String nome;
    private Integer energia;
    private Integer fome;
    private Integer humur;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        if (energia < 25) {
            IO.println("Seu pet esta começando a ficar sem energia!!");
        } else if(energia > 50) {
            IO.println("Seu pet esta sem energia!!");
        } else if (energia >75) {
            IO.println("Seu pet está morrendo");

        }
    }
    public Integer getHumur() {
        return humur;
    }

    public Integer getFome() {
        return fome;
    }

    public void setFome(Integer fome) {
       if (fome > 25){
           IO.println("Seu pet esta começando a ficar com fome");
       }else if (fome >50) {
            IO.println("Seu pet esta com fome");
        } else if(fome > 75){
            IO.println("Seu pet esta morrendo de fome");
        }
    }
}


