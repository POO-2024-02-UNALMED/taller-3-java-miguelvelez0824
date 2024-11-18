package taller3.televisores;

public class TV {
    public static int numTV = 0;

    private Marca marca;
    public int canal = 1;
    public int precio = 500;
    private boolean estado;    //encendido = True
    private int volumen = 1;
    private Control control;
    
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV = numTV + 1;
    }
    // metodos set y get para los atributos marca, canal, precio, volumen y control.
    //metodos para marca
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return this.marca;
    }

    //metodos para el canal
    public void setCanal(int canal){
        if(this.estado == true){
            if(canal <= 120 && canal >=1){
                this.canal = canal;
            }
        }
    }

    public int getCanal(){
        return this.canal;
    }

    public void canalUp(){
        if(this.estado == true){
            if(this.canal < 120){
                this.canal = this.canal + 1;
            }
            else{
                this.canal = 1;
            }
        }
        return;
    }

    public void canalDown(){
        if(this.estado == true){
            if(this.canal > 1){
                this.canal = this.canal - 1;
            }
            else{
                this.canal = 120;
            }
        }
        return;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }
    //metodos para el volumen
    public void setVolumen(int volumen){
        if(this.estado == true){
            if(volumen >= 0 && volumen <=7){
                this.volumen = volumen;
            }
        }
    }
    public int getVolumen(){
        return this.volumen;
    }
    public void volumenUp(){
        if(this.estado == true){
            if(volumen < 7){
                this.volumen = this.volumen + 1;
            }
        }
        return;
    }
    public void volumenDown(){
        if(this.estado == true){
            if(volumen > 0){
                this.volumen = this.volumen - 1;
            }
        }
        return;
    }

    //metodos para control
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return this.control;
    }
    //set y get para numTV
    public void setNumTV(int NumTV){
        numTV = NumTV;
    }
    public int getNumTV(){
        return numTV;
    }
    //Encendido y apagado y metodo getEstado
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
}
