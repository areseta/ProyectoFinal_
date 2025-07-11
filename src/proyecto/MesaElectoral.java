/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Ariana Egoavil Olive
 */
public class MesaElectoral {
    private String codigo;
    private String ubicacion;
    private MiembroMesa presidente;
    private MiembroMesa secretario;
    private MiembroMesa vocal;

    public MesaElectoral(String codigo, String ubicacion, MiembroMesa presidente, MiembroMesa secretario, MiembroMesa vocal) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal = vocal;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public MiembroMesa getPresidente() {
        return this.presidente;
    }

    public void setPresidente(MiembroMesa presidente) {
        this.presidente = presidente;
    }

    public MiembroMesa getSecretario() {
        return this.secretario;
    }

    public void setSecretario(MiembroMesa secretario) {
        this.secretario = secretario;
    }

    public MiembroMesa getVocal() {
        return this.vocal;
    }

    public void setVocal(MiembroMesa vocal) {
        this.vocal = vocal;
    }

    public void mostrarDatos() {
        System.out.println("Mesa: " + this.codigo);
        System.out.println("Ubicación: " + this.ubicacion);
        System.out.println("Presidente: " + this.presidente.getNombreCompleto());
        System.out.println("Secretario: " + this.secretario.getNombreCompleto());
        System.out.println("Vocal: " + this.vocal.getNombreCompleto());
        System.out.println("-----------------------------");
    }


}
