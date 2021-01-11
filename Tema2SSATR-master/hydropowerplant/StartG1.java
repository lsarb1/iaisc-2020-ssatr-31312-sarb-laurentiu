package giotto.functionality.code.hydropower;


import giotto.functionality.code.real_port;
import giotto.functionality.interfaces.DriverInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

public class StartG1 implements DriverInterface, Serializable {

   
    public void run(Parameter parameter) {
        if ((real_port)parameter.getPortVariable(0) > Hydropower.mLevel)
        {
			Hydropower.StartGenerator1();
		}
    }
}
