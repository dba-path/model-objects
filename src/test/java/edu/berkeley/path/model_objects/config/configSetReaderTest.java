package edu.berkeley.path.model_objects.config;


import edu.berkeley.path.model_objects.jaxb.JaxConfigTypes;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


/**
 * Created by bill on 4/16/15.
 *
 */
public class configSetReaderTest {

    @Test
    public void configSetTest() {

        ArrayList<ConfigTypes> keySet = new ArrayList<ConfigTypes> ();
        edu.berkeley.path.model_objects.config.ConfigTypes keys = new ConfigTypes();

        keys.setId(1L);
        keys.setName("Le Grand Test");
        keys.setDescription("Le Grand Description");
        keys.setInUse(1);
        keys.setModStamp("01-DEC-2014 23:31:12.12341234");
        keys.setCrudflag("UPDATE");

        keySet.add(keys);

        assertEquals(1,keySet.get(0).getId().longValue());
        assertEquals("le grand test",keySet.get(0).getName().toLowerCase());
        assertEquals("le grand description",keySet.get(0).getDescription().toLowerCase());
        assertEquals(1,keySet.get(0).getInUse());
        assertEquals("01-DEC-2014 23:31:12.12341234",keySet.get(0).getModStamp());
        assertEquals("UPDATE",keySet.get(0).getCrudflag());


    }


}
