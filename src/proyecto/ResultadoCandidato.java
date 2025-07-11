/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Ariana Egoavil Olive
 */
public class ResultadoCandidato {
    
     private Candidato candidato;
    private int votos;

    public ResultadoCandidato(Candidato candidato, int votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public int getVotos() {
        return this.votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void mostrar() {
        System.out.println( this.candidato.getNombreCompleto() + this.votos + " votos");
    }
    
}
