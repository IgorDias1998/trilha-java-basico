package Veiculo;

public class Concessionaria {

    public static void main(String[] args) {
        Veiculo fiatUno, fiatStrada;
        Carro bydDolphin;
        Caminhao fiatIveco;
        CaminhaoBau volvoBau;
        CaminhaoCegonha volvoCegonha;
        
        /*Instânciando as classes */
        fiatUno = new Veiculo("Fiat", "Uno", 2003);
        fiatStrada = new Veiculo("Fiat", "Strada", 2016);
        bydDolphin = new Carro("BYD", "Dolphin", 2024, "XX652XX", 115900, 90);
        fiatIveco = new Caminhao("Fiat", "Iveco", 2019, true, 2, 2500);
        volvoBau = new CaminhaoBau("Volvo", "v200", 2020, false, 8, 15000f, 9000, true, true, "Metal");
        volvoCegonha = new CaminhaoCegonha("Volvo", "v5000", 2021, false, 12, 25000f, 20, 4.5f, true);

        bydDolphin.exibirDadosCarro();
        System.out.println("------------------------------");
        fiatIveco.exibirDadosCaminhao();
        System.out.println("------------------------------");
        volvoBau.exibirDadosCaminhaoBau();
        System.out.println("------------------------------");
        volvoCegonha.exibirDadosCegonha();
    }
}