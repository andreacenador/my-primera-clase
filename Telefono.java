public class Telefono {
    
    // El modelo del telefono
    private String modelo;
    //El porcentaje de bateria que le queda
    private int porcentajeDeBateria;
    //true = la pantalla esta encendida
    private boolean pantallaEncendida;
    
    
    public Telefono(String modeloDelTelefono, int porcentajeBateria){
        modelo = modeloDelTelefono;
        porcentajeDeBateria = porcentajeBateria;
        if (porcentajeDeBateria > 0 ) {
            pantallaEncendida = true;
        }
        else {
            pantallaEncendida = false;
        }
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
    
    public void modificarPantallaEncendida(){
        if (pantallaEncendida == true) {
           pantallaEncendida = false;
        }
        else {
            pantallaEncendida = true;
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