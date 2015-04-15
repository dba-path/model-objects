package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill on 4/15/15.
 */
public class keySetReaderTest {

    @Test
    public void setKeySet() {

        ArrayList<ConfigKeyTypes> keySet = new ArrayList<ConfigKeyTypes> ();
        edu.berkeley.path.model_objects.config.ConfigKeyTypes keys = new ConfigKeyTypes();

        keys.setId(1L);
        keys.setShortDesc("A Key Desc");
        keys.setModStamp("01-JAN-1014 13:22:00.123456");
        keys.setLongDesc("A long description");
        keys.setInUse(1L);

        keySet.add(keys);


        Long id = keySet.get(0).getId();





        }

}
