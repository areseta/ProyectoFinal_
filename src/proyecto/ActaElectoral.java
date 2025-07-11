/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author gilar
 */
public class ActaElectoral {
    
        private static int contadorActas = 1; 

    private String numeroActa;
    private String titulo;
    private String fecha;
    private String hora;
    private String lugar;
    private MesaElectoral mesa;
    private int totalVotantesRegistrados;
    private int totalVotantesEfectivos;
    private int votosBlanco;
    private int votosNulos;
    private String observaciones;
    private String firma;
    private String sello;
    private ResultadoCandidato[] resultados;
    private int punteroResultados;

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, MesaElectoral mesa, int totalVotantesRegistrados) {
        this.numeroActa = "ACT-" + contadorActas++; 
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.mesa = mesa;
        this.totalVotantesRegistrados = totalVotantesRegistrados;
        this.totalVotantesEfectivos = 0;
        this.votosBlanco = 0;
        this.votosNulos = 0;
        this.observaciones = "";
        this.firma = "";
        this.sello = "";
        this.resultados = new ResultadoCandidato[50];
        this.punteroResultados = 0;
    }

    public void registrarVoto(Candidato candidato) {
        for (int i = 0; i < punteroResultados; i++) {
            if (resultados[i].getCandidato().getDni().equals(candidato.getDni())) {
                resultados[i].setVotos(resultados[i].getVotos() + 1);
                totalVotantesEfectivos++;
                return;
            }
        }
        resultados[punteroResultados] = new ResultadoCandidato(candidato, 1);
        punteroResultados++;
        totalVotantesEfectivos++;
    }

    public void registrarVotoBlanco() {
        this.votosBlanco++;
        this.totalVotantesEfectivos++;
    }

    public String getCodigoMesa() {
    return mesa.getCodigo();
}

    public String getObservaciones() {
        return observaciones;
    }

    public String getFirma() {
        return firma;
    }

    public String getSello() {
        return sello;
    }

    
    
    
    public void registrarVotoNulo() {
        this.votosNulos++;
        this.totalVotantesEfectivos++;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public static int getContadorActas() {
        return contadorActas;
    }

    public static void setContadorActas(int contadorActas) {
        ActaElectoral.contadorActas = contadorActas;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public int getTotalVotantesRegistrados() {
        return totalVotantesRegistrados;
    }

    public void setTotalVotantesRegistrados(int totalVotantesRegistrados) {
        this.totalVotantesRegistrados = totalVotantesRegistrados;
    }

    public int getTotalVotantesEfectivos() {
        return totalVotantesEfectivos;
    }

    public void setTotalVotantesEfectivos(int totalVotantesEfectivos) {
        this.totalVotantesEfectivos = totalVotantesEfectivos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public ResultadoCandidato[] getResultados() {
        return resultados;
    }

    public void setResultados(ResultadoCandidato[] resultados) {
        this.resultados = resultados;
    }

    public int getPunteroResultados() {
        return punteroResultados;
    }

    public void setPunteroResultados(int punteroResultados) {
        this.punteroResultados = punteroResultados;
    }
    
    
    

    public void mostrarResumen() {
        System.out.println(" Acta N°: " + this.numeroActa + " - " + this.titulo);
        System.out.println(" Fecha: " + this.fecha + "  Hora: " + this.hora);
        System.out.println(" Lugar: " + this.lugar);
        System.out.println("️ Mesa: " + this.mesa.getCodigo());
        System.out.println(" Registrados: " + this.totalVotantesRegistrados);
        System.out.println(" Efectivos: " + this.totalVotantesEfectivos);
        System.out.println(" Blancos: " + this.votosBlanco);
        System.out.println(" Nulos: " + this.votosNulos);
        System.out.println("️ Firma: " + this.firma);
        System.out.println(" Sello: " + this.sello);
        System.out.println(" Observaciones: " + this.observaciones);
        System.out.println(" Miembros de Mesa:");
        System.out.println(" Presidente: " + this.mesa.getPresidente().getNombreCompleto());
        System.out.println(" Secretario: " + this.mesa.getSecretario().getNombreCompleto());
        System.out.println(" Vocal: " + this.mesa.getVocal().getNombreCompleto());
        System.out.println(" Resultados:");
        for (int i = 0; i < punteroResultados; i++) {
            resultados[i].mostrar();
        }
        
    }
    
}
