package FuzzyTests;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class FuzzyControlTest {	
	public static void main(String[] args) {
		String filename = "FuzzyLogicControl.fcl";
        FIS fis = FIS.load(filename, true);
        
        if (fis == null) {
            System.err.println("Can't load file: '" + filename + "'");
            System.exit(0);
        }
        
        FunctionBlock fb = fis.getFunctionBlock(null);

        fb.setVariable("error", 299.5);
        fb.setVariable("aggressiveness", 8.5);
        
        fb.evaluate();
        
        fb.getVariable("command").defuzzify();
        
     //   System.out.println(fb);
        System.out.println("Command: " + fb.getVariable("command").getValue());
        
        JFuzzyChart.get().chart(fb);
        
        Variable command = fb.getVariable("command");
       JFuzzyChart.get().chart(command, command.getDefuzzifier(), true);
        
	}
}
