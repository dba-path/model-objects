package edu.berkeley.path.model_objects.config;


import edu.berkeley.path.model_objects.jaxb.*;

/**
 * Created by bill on 4/14/15.
 * 
 */
public class ConfigKeyTypes extends edu.berkeley.path.model_objects.jaxb.ConfigKeyTypes {


    @Override
    public long getId() {return super.id ;}

    @Override
    public long getInUse() {return super.inUse; }

    @Override
    public String getCrudflag() {
        return super.getCrudflag();
    }

    @Override
    public String getDescription() { return super.getDescription(); }

    @Override
    public String getModStamp() { return super.getModStamp(); }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setCrudflag(String value) {
        super.setCrudflag(value);
    }

    @Override
    public void setId(long value) {
        super.setId(value);
    }

    @Override
    public void setInUse(long value) {
        super.setInUse(value);
    }

    @Override
    public void setModStamp(String value) {
        super.setModStamp(value);
    }

    @Override
    public void setName(String value){super.setName(value);}

    @Override
    public void setDescription(String value){super.setDescription(value);}
}
