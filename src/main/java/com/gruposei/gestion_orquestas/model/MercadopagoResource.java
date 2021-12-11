package com.gruposei.gestion_orquestas.model;

import com.mercadopago.resources.datastructures.preference.Item;
//import lombok.Data;

import java.util.List;

//@Data
public class MercadopagoResource {

    private String id;
    private String initPoint;
    private String sandboxInitPoint;
    private String externalReference;
    private List<Item> items;

    public MercadopagoResource(String id, String initPoint, String sandboxInitPoint, String externalReference, List<Item> items) {
        this.id = id;
        this.initPoint = initPoint;
        this.sandboxInitPoint = sandboxInitPoint;
        this.externalReference = externalReference;
        this.items = items;
    }

    public MercadopagoResource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitPoint() {
        return initPoint;
    }

    public void setInitPoint(String initPoint) {
        this.initPoint = initPoint;
    }

    public String getSandboxInitPoint() {
        return sandboxInitPoint;
    }

    public void setSandboxInitPoint(String sandboxInitPoint) {
        this.sandboxInitPoint = sandboxInitPoint;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}