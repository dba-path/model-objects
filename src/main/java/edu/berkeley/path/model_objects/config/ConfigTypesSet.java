package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.JaxConfigTypes;
import edu.berkeley.path.model_objects.jaxb.JaxConfigTypesSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill on 4/16/15.
 */
public class ConfigTypesSet extends JaxConfigTypesSet {


    public List<ConfigTypes> getConfigSet() {
        return (List<ConfigTypes>) (List<?>) super.jaxConfigTypes;
    }

    /**
     * Set the parameters list. Attaches list of Parameter Model Objects to scenario.
     *
     * @param  confTypes List of extended Config Types
     * */
    public void setConfigSet(List<ConfigTypes> confTypes) {

        List<ConfigTypes> pSet =  confTypes ;

        if ( pSet == null )
            pSet = new ArrayList<ConfigTypes>();

        pSet.clear();
        pSet.addAll(confTypes);
        confTypes = pSet;
    }



}
