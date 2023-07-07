/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author josegaspar
 */
public class MayusculasValidacion extends StringValidator{

    @Override
    public void validate(Problems prblms, String compName, String t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if((!"".equals(t)) && (!Character.isUpperCase(t.charAt(0)))){
            //prblms.add("Campo: "+compName+" tiene que empezar por mayúsculas.");
            String msg=NbBundle.getMessage(this.getClass(),"MSG_MAYUSCULA", compName);
            prblms.add(msg);
            
        }
    }
    
}
