package com.tryjsf01;

import java.io.Serializable;
import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
@RequestScoped
public class DateChartView implements Serializable {

	private LineChartModel dateModel;

	@PostConstruct
	public void init() {
		createDateModel();
	}

	public LineChartModel getDateModel() {

		return dateModel;
	}

	private void createDateModel() {
		dateModel = new LineChartModel();
		
		LineChartSeries series1 = new LineChartSeries();
		series1.setLabel("RNC1");

		series1.set("2020-03-16 14:00:00", .51);
		series1.set("2020-03-16 14:05:00", .22);
		series1.set("2020-03-16 14:10:00", .65);
		series1.set("2020-03-16 14:15:00", .74);
		series1.set("2020-03-16 14:20:00", .24);
		series1.set("2020-03-16 14:25:00", .51);
		

		
		
//		series1.setFill(true);
//		Object x = null;
//		series1.set(x, 0.5);

		LineChartSeries series2 = new LineChartSeries();
		series2.setLabel("RNC2");
		
		

		series2.set("2020-03-16 14:00:00", .32);
		series2.set("2020-03-16 14:05:00", .73);
		series2.set("2020-03-16 14:10:00", .24);
		series2.set("2020-03-16 14:15:00", .12);
		series2.set("2020-03-16 14:20:00", .74);
		series2.set("2020-03-16 14:25:00", .62);
		series2.set("2020-03-16 14:30:00", .1);		
		
//		dateModel.setSeriesColors("58BA27,FFCC33,F74A4A,F52F2F,A30303");
//		dateModel.setExtender("chartExtender");
		dateModel.setSeriesColors("FAAFFF,B23123");
		
//		dateModel.getSeriesColors();
		
//		System.out.println(series1.getMarkerStyle());
		System.out.println(series1.getRenderer());
//		System.out.println(series2.getMarkerStyle());
		System.out.println(series2.getRenderer());
		System.out.println(series2.getRenderer());
		
		series1.setShowMarker(false);
//      series1.setSmoothLine(true);
		series2.setShowMarker(false);
		
		dateModel.setLegendPosition("w");
		dateModel.setLegendCols(1);

		dateModel.addSeries(series1);
		dateModel.addSeries(series2);

		dateModel.setTitle("KPI x1");
		dateModel.setZoom(true);
		
		
//        dateModel.getAxis(AxisType.Y).setLabel("Values");
		DateAxis axis = new DateAxis();
		axis.setTickAngle(-50);
		
//        axis.setMax("2014-02-01");
//        axis.setTickFormat("%b %#d, %y");

		// !!! https://docs.oracle.com/cd/E19857-01/817-6248-10/crtime.html

//        axis.setTickFormat("%b %#d, %y %X");
		axis.setTickFormat("%X");

//dateModel.setShowPointLabels(true);
//dateModel.setMouseoverHighlight(true);
//        dateModel.setShowDatatip(true);
//        dateModel.setAnimate(true);

		dateModel.getAxes().put(AxisType.X, axis);

	}

}
