package com.tryjsf01;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
@ViewScoped
public class LineChartBean {
  private LineChartModel lineModel;

  @PostConstruct
  public void init() {
      lineModel = new LineChartModel();
      LineChartSeries s1 = new LineChartSeries();
      LineChartSeries s2 = new LineChartSeries();
      LineChartSeries s3 = new LineChartSeries();
      
      
      s1.setLabel("Population 1");
      s1.set(1, 100*Math.random());
      s1.set(2, 100*Math.random());
      s1.set(3, 100*Math.random());
      s1.set(4, 100*Math.random());
      s1.set(5, 100*Math.random());
      s1.set(6, 100*Math.random());
      
      s2.setLabel("Population 2");
      s2.set(1, 100*Math.random());
      s2.set(2, 100*Math.random());
      s2.set(3, 100*Math.random());
      s2.set(4, 100*Math.random());
      s2.set(5, 100*Math.random());
      s2.set(6, 100*Math.random());
      
      s3.setLabel("Population 3");
      s3.set(1, 100*Math.random());
      s3.set(2, 100*Math.random());
      s3.set(3, 100*Math.random());
      s3.set(4, 100*Math.random());
      s3.set(5, 100*Math.random());
      s3.set(6, 100*Math.random());

      lineModel.addSeries(s1);
      lineModel.addSeries(s2);
      lineModel.addSeries(s3);
      
//      lineModel.setLegendPosition("e");
      
      
      Axis y = lineModel.getAxis(AxisType.Y);
		/*
		 * y.setMin(0.5); y.setMax(700);
		 */
      y.setLabel("Millions");

      Axis x = lineModel.getAxis(AxisType.X);
		/*
		 * x.setMin(0); x.setMax(7);
		 */
      x.setTickInterval("1");
      x.setLabel("Number of Years");

  }

  public LineChartModel getLineModel() {
      return lineModel;
  }
}

