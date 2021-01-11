package giotto.functionality.code.hydropower;

import giotto.functionality.code.real_port;
import giotto.functionality.interfaces.TaskInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

public class ReadSensor implements TaskInterface, Serializable {
	
	public void run(Parameter parameter) {
		((real_port)parameter.getPortVariable(1)).setFloatValue(Hydropower.hLevel);
		((real_port)parameter.getPortVariable(2)).setFloatValue(Hydropower.mLevel);
		((real_port)parameter.getPortVariable(3)).setFloatValue(Hydropower.zLevel);
		((real_port)parameter.getPortVariable(4)).setFloatValue(Hydropower.lLevel);
	}
}
