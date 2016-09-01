package com.ilimi.common.dto;

import java.io.Serializable;
import java.util.Map;

import com.ilimi.graph.dac.enums.SystemProperties;

public class NodeDTO implements Serializable {

    private static final long serialVersionUID = -3083582629330476187L;
    private String identifier;
    private String name;
    private String objectType;
    private String relation;
    private String description;
    private Integer index;

    public NodeDTO() {

    }

    public NodeDTO(String identifier, String name, String objectType) {
        this.identifier = identifier;
        this.name = name;
        this.objectType = objectType;
    }

    public NodeDTO(String identifier, String name, String objectType, String relation) {
        this(identifier, name, null, objectType, relation);
    }
    
    public NodeDTO(String identifier, String name, String description, String objectType, String relation) {
        this.identifier = identifier;
        this.name = name;
        this.description = description;
        this.objectType = objectType;
        this.relation = relation;
    }

    public NodeDTO(String identifier, String name, String objectType, String relation, Map<String, Object> metadata) {
        this(identifier, name, null, objectType, relation, metadata);
    }
    
    public NodeDTO(String identifier, String name, String description, String objectType, String relation, Map<String, Object> metadata) {
        this.identifier = identifier;
        this.name = name;
        this.description = description;
        this.objectType = objectType;
        this.relation = relation;
        if (null != metadata && !metadata.isEmpty()) {
            if (metadata.containsKey(SystemProperties.IL_SEQUENCE_INDEX.name()) && null != metadata.get(SystemProperties.IL_SEQUENCE_INDEX.name())) {
        		try {
					this.index = Integer.parseInt(metadata.get(SystemProperties.IL_SEQUENCE_INDEX.name()).toString());
				} catch (Exception e) {
				}
            }
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
