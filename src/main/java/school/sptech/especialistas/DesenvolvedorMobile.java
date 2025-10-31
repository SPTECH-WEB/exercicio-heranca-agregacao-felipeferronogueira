package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {

    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile() {
    }

    @Override
    public Double calcularSalario() {
        Double salarioBase = super.calcularSalario();

        Double extra = 0.00;
        if (horasPrototipacao != null) {
            extra = horasPrototipacao * 200.00;
        }

        Double total = salarioBase + extra;
        total = Math.floor(total * 100) / 100.00;

        return total;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }
}
