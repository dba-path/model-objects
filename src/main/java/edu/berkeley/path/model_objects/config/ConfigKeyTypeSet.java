package edu.berkeley.path.model_objects.config;

//import edu.berkeley.path.model_objects.jaxb.ConfigKeyTypeSet;


import edu.berkeley.path.model_objects.jaxb.*;
import edu.berkeley.path.model_objects.config.ConfigKeyTypes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill on 4/14/15.
 */
public class ConfigKeyTypeSet extends edu.berkeley.path.model_objects.jaxb.ConfigKeyTypeSet {




    public List<ConfigKeyTypes> getListOfConfigKeyTypes() {
        return (List<ConfigKeyTypes>) (List<?>) super.getConfigKeyTypes();
    }


}
