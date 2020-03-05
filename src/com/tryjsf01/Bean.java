package com.tryjsf01;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.PieChartModel;


@ManagedBean
@ViewScoped
public class Bean {
    private PieChartModel model;

    public Bean() {
        model = new PieChartModel();
        model.set("Brand 1", 100*Math.random());
        model.set("Brand 2", 100*Math.random());
        model.set("Brand 3", 100*Math.random());
        model.set("Brand 4", 100*Math.random());
        model.setTitle("Simple Pie");
        model.setLegendPosition("w");
    }
    public PieChartModel getModel() {
        return model;
    }
}