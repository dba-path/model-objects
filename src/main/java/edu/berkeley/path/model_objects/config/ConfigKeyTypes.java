package edu.berkeley.path.model_objects.config;


import edu.berkeley.path.model_objects.jaxb.*;

/**
 * Created by bill on 4/14/15.
 * 
 */
public class ConfigKeyTypes extends edu.berkeley.path.model_objects.jaxb.ConfigKeyTypes {


    @Override
    public Long getId() {return super.id ;}

    @Override
    public long getInUse() {return super.inUse; }

    @Override
    public String getCrudflag() {
        return super.getCrudflag();
    }

    @Override
    public String getLongDesc() { return super.getLongDesc(); }

    @Override
    public String getModStamp() { return super.getModStamp(); }

    @Override
    public String getShortDesc() {
        return super.getShortDesc();
    }

    @Override
    public void setCrudflag(String value) {
        super.setCrudflag(value);
    }

    @Override
    public void setId(Long value) {
        super.setId(value);
    }

    @Override
    public void setInUse(long value) {
        super.setInUse(value);
    }

    @Override
    public void setLongDesc(String value) {
        super.setLongDesc(value);
    }

    @Override
    public void setModStamp(String value) {
        super.setModStamp(value);
    }

    @Override
    public void setShortDesc(String value) {
        super.setShortDesc(value);
    }


}
