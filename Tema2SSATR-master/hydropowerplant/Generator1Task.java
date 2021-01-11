package giotto.functionality.code.hydropower;

import giotto.functionality.code.real_port;
import giotto.functionality.interfaces.DriverInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

public class Generator1Task implements DriverInterface, Serializable  {
	
    public void run(Parameter parameter) {
        if((real_port)parameter.getPortVariable(0) > Hydropower.mLevel)
		{
			
		}
		
		if((real_port)parameter.getPortVariable(1) <= Hydropower.zLevel)
		{
			
		}
    }

}
