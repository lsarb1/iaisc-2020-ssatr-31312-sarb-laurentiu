package giotto.functionality.code.hydropower;

import giotto.functionality.interfaces.DriverInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

public class GetZLevel implements DriverInterface, Serializable {

    public void run(Parameter parameter) {
        ((real_port)parameter.getPortVariable(0)).setFloatValue(Hydropower.zLevel);
    }

}