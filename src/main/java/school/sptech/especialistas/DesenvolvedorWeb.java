package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {

    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;

    public DesenvolvedorWeb() {
    }

    @Override
    public Double calcularSalario() {
        Double salarioBase = super.calcularSalario();

        Double extra = 0.00;
        if (horasMentoria != null) {
            extra = horasMentoria * 300.00;
        }

        Double total = salarioBase + extra;
        total = Math.floor(total * 100) / 100.00;

        return total;
    }

    public Boolean isFullstack() {
        return backend != null && frontend != null && sgbd != null;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentoria) {
        this.horasMentoria = horasMentoria;
    }
}

