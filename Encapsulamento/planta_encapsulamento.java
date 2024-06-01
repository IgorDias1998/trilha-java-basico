package Encapsulamento;

public class planta_encapsulamento {
    private String especie;
    private int idadePlanta;
    private float alturaPlanta;
    private boolean daFlor;

    public planta_encapsulamento(String especie, int idadePlanta, float alturaPlanta, boolean daFlor){
        this.especie = especie;
        this.idadePlanta = idadePlanta;
        this.alturaPlanta = alturaPlanta;
        this.daFlor = daFlor;
    }

    public void exibirDados(){
        System.out.println("Especie: " + especie);
        System.out.println("Idade da Planta: " + idadePlanta);
        System.out.println("Altura da planta: " + alturaPlanta);
        System.out.println(daFlor ? "Tem floração" : "Não floresce");
    }

    //Get e setters
    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }

    public void setIdade(int idadePlanta){
        this.idadePlanta = idadePlanta;
    }

    public int getIdade(){
        return idadePlanta;
    }

    public void setAltura(float alturaPlanta){
        this.alturaPlanta = alturaPlanta;
    }

    public float getAltura(){
        return alturaPlanta;
    }

    public void daFlor(boolean daFlor){
        this.daFlor = daFlor;
    }

    public boolean isdaFlor(){
        return daFlor;
    }
}

