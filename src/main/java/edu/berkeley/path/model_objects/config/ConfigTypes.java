package edu.berkeley.path.model_objects.config;

import edu.berkeley.path.model_objects.jaxb.JaxConfigTypes;

/**
 * Created by bill on 4/16/15.
 */
public class ConfigTypes extends JaxConfigTypes{

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long value) {
        super.setId(value);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String value) {
        super.setName(value);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
    }

    @Override
    public long getInUse() {
        return super.getInUse();
    }

    @Override
    public void setInUse(long value) {
        super.setInUse(value);
    }

    @Override
    public String getModStamp() {
        return super.getModStamp();
    }

    @Override
    public void setModStamp(String value) {
        super.setModStamp(value);
    }

    @Override
    public String getCrudflag() {
        return super.getCrudflag();
    }

    @Override
    public void setCrudflag(String value) {
        super.setCrudflag(value);
    }
}
