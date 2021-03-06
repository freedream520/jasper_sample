
package com.lw.chartthemes.simple;

import net.sf.jasperreports.engine.JRConstants;
import net.sf.jasperreports.engine.design.events.JRChangeEventsSupport;
import net.sf.jasperreports.engine.design.events.JRPropertyChangeSupport;

import java.io.Serializable;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: ChartThemeSettings.java 7199 2014-08-27 13:58:10Z teodord $
 */
public class ChartThemeSettings implements JRChangeEventsSupport, Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	/**
	 *
	 */
	public static final String PROPERTY_chartSettings = "chartSettings";
	public static final String PROPERTY_titleSettings = "titleSettings";
	public static final String PROPERTY_subtitleSettings = "subtitleSettings";
	public static final String PROPERTY_legendSettings = "legendSettings";
	public static final String PROPERTY_plotSettings = "plotSettings";
	public static final String PROPERTY_domainAxisSettings = "domainAxisSettings";
	public static final String PROPERTY_rangeAxisSettings = "rangeAxisSettings";

	/**
	 *
	 */
	private ChartSettings chartSettings = new ChartSettings();
	private TitleSettings titleSettings = new TitleSettings();
	private TitleSettings subtitleSettings = new TitleSettings();
	private LegendSettings legendSettings = new LegendSettings();
	private PlotSettings plotSettings = new PlotSettings();
	private AxisSettings domainAxisSettings = new AxisSettings();
	private AxisSettings rangeAxisSettings = new AxisSettings();
	
	/**
	 *
	 */
	public ChartThemeSettings()
	{
	}
	
	/**
	 *
	 */
	public ChartSettings getChartSettings()
	{
		return chartSettings;
	}
	
	/**
	 *
	 */
	public void setChartSettings(ChartSettings chartSettings)
	{
		ChartSettings old = getChartSettings();
		this.chartSettings = chartSettings;
		getEventSupport().firePropertyChange(PROPERTY_chartSettings, old, getChartSettings());
	}

	/**
	 * @return the subtitleSettings
	 */
	public TitleSettings getSubtitleSettings() {
		return subtitleSettings;
	}

	/**
	 * @param subtitleSettings the subtitleSettings to set
	 */
	public void setSubtitleSettings(TitleSettings subtitleSettings) {
		TitleSettings old = getSubtitleSettings();
		this.subtitleSettings = subtitleSettings;
		getEventSupport().firePropertyChange(PROPERTY_subtitleSettings, old, getSubtitleSettings());
	}

	/**
	 * @return the titleSettings
	 */
	public TitleSettings getTitleSettings() {
		return titleSettings;
	}

	/**
	 * @param titleSettings the titleSettings to set
	 */
	public void setTitleSettings(TitleSettings titleSettings) {
		TitleSettings old = getTitleSettings();
		this.titleSettings = titleSettings;
		getEventSupport().firePropertyChange(PROPERTY_titleSettings, old, getTitleSettings());
	}

	/**
	 * @return the legendSettings
	 */
	public LegendSettings getLegendSettings() {
		return legendSettings;
	}

	/**
	 * @param legendSettings the legendSettings to set
	 */
	public void setLegendSettings(LegendSettings legendSettings) {
		LegendSettings old = getLegendSettings();
		this.legendSettings = legendSettings;
		getEventSupport().firePropertyChange(PROPERTY_legendSettings, old, getLegendSettings());
	}


	private transient JRPropertyChangeSupport eventSupport;
	
	public JRPropertyChangeSupport getEventSupport()
	{
		synchronized (this)
		{
			if (eventSupport == null)
			{
				eventSupport = new JRPropertyChangeSupport(this);
			}
		}
		
		return eventSupport;
	}

	/**
	 * @return the plotSettings
	 */
	public PlotSettings getPlotSettings() {
		return plotSettings;
	}

	/**
	 * @param plotSettings the plotSettings to set
	 */
	public void setPlotSettings(PlotSettings plotSettings) {
		PlotSettings old = getPlotSettings();
		this.plotSettings = plotSettings;
		getEventSupport().firePropertyChange(PROPERTY_plotSettings, old, getPlotSettings());
	}

	/**
	 * @return the domainAxisSettings
	 */
	public AxisSettings getDomainAxisSettings() {
		return domainAxisSettings;
	}

	/**
	 * @param domainAxisSettings the domainAxisSettings to set
	 */
	public void setDomainAxisSettings(AxisSettings domainAxisSettings) {
		AxisSettings old = getDomainAxisSettings();
		this.domainAxisSettings = domainAxisSettings;
		getEventSupport().firePropertyChange(PROPERTY_domainAxisSettings, old, getDomainAxisSettings());
	}

	/**
	 * @return the rangeAxisSettings
	 */
	public AxisSettings getRangeAxisSettings() {
		return rangeAxisSettings;
	}

	/**
	 * @param rangeAxisSettings the rangeAxisSettings to set
	 */
	public void setRangeAxisSettings(AxisSettings rangeAxisSettings) {
		AxisSettings old = getRangeAxisSettings();
		this.rangeAxisSettings = rangeAxisSettings;
		getEventSupport().firePropertyChange(PROPERTY_rangeAxisSettings, old, getRangeAxisSettings());
	}

}
