package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.ConfigValidKeysSet;

import java.util.List;

/**
 * Created by bill on 4/15/15.
 */
public class ConfigValidKeySet extends ConfigValidKeysSet{

    public List<ConfigValidKeys> getValidKeySet() {
        return (List<ConfigValidKeys>) (List<?>) super.getConfigValidKeys();
    }

}
