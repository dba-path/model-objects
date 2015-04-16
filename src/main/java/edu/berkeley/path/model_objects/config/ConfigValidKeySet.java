package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.ConfigValidKeysSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill on 4/15/15.
 */
public class ConfigValidKeySet extends ConfigValidKeysSet{

    public List<ConfigValidKeys> getValidKeySet() {
        return (List<ConfigValidKeys>) (List<?>) super.getConfigValidKeys();
    }


    /**
     * Set the parameters list. Attaches list of Parameter Model Objects to scenario.
     *
     * @param  confKeyTypes	List of extended Config Key Types to add
     */
    public void setListOfValidKeys(List<ConfigValidKeys> confKeyTypes) {

        List<edu.berkeley.path.model_objects.jaxb.ConfigValidKeys> pSet =
                (ArrayList<edu.berkeley.path.model_objects.jaxb.ConfigValidKeys>) configValidKeys ;

        if ( pSet == null )
            pSet = new ArrayList<edu.berkeley.path.model_objects.jaxb.ConfigValidKeys>();

        pSet.clear();
        pSet.addAll(confKeyTypes);
        configValidKeys = pSet;
    }

}
