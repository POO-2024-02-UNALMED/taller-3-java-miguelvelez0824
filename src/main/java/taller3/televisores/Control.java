package taller3.televisores;

public class Control {
    private TV tv;

    //metodo enlazar
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setcontrol(this);
    }

    public void setTV(TV tv){
        this.tv = tv;
    }
    public TV getTV(){
        return tv;
    }
    //mtodos: turnOn, turnOff, canalUp, canalDown, volumenUp, volumenDown, setCanal y setVolumen.
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void setCanal(){
        tv.setCanal(canal);
    }
    public void setVolumen(){
        tv.setvolumen(volumen);
    }
}
