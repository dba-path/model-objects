package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.*;
import org.junit.Test;
import static org.junit.Assert.*;
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
        keys.setName("A Key Name");
        keys.setModStamp("01-JAN-1014 13:22:00.123456");
        keys.setDescription("A Key Description");
        keys.setInUse(1L);

        keySet.add(keys);


        assertEquals(1, keySet.get(0).getId());
        assertEquals("a key name",keys.getName().toLowerCase());
        assertEquals("a key description",keys.getDescription().toLowerCase());
        assertEquals("01-JAN-1014 13:22:00.123456",keys.getModStamp());
        assertEquals(1,keys.getInUse());





        }

}
