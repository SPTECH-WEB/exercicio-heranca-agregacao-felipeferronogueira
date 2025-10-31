package school.sptech;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Desenvolvedor() {
    }

    public Double calcularSalario() {
        if (qtdHoras == null || valorHora == null) {
            return 0.0;
        }
        Double salario = qtdHoras * valorHora;
        salario = Math.round(salario * 100) / 100.0;
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}

