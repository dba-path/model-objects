/**
 * Copyright (c) 2012, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *   Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 **/

package edu.berkeley.path.model_objects.scenario;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.berkeley.path.model_objects.shared.CrudFlag;

import java.util.ArrayList;
import java.util.List;

/** Route class
 * @author Matthew Juhn (mnjuhn@berkeley.edu)
 */
public class Route extends edu.berkeley.path.model_objects.jaxb.Route {

    /**
     * Return id of route
     *
     * @return id of route as long
     */
    @Override
    public long getId() {
        return super.getId();
    }

    /**
     * Set id of route
     *
     * @param id of route
     */
    @Override
    public void setId(long id) {
        super.setId(id);
    }

    /**
     * Return name of route
     *
     * @return name of route as string
     */
    @Override
    public String getRouteName() {
        return super.getRouteName();
    }

    /**
     * Set name of route
     *
     * @param name of route as string
     */
    @Override
    public void setRouteName(String name) {
        super.setRouteName(name);
    }

    /**
     * Gets the value of the modStamp property.
     *
     * @return String representation of mod-stamp
     */
    @Override
    public String getModStamp() {
        return super.getModStamp();
    }

    /**
     * Sets the value of the modStamp property.
     *
     * @param value of database mod-stamp
     */
    @Override
    public void setModStamp(String value) {
        this.modStamp = value;
    }

    /**
     * Get the list of links in this route.
     *
     * @return List of all links in route.
     */
    @SuppressWarnings("unchecked")
    public List<RouteLink> getListOfRouteLinks() {
        // return casted list of Nodes from JAXB base class
        return (List<RouteLink>)(List<?>)getRouteLink();
    }

    /**
     * Set the Route links. Attaches list of RouteLink Model Objects to Route.
     *
     * @param links of extended Route Links to add
     */
    @SuppressWarnings("unchecked")
    public void setListOfRouteLinks(List<RouteLink> links) {
        // clear all routeLinks and add new list of them
        getRouteLink().clear();
        getRouteLink().addAll((List<edu.berkeley.path.model_objects.jaxb.RouteLink>)(List<?>)links);
    }


    /**
     * TODO: Route Validation, return true for now
     */
    public boolean isValid() {
        return true;
    }

    /**
     * Override Jaxb getters for children to manage Json serialization
     */
    @Override
    @JsonIgnore
    public List<edu.berkeley.path.model_objects.jaxb.RouteLink> getRouteLink() {
        if (routeLink == null) {
            routeLink = new ArrayList<edu.berkeley.path.model_objects.jaxb.RouteLink>();
        }
        return this.routeLink;
    }

    /**
     * Get CRUD (Create, Retrieve, Update, Delete) Action Flag for object
     *
     * @return CRUD Flag enumeration
     */
    public CrudFlag getCrudFlagEnum() {

        CrudFlag flag = null;
        // Check if CRUDFlag is null, if so return NONE enumeration
        if (super.getCrudFlag() == null) {
            setCrudFlagEnum(CrudFlag.NONE);
            flag = CrudFlag.NONE;
        }
        else {
            switch (CrudFlag.valueOf(super.getCrudFlag())) {
                case CREATE:
                    flag = CrudFlag.CREATE;
                    break;
                case RETRIEVE:
                    flag = CrudFlag.RETRIEVE;
                    break;
                case UPDATE:
                    flag = CrudFlag.UPDATE;
                    break;
                case DELETE:
                    flag = CrudFlag.DELETE;
                    break;
                default:
                    flag = CrudFlag.NONE;
                    break;

            }
        }
        return flag;
    }

    /**
     * Set CRUD (Create, Retrieve, Update, Delete) Action Flag for object
     *
     * @param  flag enumeration
     */
    public void setCrudFlagEnum(edu.berkeley.path.model_objects.shared.CrudFlag flag) {
        // Check if CRUDFlag is null, if so return NONE enumeration
        if (flag == null) {
            super.setCrudFlag("NONE");
        }
        else {
            switch (flag) {
                case CREATE:
                    super.setCrudFlag("CREATE");
                    break;
                case RETRIEVE:
                    super.setCrudFlag("RETRIEVE");
                    break;
                case UPDATE:
                    super.setCrudFlag("UPDATE");
                    break;
                case DELETE:
                    super.setCrudFlag("DELETE");
                    break;
                default:
                    super.setCrudFlag("NONE");
                    break;

            }
        }
    }



}
