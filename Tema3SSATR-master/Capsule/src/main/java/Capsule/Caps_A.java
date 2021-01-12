package Capsule;

import Machine.MS_A;
import Ports.Port1;

public class Caps_A extends Capsule {
    Port1 endPort;

    public Caps_A(){
        MS_A ms_a=new MS_A();
        Port1 port1=new Port1();
    }
}
