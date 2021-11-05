public class Telefono {
    
    // El modelo del telefono
    private String modelo;
    //El porcentaje de bateria que le queda
    private int porcentajeDeBateria;
    //true = la pantalla esta encendida
    private boolean pantallaEncendida;
    
    public Telefono(String modeloDelTelefono, int porcentajeBateria, boolean pantalla){
        modelo = modeloDelTelefono;
        porcentajeDeBateria = porcentajeBateria;
        pantallaEncendida = pantalla;
    }
    
    public String getModelo() {
       return modelo;
    }
    
    public int getPorcentajeDeBateria() {
       return porcentajeDeBateria;
    }
    
    public boolean getPantallaEncendida() {
       return pantallaEncendida;
    }
    
    public void setModelo(String nuevoModelo){
        modelo = nuevoModelo;
    }
    
    public void cargarTelefono(int cantidadCargada){
        porcentajeDeBateria = porcentajeDeBateria + cantidadCargada;
    }
    
    public void pulsarBotonDeBloqueo(boolean botonPulsado){
        if (botonPulsado == true) {
            pantallaEncendida = true;
        }
        else {
            pantallaEncendida = false;
        }
    }
    
    public void imprimeInformacion(){
        System.out.println(modelo);
        System.out.println(porcentajeDeBateria);
        System.out.println(pantallaEncendida);
    }
    
    public String estadoDelObjeto(){
        return modelo + " " + porcentajeDeBateria + " " + pantallaEncendida;
    }
}