package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores = new ArrayList<>();

    public Consultoria() {
    }

    public void contratar(Desenvolvedor desenvolvedor) {
        if (desenvolvedores.size() < vagas) {
            desenvolvedores.add(desenvolvedor);
        }
    }

    public void contratarFullstack(DesenvolvedorWeb desenvolvedor) {
        if (desenvolvedores.size() < vagas && desenvolvedor.isFullstack()) {
            desenvolvedores.add(desenvolvedor);
        }
    }

    public Double getTotalSalarios() {
        Double total = 0.00;
        for (Desenvolvedor d : desenvolvedores) {
            total += d.calcularSalario();
        }
        total = Math.floor(total * 100) / 100.00;
        return total;
    }

    public Integer qtdDesenvolvedoresMobile() {
        Integer cont = 0;
        for (Desenvolvedor d : desenvolvedores) {
            if (d instanceof DesenvolvedorMobile) {
                cont++;
            }
        }
        return cont;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario) {
        List<Desenvolvedor> lista = new ArrayList<>();
        for (Desenvolvedor d : desenvolvedores) {
            if (d.calcularSalario() >= salario) {
                lista.add(d);
            }
        }
        return lista;
    }

    public Desenvolvedor buscarMenorSalario() {
        if (desenvolvedores.isEmpty()) {
            return null;
        }

        Desenvolvedor menor = desenvolvedores.get(0);

        for (Desenvolvedor d : desenvolvedores) {
            if (d.calcularSalario() < menor.calcularSalario()) {
                menor = d;
            }
        }
        return menor;
    }

    public List<Desenvolvedor> buscarPorTecnologia(String tecnologia) {
        List<Desenvolvedor> lista = new ArrayList<>();

        for (Desenvolvedor d : desenvolvedores) {

            if (d instanceof DesenvolvedorWeb) {
                DesenvolvedorWeb w = (DesenvolvedorWeb) d;
                if (tecnologia.equals(w.getBackend()) ||
                        tecnologia.equals(w.getFrontend()) ||
                        tecnologia.equals(w.getSgbd())) {
                    lista.add(w);
                }
            }

            if (d instanceof DesenvolvedorMobile) {
                DesenvolvedorMobile m = (DesenvolvedorMobile) d;
                if (tecnologia.equals(m.getPlataforma()) ||
                        tecnologia.equals(m.getLinguagem())) {
                    lista.add(m);
                }
            }
        }

        return lista;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {
        Double total = 0.00;
        List<Desenvolvedor> lista = buscarPorTecnologia(tecnologia);

        for (Desenvolvedor d : lista) {
            total += d.calcularSalario();
        }
        
        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
}

