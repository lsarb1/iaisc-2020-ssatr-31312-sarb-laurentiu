package Capsule;

import Machine.MS_B;
import Ports.Port1;
import Ports.Port2;

public class Caps_B extends Capsule {
    Port1 endPort;

    public Caps_B(){
        Port2 port2=new Port2();
        MS_B ms_b=new MS_B();
    }
}
