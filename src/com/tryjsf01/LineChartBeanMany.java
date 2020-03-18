package com.tryjsf01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LegendPlacement;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
@ViewScoped
public class LineChartBeanMany {
	private LineChartModel lineModel;
	private Date time;
	
	

	private int seriesNum = 12;
	private int valuesNum = 50;
	private int delta = 5; // %

	@PostConstruct
	public void init() {
		
		//createDateModel();
		lineModel = new LineChartModel();

		ArrayList<LineChartSeries> alcs = new ArrayList<LineChartSeries>();

		for (int i = 0; i < seriesNum; i++) {
			alcs.add(new LineChartSeries());
		}

		for (LineChartSeries s : alcs) {
			double n1 = Math.random();
			for (int i = 1; i <= valuesNum; i++) {
				double n2 = Math.random();
				while (Math.abs(n2 - n1) > (double)delta / 100) {
					n2 = Math.random();
				}
				s.set(i, 100 * n2);
				n1 = n2;
			}
		}

int rnc=1;
		for (LineChartSeries s : alcs) {
			s.setShowMarker(false);
			s.setLabel("RNC"+rnc++);
			
			lineModel.addSeries(s);
		}

		lineModel.setZoom(true);
		lineModel.setResetAxesOnResize(true);
		
//		lineModel.setLegendPosition("s");
		

		lineModel.setLegendPosition("s");
//		lineModel.setLegendCols(1);
		lineModel.setLegendRows(2);
		lineModel.setLegendPlacement(LegendPlacement.OUTSIDEGRID);

		Axis y = lineModel.getAxis(AxisType.Y);
		/*
		 * y.setMin(0.5); y.setMax(700);
		 */
//      y.setLabel("Millions");

		Axis x = lineModel.getAxis(AxisType.X);
		/*
		 * x.setMin(0); x.setMax(7);
		 */
		//x.setTickInterval("1");
//      x.setLabel("Number of Years");
		
		x.setMin(0);
		x.setMax(valuesNum);
		
//		lineModel.setAnimate(true);
		

	}

	public LineChartModel getLineModel() {
		return lineModel;
	}

	public Date getTime() {
		time = Calendar.getInstance().getTime();
		return time;
	}

}
