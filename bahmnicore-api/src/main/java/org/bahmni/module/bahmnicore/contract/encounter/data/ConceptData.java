package org.bahmni.module.bahmnicore.contract.encounter.data;

public class ConceptData {
    private String uuid;

    public ConceptData(String uuid) {
        this.uuid = uuid;
    }

    public ConceptData() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}