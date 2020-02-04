//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sig3d.citygml._2.energy._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuildingType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "buildingType");
    private final static QName _ConstructionWeight_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "constructionWeight");
    private final static QName _EnergyPerformanceCertificationProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "energyPerformanceCertification");
    private final static QName _Volume_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "volume");
    private final static QName _IsLandmarked_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "isLandmarked");
    private final static QName _ReferencePoint_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "referencePoint");
    private final static QName _RefurbishmentMeasureProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "refurbishmentMeasure");
    private final static QName _ThermalZoneProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "thermalZone");
    private final static QName _UsageZoneProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "usageZone");
    private final static QName _FloorAreaProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "floorArea");
    private final static QName _HeightAboveGroundProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "heightAboveGround");
    private final static QName _AggregatedBuildingConstruction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "aggregatedBuildingConstruction");
    private final static QName _EnergySystemProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "energySystem");
    private final static QName _WeatherDataProperty_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "weatherData");
    private final static QName _Demands_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "demands");
    private final static QName _DateOfEvent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "DateOfEvent");
    private final static QName _EnergyDemand_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "EnergyDemand");
    private final static QName _EnergyPerformanceCertification_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "EnergyPerformanceCertification");
    private final static QName _FloorArea_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "FloorArea");
    private final static QName _HeatExchangeType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "HeatExchangeType");
    private final static QName _HeightAboveGround_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "HeightAboveGround");
    private final static QName __GenericApplicationPropertyOfHeightAboveGround_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfHeightAboveGround");
    private final static QName _RefurbishmentMeasure_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "RefurbishmentMeasure");
    private final static QName _ServiceLife_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ServiceLife");
    private final static QName _VolumeType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "VolumeType");
    private final static QName _WeatherData_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "WeatherData");
    private final static QName _WindowShading_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "WindowShading");
    private final static QName _ThermalBoundary_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalBoundary");
    private final static QName _ThermalOpening_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalOpening");
    private final static QName _ThermalZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalZone");
    private final static QName _AbstractEnergySystemComponent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemComponent");
    private final static QName _AbstractEnergySystemConsumer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemConsumer");
    private final static QName __GenericApplicationPropertyOfAbstractEnergySystemConsumer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfAbstractEnergySystemConsumer");
    private final static QName _AbstractEnergySystemConversion_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemConversion");
    private final static QName _AbstractEnergySystemDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemDistribution");
    private final static QName _AbstractEnergySystemSource_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemSource");
    private final static QName _AbstractEnergySystemStorage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractEnergySystemStorage");
    private final static QName _AbstractSolarEnergySystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractSolarEnergySystem");
    private final static QName _AirCompressor_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AirCompressor");
    private final static QName _Boiler_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Boiler");
    private final static QName _Chiller_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Chiller");
    private final static QName _CombinedHeatPower_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "CombinedHeatPower");
    private final static QName _ElectricalResistance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ElectricalResistance");
    private final static QName _Emitter_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Emitter");
    private final static QName _EnergyFlow_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "EnergyFlow");
    private final static QName _EnergySource_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "EnergySource");
    private final static QName __GenericApplicationPropertyOfEnergySource_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfEnergySource");
    private final static QName _EnergySystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "EnergySystem");
    private final static QName __GenericApplicationPropertyOfEnergySystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfEnergySystem");
    private final static QName _GasDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "GasDistribution");
    private final static QName _GenericConversionSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "GenericConversionSystem");
    private final static QName _HeatExchanger_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "HeatExchanger");
    private final static QName _HeatPump_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "HeatPump");
    private final static QName _MechanicalVentilation_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "MechanicalVentilation");
    private final static QName _OperationSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "OperationSchedule");
    private final static QName _OtherEnergyConsumer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "OtherEnergyConsumer");
    private final static QName __GenericApplicationPropertyOfOtherEnergyConsumer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfOtherEnergyConsumer");
    private final static QName _OtherEnergyDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "OtherEnergyDistribution");
    private final static QName __GenericApplicationPropertyOfOtherEnergyDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfOtherEnergyDistribution");
    private final static QName _OtherEnergyStorage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "OtherEnergyStorage");
    private final static QName __GenericApplicationPropertyOfOtherEnergyStorage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfOtherEnergyStorage");
    private final static QName _PhotovoltaicSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "PhotovoltaicSystem");
    private final static QName _PhotovoltaicThermalSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "PhotovoltaicThermalSystem");
    private final static QName _PowerDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "PowerDistribution");
    private final static QName _PowerStorage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "PowerStorage");
    private final static QName _SolarThermalSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "SolarThermalSystem");
    private final static QName _SupplyTemperatureControl_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "SupplyTemperatureControl");
    private final static QName _ThermalDistribution_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalDistribution");
    private final static QName _ThermalDistributionPump_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalDistributionPump");
    private final static QName _ThermalStorage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ThermalStorage");
    private final static QName _Absorptance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Absorptance");
    private final static QName _AbstractConstruction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractConstruction");
    private final static QName _AbstractMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractMaterial");
    private final static QName _Construction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Construction");
    private final static QName _Emissivity_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Emissivity");
    private final static QName _Gas_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Gas");
    private final static QName _ImageTexture_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ImageTexture");
    private final static QName _Layer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Layer");
    private final static QName _LayerComponent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "LayerComponent");
    private final static QName _OpticalProperties_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "OpticalProperties");
    private final static QName _Reflectance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Reflectance");
    private final static QName _ReverseConstruction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ReverseConstruction");
    private final static QName _SolidMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "SolidMaterial");
    private final static QName _Transmittance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Transmittance");
    private final static QName _BuildingUnit_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "BuildingUnit");
    private final static QName _DHWFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "DHWFacilities");
    private final static QName _Facilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Facilities");
    private final static QName _ElectricalAppliances_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ElectricalAppliances");
    private final static QName _GenericFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "GenericFacilities");
    private final static QName _Household_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Household");
    private final static QName _LightingFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "LightingFacilities");
    private final static QName _Occupants_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "Occupants");
    private final static QName _UsageZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "UsageZone");
    private final static QName _VentilationControl_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "VentilationControl");
    private final static QName _AbstractSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractSchedule");
    private final static QName _AbstractTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractTimeSeries");
    private final static QName _AbstractTimeSeriesFile_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "AbstractTimeSeriesFile");
    private final static QName _ConstantValueSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "ConstantValueSchedule");
    private final static QName _DailyPatternSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "DailyPatternSchedule");
    private final static QName _DailySchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "DailySchedule");
    private final static QName _DualValueSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "DualValueSchedule");
    private final static QName _IrregularTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "IrregularTimeSeries");
    private final static QName _IrregularTimeSeriesFile_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "IrregularTimeSeriesFile");
    private final static QName _MeasurementPoint_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "MeasurementPoint");
    private final static QName _MonthlyTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "MonthlyTimeSeries");
    private final static QName _PeriodOfYear_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "PeriodOfYear");
    private final static QName _RegularTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "RegularTimeSeries");
    private final static QName _RegularTimeSeriesFile_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "RegularTimeSeriesFile");
    private final static QName _TimeSeriesSchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "TimeSeriesSchedule");
    private final static QName _TimeValuesProperties_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "TimeValuesProperties");
    private final static QName _WeatherStation_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "WeatherStation");
    private final static QName __GenericApplicationPropertyOfWeatherStation_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/2.0", "_GenericApplicationPropertyOfWeatherStation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sig3d.citygml._2.energy._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnergyPerformanceCertificationPropertyType }
     * 
     */
    public EnergyPerformanceCertificationPropertyType createEnergyPerformanceCertificationPropertyType() {
        return new EnergyPerformanceCertificationPropertyType();
    }

    /**
     * Create an instance of {@link VolumeTypePropertyType }
     * 
     */
    public VolumeTypePropertyType createVolumeTypePropertyType() {
        return new VolumeTypePropertyType();
    }

    /**
     * Create an instance of {@link RefurbishmentMeasurePropertyType }
     * 
     */
    public RefurbishmentMeasurePropertyType createRefurbishmentMeasurePropertyType() {
        return new RefurbishmentMeasurePropertyType();
    }

    /**
     * Create an instance of {@link ThermalZonePropertyType }
     * 
     */
    public ThermalZonePropertyType createThermalZonePropertyType() {
        return new ThermalZonePropertyType();
    }

    /**
     * Create an instance of {@link UsageZonePropertyType }
     * 
     */
    public UsageZonePropertyType createUsageZonePropertyType() {
        return new UsageZonePropertyType();
    }

    /**
     * Create an instance of {@link FloorAreaPropertyType }
     * 
     */
    public FloorAreaPropertyType createFloorAreaPropertyType() {
        return new FloorAreaPropertyType();
    }

    /**
     * Create an instance of {@link HeightAboveGroundPropertyType }
     * 
     */
    public HeightAboveGroundPropertyType createHeightAboveGroundPropertyType() {
        return new HeightAboveGroundPropertyType();
    }

    /**
     * Create an instance of {@link AbstractConstructionPropertyType }
     * 
     */
    public AbstractConstructionPropertyType createAbstractConstructionPropertyType() {
        return new AbstractConstructionPropertyType();
    }

    /**
     * Create an instance of {@link EnergySystemPropertyType }
     * 
     */
    public EnergySystemPropertyType createEnergySystemPropertyType() {
        return new EnergySystemPropertyType();
    }

    /**
     * Create an instance of {@link WeatherDataPropertyType }
     * 
     */
    public WeatherDataPropertyType createWeatherDataPropertyType() {
        return new WeatherDataPropertyType();
    }

    /**
     * Create an instance of {@link EnergyDemandPropertyType }
     * 
     */
    public EnergyDemandPropertyType createEnergyDemandPropertyType() {
        return new EnergyDemandPropertyType();
    }

    /**
     * Create an instance of {@link DateOfEventType }
     * 
     */
    public DateOfEventType createDateOfEventType() {
        return new DateOfEventType();
    }

    /**
     * Create an instance of {@link EnergyDemandType }
     * 
     */
    public EnergyDemandType createEnergyDemandType() {
        return new EnergyDemandType();
    }

    /**
     * Create an instance of {@link EnergyPerformanceCertificationType }
     * 
     */
    public EnergyPerformanceCertificationType createEnergyPerformanceCertificationType() {
        return new EnergyPerformanceCertificationType();
    }

    /**
     * Create an instance of {@link FloorAreaType }
     * 
     */
    public FloorAreaType createFloorAreaType() {
        return new FloorAreaType();
    }

    /**
     * Create an instance of {@link HeatExchangeTypeType }
     * 
     */
    public HeatExchangeTypeType createHeatExchangeTypeType() {
        return new HeatExchangeTypeType();
    }

    /**
     * Create an instance of {@link HeightAboveGroundType }
     * 
     */
    public HeightAboveGroundType createHeightAboveGroundType() {
        return new HeightAboveGroundType();
    }

    /**
     * Create an instance of {@link RefurbishmentMeasureType }
     * 
     */
    public RefurbishmentMeasureType createRefurbishmentMeasureType() {
        return new RefurbishmentMeasureType();
    }

    /**
     * Create an instance of {@link ServiceLifeType }
     * 
     */
    public ServiceLifeType createServiceLifeType() {
        return new ServiceLifeType();
    }

    /**
     * Create an instance of {@link VolumeTypeType }
     * 
     */
    public VolumeTypeType createVolumeTypeType() {
        return new VolumeTypeType();
    }

    /**
     * Create an instance of {@link WeatherDataType }
     * 
     */
    public WeatherDataType createWeatherDataType() {
        return new WeatherDataType();
    }

    /**
     * Create an instance of {@link WindowShadingType }
     * 
     */
    public WindowShadingType createWindowShadingType() {
        return new WindowShadingType();
    }

    /**
     * Create an instance of {@link ThermalBoundaryType }
     * 
     */
    public ThermalBoundaryType createThermalBoundaryType() {
        return new ThermalBoundaryType();
    }

    /**
     * Create an instance of {@link ThermalOpeningType }
     * 
     */
    public ThermalOpeningType createThermalOpeningType() {
        return new ThermalOpeningType();
    }

    /**
     * Create an instance of {@link ThermalZoneType }
     * 
     */
    public ThermalZoneType createThermalZoneType() {
        return new ThermalZoneType();
    }

    /**
     * Create an instance of {@link AirCompressorType }
     * 
     */
    public AirCompressorType createAirCompressorType() {
        return new AirCompressorType();
    }

    /**
     * Create an instance of {@link BoilerType }
     * 
     */
    public BoilerType createBoilerType() {
        return new BoilerType();
    }

    /**
     * Create an instance of {@link ChillerType }
     * 
     */
    public ChillerType createChillerType() {
        return new ChillerType();
    }

    /**
     * Create an instance of {@link CombinedHeatPowerType }
     * 
     */
    public CombinedHeatPowerType createCombinedHeatPowerType() {
        return new CombinedHeatPowerType();
    }

    /**
     * Create an instance of {@link ElectricalResistanceType }
     * 
     */
    public ElectricalResistanceType createElectricalResistanceType() {
        return new ElectricalResistanceType();
    }

    /**
     * Create an instance of {@link EmitterType }
     * 
     */
    public EmitterType createEmitterType() {
        return new EmitterType();
    }

    /**
     * Create an instance of {@link EnergyFlowType }
     * 
     */
    public EnergyFlowType createEnergyFlowType() {
        return new EnergyFlowType();
    }

    /**
     * Create an instance of {@link EnergySourceType }
     * 
     */
    public EnergySourceType createEnergySourceType() {
        return new EnergySourceType();
    }

    /**
     * Create an instance of {@link EnergySystemType }
     * 
     */
    public EnergySystemType createEnergySystemType() {
        return new EnergySystemType();
    }

    /**
     * Create an instance of {@link GasDistributionType }
     * 
     */
    public GasDistributionType createGasDistributionType() {
        return new GasDistributionType();
    }

    /**
     * Create an instance of {@link GenericConversionSystemType }
     * 
     */
    public GenericConversionSystemType createGenericConversionSystemType() {
        return new GenericConversionSystemType();
    }

    /**
     * Create an instance of {@link HeatExchangerType }
     * 
     */
    public HeatExchangerType createHeatExchangerType() {
        return new HeatExchangerType();
    }

    /**
     * Create an instance of {@link HeatPumpType }
     * 
     */
    public HeatPumpType createHeatPumpType() {
        return new HeatPumpType();
    }

    /**
     * Create an instance of {@link MechanicalVentilationType }
     * 
     */
    public MechanicalVentilationType createMechanicalVentilationType() {
        return new MechanicalVentilationType();
    }

    /**
     * Create an instance of {@link OperationScheduleType }
     * 
     */
    public OperationScheduleType createOperationScheduleType() {
        return new OperationScheduleType();
    }

    /**
     * Create an instance of {@link OtherEnergyConsumerType }
     * 
     */
    public OtherEnergyConsumerType createOtherEnergyConsumerType() {
        return new OtherEnergyConsumerType();
    }

    /**
     * Create an instance of {@link OtherEnergyDistributionType }
     * 
     */
    public OtherEnergyDistributionType createOtherEnergyDistributionType() {
        return new OtherEnergyDistributionType();
    }

    /**
     * Create an instance of {@link OtherEnergyStorageType }
     * 
     */
    public OtherEnergyStorageType createOtherEnergyStorageType() {
        return new OtherEnergyStorageType();
    }

    /**
     * Create an instance of {@link PhotovoltaicSystemType }
     * 
     */
    public PhotovoltaicSystemType createPhotovoltaicSystemType() {
        return new PhotovoltaicSystemType();
    }

    /**
     * Create an instance of {@link PhotovoltaicThermalSystemType }
     * 
     */
    public PhotovoltaicThermalSystemType createPhotovoltaicThermalSystemType() {
        return new PhotovoltaicThermalSystemType();
    }

    /**
     * Create an instance of {@link PowerDistributionType }
     * 
     */
    public PowerDistributionType createPowerDistributionType() {
        return new PowerDistributionType();
    }

    /**
     * Create an instance of {@link PowerStorageType }
     * 
     */
    public PowerStorageType createPowerStorageType() {
        return new PowerStorageType();
    }

    /**
     * Create an instance of {@link SolarThermalSystemType }
     * 
     */
    public SolarThermalSystemType createSolarThermalSystemType() {
        return new SolarThermalSystemType();
    }

    /**
     * Create an instance of {@link SupplyTemperatureControlType }
     * 
     */
    public SupplyTemperatureControlType createSupplyTemperatureControlType() {
        return new SupplyTemperatureControlType();
    }

    /**
     * Create an instance of {@link ThermalDistributionType }
     * 
     */
    public ThermalDistributionType createThermalDistributionType() {
        return new ThermalDistributionType();
    }

    /**
     * Create an instance of {@link ThermalDistributionPumpType }
     * 
     */
    public ThermalDistributionPumpType createThermalDistributionPumpType() {
        return new ThermalDistributionPumpType();
    }

    /**
     * Create an instance of {@link ThermalStorageType }
     * 
     */
    public ThermalStorageType createThermalStorageType() {
        return new ThermalStorageType();
    }

    /**
     * Create an instance of {@link AbsorptanceType }
     * 
     */
    public AbsorptanceType createAbsorptanceType() {
        return new AbsorptanceType();
    }

    /**
     * Create an instance of {@link AbstractConstructionType }
     * 
     */
    public AbstractConstructionType createAbstractConstructionType() {
        return new AbstractConstructionType();
    }

    /**
     * Create an instance of {@link ConstructionType }
     * 
     */
    public ConstructionType createConstructionType() {
        return new ConstructionType();
    }

    /**
     * Create an instance of {@link EmissivityType }
     * 
     */
    public EmissivityType createEmissivityType() {
        return new EmissivityType();
    }

    /**
     * Create an instance of {@link GasType }
     * 
     */
    public GasType createGasType() {
        return new GasType();
    }

    /**
     * Create an instance of {@link ImageTextureType }
     * 
     */
    public ImageTextureType createImageTextureType() {
        return new ImageTextureType();
    }

    /**
     * Create an instance of {@link LayerType }
     * 
     */
    public LayerType createLayerType() {
        return new LayerType();
    }

    /**
     * Create an instance of {@link LayerComponentType }
     * 
     */
    public LayerComponentType createLayerComponentType() {
        return new LayerComponentType();
    }

    /**
     * Create an instance of {@link OpticalPropertiesType }
     * 
     */
    public OpticalPropertiesType createOpticalPropertiesType() {
        return new OpticalPropertiesType();
    }

    /**
     * Create an instance of {@link ReflectanceType }
     * 
     */
    public ReflectanceType createReflectanceType() {
        return new ReflectanceType();
    }

    /**
     * Create an instance of {@link ReverseConstructionType }
     * 
     */
    public ReverseConstructionType createReverseConstructionType() {
        return new ReverseConstructionType();
    }

    /**
     * Create an instance of {@link SolidMaterialType }
     * 
     */
    public SolidMaterialType createSolidMaterialType() {
        return new SolidMaterialType();
    }

    /**
     * Create an instance of {@link TransmittanceType }
     * 
     */
    public TransmittanceType createTransmittanceType() {
        return new TransmittanceType();
    }

    /**
     * Create an instance of {@link BuildingUnitType }
     * 
     */
    public BuildingUnitType createBuildingUnitType() {
        return new BuildingUnitType();
    }

    /**
     * Create an instance of {@link DHWFacilitiesType }
     * 
     */
    public DHWFacilitiesType createDHWFacilitiesType() {
        return new DHWFacilitiesType();
    }

    /**
     * Create an instance of {@link ElectricalAppliancesType }
     * 
     */
    public ElectricalAppliancesType createElectricalAppliancesType() {
        return new ElectricalAppliancesType();
    }

    /**
     * Create an instance of {@link GenericFacilitiesType }
     * 
     */
    public GenericFacilitiesType createGenericFacilitiesType() {
        return new GenericFacilitiesType();
    }

    /**
     * Create an instance of {@link HouseholdType }
     * 
     */
    public HouseholdType createHouseholdType() {
        return new HouseholdType();
    }

    /**
     * Create an instance of {@link LightingFacilitiesType }
     * 
     */
    public LightingFacilitiesType createLightingFacilitiesType() {
        return new LightingFacilitiesType();
    }

    /**
     * Create an instance of {@link OccupantsType }
     * 
     */
    public OccupantsType createOccupantsType() {
        return new OccupantsType();
    }

    /**
     * Create an instance of {@link UsageZoneType }
     * 
     */
    public UsageZoneType createUsageZoneType() {
        return new UsageZoneType();
    }

    /**
     * Create an instance of {@link VentilationControlType }
     * 
     */
    public VentilationControlType createVentilationControlType() {
        return new VentilationControlType();
    }

    /**
     * Create an instance of {@link ConstantValueScheduleType }
     * 
     */
    public ConstantValueScheduleType createConstantValueScheduleType() {
        return new ConstantValueScheduleType();
    }

    /**
     * Create an instance of {@link DailyPatternScheduleType }
     * 
     */
    public DailyPatternScheduleType createDailyPatternScheduleType() {
        return new DailyPatternScheduleType();
    }

    /**
     * Create an instance of {@link DailyScheduleType }
     * 
     */
    public DailyScheduleType createDailyScheduleType() {
        return new DailyScheduleType();
    }

    /**
     * Create an instance of {@link DualValueScheduleType }
     * 
     */
    public DualValueScheduleType createDualValueScheduleType() {
        return new DualValueScheduleType();
    }

    /**
     * Create an instance of {@link IrregularTimeSeriesType }
     * 
     */
    public IrregularTimeSeriesType createIrregularTimeSeriesType() {
        return new IrregularTimeSeriesType();
    }

    /**
     * Create an instance of {@link IrregularTimeSeriesFileType }
     * 
     */
    public IrregularTimeSeriesFileType createIrregularTimeSeriesFileType() {
        return new IrregularTimeSeriesFileType();
    }

    /**
     * Create an instance of {@link MeasurementPointType }
     * 
     */
    public MeasurementPointType createMeasurementPointType() {
        return new MeasurementPointType();
    }

    /**
     * Create an instance of {@link MonthlyTimeSeriesType }
     * 
     */
    public MonthlyTimeSeriesType createMonthlyTimeSeriesType() {
        return new MonthlyTimeSeriesType();
    }

    /**
     * Create an instance of {@link PeriodOfYearType }
     * 
     */
    public PeriodOfYearType createPeriodOfYearType() {
        return new PeriodOfYearType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesType }
     * 
     */
    public RegularTimeSeriesType createRegularTimeSeriesType() {
        return new RegularTimeSeriesType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesFileType }
     * 
     */
    public RegularTimeSeriesFileType createRegularTimeSeriesFileType() {
        return new RegularTimeSeriesFileType();
    }

    /**
     * Create an instance of {@link TimeSeriesScheduleType }
     * 
     */
    public TimeSeriesScheduleType createTimeSeriesScheduleType() {
        return new TimeSeriesScheduleType();
    }

    /**
     * Create an instance of {@link TimeValuesPropertiesType }
     * 
     */
    public TimeValuesPropertiesType createTimeValuesPropertiesType() {
        return new TimeValuesPropertiesType();
    }

    /**
     * Create an instance of {@link WeatherStationType }
     * 
     */
    public WeatherStationType createWeatherStationType() {
        return new WeatherStationType();
    }

    /**
     * Create an instance of {@link DateOfEventPropertyType }
     * 
     */
    public DateOfEventPropertyType createDateOfEventPropertyType() {
        return new DateOfEventPropertyType();
    }

    /**
     * Create an instance of {@link HeatExchangeTypePropertyType }
     * 
     */
    public HeatExchangeTypePropertyType createHeatExchangeTypePropertyType() {
        return new HeatExchangeTypePropertyType();
    }

    /**
     * Create an instance of {@link ServiceLifePropertyType }
     * 
     */
    public ServiceLifePropertyType createServiceLifePropertyType() {
        return new ServiceLifePropertyType();
    }

    /**
     * Create an instance of {@link WindowShadingPropertyType }
     * 
     */
    public WindowShadingPropertyType createWindowShadingPropertyType() {
        return new WindowShadingPropertyType();
    }

    /**
     * Create an instance of {@link ThermalBoundaryPropertyType }
     * 
     */
    public ThermalBoundaryPropertyType createThermalBoundaryPropertyType() {
        return new ThermalBoundaryPropertyType();
    }

    /**
     * Create an instance of {@link ThermalOpeningPropertyType }
     * 
     */
    public ThermalOpeningPropertyType createThermalOpeningPropertyType() {
        return new ThermalOpeningPropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemComponentPropertyType }
     * 
     */
    public AbstractEnergySystemComponentPropertyType createAbstractEnergySystemComponentPropertyType() {
        return new AbstractEnergySystemComponentPropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemConsumerPropertyType }
     * 
     */
    public AbstractEnergySystemConsumerPropertyType createAbstractEnergySystemConsumerPropertyType() {
        return new AbstractEnergySystemConsumerPropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemConversionPropertyType }
     * 
     */
    public AbstractEnergySystemConversionPropertyType createAbstractEnergySystemConversionPropertyType() {
        return new AbstractEnergySystemConversionPropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemDistributionPropertyType }
     * 
     */
    public AbstractEnergySystemDistributionPropertyType createAbstractEnergySystemDistributionPropertyType() {
        return new AbstractEnergySystemDistributionPropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemSourcePropertyType }
     * 
     */
    public AbstractEnergySystemSourcePropertyType createAbstractEnergySystemSourcePropertyType() {
        return new AbstractEnergySystemSourcePropertyType();
    }

    /**
     * Create an instance of {@link AbstractEnergySystemStoragePropertyType }
     * 
     */
    public AbstractEnergySystemStoragePropertyType createAbstractEnergySystemStoragePropertyType() {
        return new AbstractEnergySystemStoragePropertyType();
    }

    /**
     * Create an instance of {@link AbstractSolarEnergySystemPropertyType }
     * 
     */
    public AbstractSolarEnergySystemPropertyType createAbstractSolarEnergySystemPropertyType() {
        return new AbstractSolarEnergySystemPropertyType();
    }

    /**
     * Create an instance of {@link AirCompressorPropertyType }
     * 
     */
    public AirCompressorPropertyType createAirCompressorPropertyType() {
        return new AirCompressorPropertyType();
    }

    /**
     * Create an instance of {@link BoilerPropertyType }
     * 
     */
    public BoilerPropertyType createBoilerPropertyType() {
        return new BoilerPropertyType();
    }

    /**
     * Create an instance of {@link ChillerPropertyType }
     * 
     */
    public ChillerPropertyType createChillerPropertyType() {
        return new ChillerPropertyType();
    }

    /**
     * Create an instance of {@link CombinedHeatPowerPropertyType }
     * 
     */
    public CombinedHeatPowerPropertyType createCombinedHeatPowerPropertyType() {
        return new CombinedHeatPowerPropertyType();
    }

    /**
     * Create an instance of {@link ElectricalResistancePropertyType }
     * 
     */
    public ElectricalResistancePropertyType createElectricalResistancePropertyType() {
        return new ElectricalResistancePropertyType();
    }

    /**
     * Create an instance of {@link EmitterPropertyType }
     * 
     */
    public EmitterPropertyType createEmitterPropertyType() {
        return new EmitterPropertyType();
    }

    /**
     * Create an instance of {@link EnergyFlowPropertyType }
     * 
     */
    public EnergyFlowPropertyType createEnergyFlowPropertyType() {
        return new EnergyFlowPropertyType();
    }

    /**
     * Create an instance of {@link EnergySourcePropertyType }
     * 
     */
    public EnergySourcePropertyType createEnergySourcePropertyType() {
        return new EnergySourcePropertyType();
    }

    /**
     * Create an instance of {@link GasDistributionPropertyType }
     * 
     */
    public GasDistributionPropertyType createGasDistributionPropertyType() {
        return new GasDistributionPropertyType();
    }

    /**
     * Create an instance of {@link GenericConversionSystemPropertyType }
     * 
     */
    public GenericConversionSystemPropertyType createGenericConversionSystemPropertyType() {
        return new GenericConversionSystemPropertyType();
    }

    /**
     * Create an instance of {@link HeatExchangerPropertyType }
     * 
     */
    public HeatExchangerPropertyType createHeatExchangerPropertyType() {
        return new HeatExchangerPropertyType();
    }

    /**
     * Create an instance of {@link HeatPumpPropertyType }
     * 
     */
    public HeatPumpPropertyType createHeatPumpPropertyType() {
        return new HeatPumpPropertyType();
    }

    /**
     * Create an instance of {@link MechanicalVentilationPropertyType }
     * 
     */
    public MechanicalVentilationPropertyType createMechanicalVentilationPropertyType() {
        return new MechanicalVentilationPropertyType();
    }

    /**
     * Create an instance of {@link OperationSchedulePropertyType }
     * 
     */
    public OperationSchedulePropertyType createOperationSchedulePropertyType() {
        return new OperationSchedulePropertyType();
    }

    /**
     * Create an instance of {@link OtherEnergyConsumerPropertyType }
     * 
     */
    public OtherEnergyConsumerPropertyType createOtherEnergyConsumerPropertyType() {
        return new OtherEnergyConsumerPropertyType();
    }

    /**
     * Create an instance of {@link OtherEnergyDistributionPropertyType }
     * 
     */
    public OtherEnergyDistributionPropertyType createOtherEnergyDistributionPropertyType() {
        return new OtherEnergyDistributionPropertyType();
    }

    /**
     * Create an instance of {@link OtherEnergyStoragePropertyType }
     * 
     */
    public OtherEnergyStoragePropertyType createOtherEnergyStoragePropertyType() {
        return new OtherEnergyStoragePropertyType();
    }

    /**
     * Create an instance of {@link PhotovoltaicSystemPropertyType }
     * 
     */
    public PhotovoltaicSystemPropertyType createPhotovoltaicSystemPropertyType() {
        return new PhotovoltaicSystemPropertyType();
    }

    /**
     * Create an instance of {@link PhotovoltaicThermalSystemPropertyType }
     * 
     */
    public PhotovoltaicThermalSystemPropertyType createPhotovoltaicThermalSystemPropertyType() {
        return new PhotovoltaicThermalSystemPropertyType();
    }

    /**
     * Create an instance of {@link PowerDistributionPropertyType }
     * 
     */
    public PowerDistributionPropertyType createPowerDistributionPropertyType() {
        return new PowerDistributionPropertyType();
    }

    /**
     * Create an instance of {@link PowerStoragePropertyType }
     * 
     */
    public PowerStoragePropertyType createPowerStoragePropertyType() {
        return new PowerStoragePropertyType();
    }

    /**
     * Create an instance of {@link SolarThermalSystemPropertyType }
     * 
     */
    public SolarThermalSystemPropertyType createSolarThermalSystemPropertyType() {
        return new SolarThermalSystemPropertyType();
    }

    /**
     * Create an instance of {@link SupplyTemperatureControlPropertyType }
     * 
     */
    public SupplyTemperatureControlPropertyType createSupplyTemperatureControlPropertyType() {
        return new SupplyTemperatureControlPropertyType();
    }

    /**
     * Create an instance of {@link ThermalDistributionPropertyType }
     * 
     */
    public ThermalDistributionPropertyType createThermalDistributionPropertyType() {
        return new ThermalDistributionPropertyType();
    }

    /**
     * Create an instance of {@link ThermalDistributionPumpPropertyType }
     * 
     */
    public ThermalDistributionPumpPropertyType createThermalDistributionPumpPropertyType() {
        return new ThermalDistributionPumpPropertyType();
    }

    /**
     * Create an instance of {@link ThermalStoragePropertyType }
     * 
     */
    public ThermalStoragePropertyType createThermalStoragePropertyType() {
        return new ThermalStoragePropertyType();
    }

    /**
     * Create an instance of {@link AbsorptancePropertyType }
     * 
     */
    public AbsorptancePropertyType createAbsorptancePropertyType() {
        return new AbsorptancePropertyType();
    }

    /**
     * Create an instance of {@link AbstractMaterialPropertyType }
     * 
     */
    public AbstractMaterialPropertyType createAbstractMaterialPropertyType() {
        return new AbstractMaterialPropertyType();
    }

    /**
     * Create an instance of {@link ConstructionPropertyType }
     * 
     */
    public ConstructionPropertyType createConstructionPropertyType() {
        return new ConstructionPropertyType();
    }

    /**
     * Create an instance of {@link EmissivityPropertyType }
     * 
     */
    public EmissivityPropertyType createEmissivityPropertyType() {
        return new EmissivityPropertyType();
    }

    /**
     * Create an instance of {@link GasPropertyType }
     * 
     */
    public GasPropertyType createGasPropertyType() {
        return new GasPropertyType();
    }

    /**
     * Create an instance of {@link ImageTexturePropertyType }
     * 
     */
    public ImageTexturePropertyType createImageTexturePropertyType() {
        return new ImageTexturePropertyType();
    }

    /**
     * Create an instance of {@link LayerPropertyType }
     * 
     */
    public LayerPropertyType createLayerPropertyType() {
        return new LayerPropertyType();
    }

    /**
     * Create an instance of {@link LayerComponentPropertyType }
     * 
     */
    public LayerComponentPropertyType createLayerComponentPropertyType() {
        return new LayerComponentPropertyType();
    }

    /**
     * Create an instance of {@link OpticalPropertiesPropertyType }
     * 
     */
    public OpticalPropertiesPropertyType createOpticalPropertiesPropertyType() {
        return new OpticalPropertiesPropertyType();
    }

    /**
     * Create an instance of {@link ReflectancePropertyType }
     * 
     */
    public ReflectancePropertyType createReflectancePropertyType() {
        return new ReflectancePropertyType();
    }

    /**
     * Create an instance of {@link ReverseConstructionPropertyType }
     * 
     */
    public ReverseConstructionPropertyType createReverseConstructionPropertyType() {
        return new ReverseConstructionPropertyType();
    }

    /**
     * Create an instance of {@link SolidMaterialPropertyType }
     * 
     */
    public SolidMaterialPropertyType createSolidMaterialPropertyType() {
        return new SolidMaterialPropertyType();
    }

    /**
     * Create an instance of {@link TransmittancePropertyType }
     * 
     */
    public TransmittancePropertyType createTransmittancePropertyType() {
        return new TransmittancePropertyType();
    }

    /**
     * Create an instance of {@link BuildingUnitPropertyType }
     * 
     */
    public BuildingUnitPropertyType createBuildingUnitPropertyType() {
        return new BuildingUnitPropertyType();
    }

    /**
     * Create an instance of {@link DHWFacilitiesPropertyType }
     * 
     */
    public DHWFacilitiesPropertyType createDHWFacilitiesPropertyType() {
        return new DHWFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link ElectricalAppliancesPropertyType }
     * 
     */
    public ElectricalAppliancesPropertyType createElectricalAppliancesPropertyType() {
        return new ElectricalAppliancesPropertyType();
    }

    /**
     * Create an instance of {@link FacilitiesPropertyType }
     * 
     */
    public FacilitiesPropertyType createFacilitiesPropertyType() {
        return new FacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link GenericFacilitiesPropertyType }
     * 
     */
    public GenericFacilitiesPropertyType createGenericFacilitiesPropertyType() {
        return new GenericFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link HouseholdPropertyType }
     * 
     */
    public HouseholdPropertyType createHouseholdPropertyType() {
        return new HouseholdPropertyType();
    }

    /**
     * Create an instance of {@link LightingFacilitiesPropertyType }
     * 
     */
    public LightingFacilitiesPropertyType createLightingFacilitiesPropertyType() {
        return new LightingFacilitiesPropertyType();
    }

    /**
     * Create an instance of {@link OccupantsPropertyType }
     * 
     */
    public OccupantsPropertyType createOccupantsPropertyType() {
        return new OccupantsPropertyType();
    }

    /**
     * Create an instance of {@link VentilationControlPropertyType }
     * 
     */
    public VentilationControlPropertyType createVentilationControlPropertyType() {
        return new VentilationControlPropertyType();
    }

    /**
     * Create an instance of {@link AbstractSchedulePropertyType }
     * 
     */
    public AbstractSchedulePropertyType createAbstractSchedulePropertyType() {
        return new AbstractSchedulePropertyType();
    }

    /**
     * Create an instance of {@link AbstractTimeSeriesPropertyType }
     * 
     */
    public AbstractTimeSeriesPropertyType createAbstractTimeSeriesPropertyType() {
        return new AbstractTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link AbstractTimeSeriesFilePropertyType }
     * 
     */
    public AbstractTimeSeriesFilePropertyType createAbstractTimeSeriesFilePropertyType() {
        return new AbstractTimeSeriesFilePropertyType();
    }

    /**
     * Create an instance of {@link ConstantValueSchedulePropertyType }
     * 
     */
    public ConstantValueSchedulePropertyType createConstantValueSchedulePropertyType() {
        return new ConstantValueSchedulePropertyType();
    }

    /**
     * Create an instance of {@link DailyPatternSchedulePropertyType }
     * 
     */
    public DailyPatternSchedulePropertyType createDailyPatternSchedulePropertyType() {
        return new DailyPatternSchedulePropertyType();
    }

    /**
     * Create an instance of {@link DailySchedulePropertyType }
     * 
     */
    public DailySchedulePropertyType createDailySchedulePropertyType() {
        return new DailySchedulePropertyType();
    }

    /**
     * Create an instance of {@link DualValueSchedulePropertyType }
     * 
     */
    public DualValueSchedulePropertyType createDualValueSchedulePropertyType() {
        return new DualValueSchedulePropertyType();
    }

    /**
     * Create an instance of {@link IrregularTimeSeriesPropertyType }
     * 
     */
    public IrregularTimeSeriesPropertyType createIrregularTimeSeriesPropertyType() {
        return new IrregularTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link IrregularTimeSeriesFilePropertyType }
     * 
     */
    public IrregularTimeSeriesFilePropertyType createIrregularTimeSeriesFilePropertyType() {
        return new IrregularTimeSeriesFilePropertyType();
    }

    /**
     * Create an instance of {@link MeasurementPointPropertyType }
     * 
     */
    public MeasurementPointPropertyType createMeasurementPointPropertyType() {
        return new MeasurementPointPropertyType();
    }

    /**
     * Create an instance of {@link MonthlyTimeSeriesPropertyType }
     * 
     */
    public MonthlyTimeSeriesPropertyType createMonthlyTimeSeriesPropertyType() {
        return new MonthlyTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link PeriodOfYearPropertyType }
     * 
     */
    public PeriodOfYearPropertyType createPeriodOfYearPropertyType() {
        return new PeriodOfYearPropertyType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesPropertyType }
     * 
     */
    public RegularTimeSeriesPropertyType createRegularTimeSeriesPropertyType() {
        return new RegularTimeSeriesPropertyType();
    }

    /**
     * Create an instance of {@link RegularTimeSeriesFilePropertyType }
     * 
     */
    public RegularTimeSeriesFilePropertyType createRegularTimeSeriesFilePropertyType() {
        return new RegularTimeSeriesFilePropertyType();
    }

    /**
     * Create an instance of {@link TimeSeriesSchedulePropertyType }
     * 
     */
    public TimeSeriesSchedulePropertyType createTimeSeriesSchedulePropertyType() {
        return new TimeSeriesSchedulePropertyType();
    }

    /**
     * Create an instance of {@link TimeValuesPropertiesPropertyType }
     * 
     */
    public TimeValuesPropertiesPropertyType createTimeValuesPropertiesPropertyType() {
        return new TimeValuesPropertiesPropertyType();
    }

    /**
     * Create an instance of {@link WeatherStationPropertyType }
     * 
     */
    public WeatherStationPropertyType createWeatherStationPropertyType() {
        return new WeatherStationPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "buildingType", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<CodeType> createBuildingType(CodeType value) {
        return new JAXBElement<CodeType>(_BuildingType_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionWeightValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionWeightValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "constructionWeight", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<ConstructionWeightValue> createConstructionWeight(ConstructionWeightValue value) {
        return new JAXBElement<ConstructionWeightValue>(_ConstructionWeight_QNAME, ConstructionWeightValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyPerformanceCertificationPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyPerformanceCertificationPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "energyPerformanceCertification", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<EnergyPerformanceCertificationPropertyType> createEnergyPerformanceCertificationProperty(EnergyPerformanceCertificationPropertyType value) {
        return new JAXBElement<EnergyPerformanceCertificationPropertyType>(_EnergyPerformanceCertificationProperty_QNAME, EnergyPerformanceCertificationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeTypePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumeTypePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "volume", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<VolumeTypePropertyType> createVolume(VolumeTypePropertyType value) {
        return new JAXBElement<VolumeTypePropertyType>(_Volume_QNAME, VolumeTypePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "isLandmarked", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<Boolean> createIsLandmarked(Boolean value) {
        return new JAXBElement<Boolean>(_IsLandmarked_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "referencePoint", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<PointPropertyType> createReferencePoint(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_ReferencePoint_QNAME, PointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefurbishmentMeasurePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefurbishmentMeasurePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "refurbishmentMeasure", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<RefurbishmentMeasurePropertyType> createRefurbishmentMeasureProperty(RefurbishmentMeasurePropertyType value) {
        return new JAXBElement<RefurbishmentMeasurePropertyType>(_RefurbishmentMeasureProperty_QNAME, RefurbishmentMeasurePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalZonePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalZonePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "thermalZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<ThermalZonePropertyType> createThermalZoneProperty(ThermalZonePropertyType value) {
        return new JAXBElement<ThermalZonePropertyType>(_ThermalZoneProperty_QNAME, ThermalZonePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageZonePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsageZonePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "usageZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<UsageZonePropertyType> createUsageZoneProperty(UsageZonePropertyType value) {
        return new JAXBElement<UsageZonePropertyType>(_UsageZoneProperty_QNAME, UsageZonePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorAreaPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloorAreaPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "floorArea", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<FloorAreaPropertyType> createFloorAreaProperty(FloorAreaPropertyType value) {
        return new JAXBElement<FloorAreaPropertyType>(_FloorAreaProperty_QNAME, FloorAreaPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "heightAboveGround", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<HeightAboveGroundPropertyType> createHeightAboveGroundProperty(HeightAboveGroundPropertyType value) {
        return new JAXBElement<HeightAboveGroundPropertyType>(_HeightAboveGroundProperty_QNAME, HeightAboveGroundPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConstructionPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractConstructionPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "aggregatedBuildingConstruction", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<AbstractConstructionPropertyType> createAggregatedBuildingConstruction(AbstractConstructionPropertyType value) {
        return new JAXBElement<AbstractConstructionPropertyType>(_AggregatedBuildingConstruction_QNAME, AbstractConstructionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergySystemPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergySystemPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "energySystem", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<EnergySystemPropertyType> createEnergySystemProperty(EnergySystemPropertyType value) {
        return new JAXBElement<EnergySystemPropertyType>(_EnergySystemProperty_QNAME, EnergySystemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherDataPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherDataPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "weatherData", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<WeatherDataPropertyType> createWeatherDataProperty(WeatherDataPropertyType value) {
        return new JAXBElement<WeatherDataPropertyType>(_WeatherDataProperty_QNAME, WeatherDataPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyDemandPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "demands", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<EnergyDemandPropertyType> createDemands(EnergyDemandPropertyType value) {
        return new JAXBElement<EnergyDemandPropertyType>(_Demands_QNAME, EnergyDemandPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateOfEventType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateOfEventType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "DateOfEvent")
    public JAXBElement<DateOfEventType> createDateOfEvent(DateOfEventType value) {
        return new JAXBElement<DateOfEventType>(_DateOfEvent_QNAME, DateOfEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyDemandType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "EnergyDemand", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<EnergyDemandType> createEnergyDemand(EnergyDemandType value) {
        return new JAXBElement<EnergyDemandType>(_EnergyDemand_QNAME, EnergyDemandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyPerformanceCertificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyPerformanceCertificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "EnergyPerformanceCertification")
    public JAXBElement<EnergyPerformanceCertificationType> createEnergyPerformanceCertification(EnergyPerformanceCertificationType value) {
        return new JAXBElement<EnergyPerformanceCertificationType>(_EnergyPerformanceCertification_QNAME, EnergyPerformanceCertificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorAreaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloorAreaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "FloorArea")
    public JAXBElement<FloorAreaType> createFloorArea(FloorAreaType value) {
        return new JAXBElement<FloorAreaType>(_FloorArea_QNAME, FloorAreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "HeatExchangeType")
    public JAXBElement<HeatExchangeTypeType> createHeatExchangeType(HeatExchangeTypeType value) {
        return new JAXBElement<HeatExchangeTypeType>(_HeatExchangeType_QNAME, HeatExchangeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeightAboveGroundType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "HeightAboveGround")
    public JAXBElement<HeightAboveGroundType> createHeightAboveGround(HeightAboveGroundType value) {
        return new JAXBElement<HeightAboveGroundType>(_HeightAboveGround_QNAME, HeightAboveGroundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfHeightAboveGround")
    public JAXBElement<Object> create_GenericApplicationPropertyOfHeightAboveGround(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfHeightAboveGround_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefurbishmentMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefurbishmentMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "RefurbishmentMeasure")
    public JAXBElement<RefurbishmentMeasureType> createRefurbishmentMeasure(RefurbishmentMeasureType value) {
        return new JAXBElement<RefurbishmentMeasureType>(_RefurbishmentMeasure_QNAME, RefurbishmentMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLifeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceLifeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ServiceLife", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<ServiceLifeType> createServiceLife(ServiceLifeType value) {
        return new JAXBElement<ServiceLifeType>(_ServiceLife_QNAME, ServiceLifeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumeTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "VolumeType")
    public JAXBElement<VolumeTypeType> createVolumeType(VolumeTypeType value) {
        return new JAXBElement<VolumeTypeType>(_VolumeType_QNAME, VolumeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "WeatherData", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<WeatherDataType> createWeatherData(WeatherDataType value) {
        return new JAXBElement<WeatherDataType>(_WeatherData_QNAME, WeatherDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WindowShadingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WindowShadingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "WindowShading")
    public JAXBElement<WindowShadingType> createWindowShading(WindowShadingType value) {
        return new JAXBElement<WindowShadingType>(_WindowShading_QNAME, WindowShadingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalBoundaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalBoundaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalBoundary", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ThermalBoundaryType> createThermalBoundary(ThermalBoundaryType value) {
        return new JAXBElement<ThermalBoundaryType>(_ThermalBoundary_QNAME, ThermalBoundaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalOpeningType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalOpeningType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalOpening", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ThermalOpeningType> createThermalOpening(ThermalOpeningType value) {
        return new JAXBElement<ThermalOpeningType>(_ThermalOpening_QNAME, ThermalOpeningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ThermalZoneType> createThermalZone(ThermalZoneType value) {
        return new JAXBElement<ThermalZoneType>(_ThermalZone_QNAME, ThermalZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemComponentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemComponentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemComponent", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<AbstractEnergySystemComponentType> createAbstractEnergySystemComponent(AbstractEnergySystemComponentType value) {
        return new JAXBElement<AbstractEnergySystemComponentType>(_AbstractEnergySystemComponent_QNAME, AbstractEnergySystemComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemConsumerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemConsumerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemConsumer", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemComponent")
    public JAXBElement<AbstractEnergySystemConsumerType> createAbstractEnergySystemConsumer(AbstractEnergySystemConsumerType value) {
        return new JAXBElement<AbstractEnergySystemConsumerType>(_AbstractEnergySystemConsumer_QNAME, AbstractEnergySystemConsumerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfAbstractEnergySystemConsumer")
    public JAXBElement<Object> create_GenericApplicationPropertyOfAbstractEnergySystemConsumer(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfAbstractEnergySystemConsumer_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemConversionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemConversionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemConversion", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemComponent")
    public JAXBElement<AbstractEnergySystemConversionType> createAbstractEnergySystemConversion(AbstractEnergySystemConversionType value) {
        return new JAXBElement<AbstractEnergySystemConversionType>(_AbstractEnergySystemConversion_QNAME, AbstractEnergySystemConversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemDistributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemDistributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemDistribution", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemComponent")
    public JAXBElement<AbstractEnergySystemDistributionType> createAbstractEnergySystemDistribution(AbstractEnergySystemDistributionType value) {
        return new JAXBElement<AbstractEnergySystemDistributionType>(_AbstractEnergySystemDistribution_QNAME, AbstractEnergySystemDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemSourceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemSourceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemSource", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemComponent")
    public JAXBElement<AbstractEnergySystemSourceType> createAbstractEnergySystemSource(AbstractEnergySystemSourceType value) {
        return new JAXBElement<AbstractEnergySystemSourceType>(_AbstractEnergySystemSource_QNAME, AbstractEnergySystemSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemStorageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnergySystemStorageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractEnergySystemStorage", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemComponent")
    public JAXBElement<AbstractEnergySystemStorageType> createAbstractEnergySystemStorage(AbstractEnergySystemStorageType value) {
        return new JAXBElement<AbstractEnergySystemStorageType>(_AbstractEnergySystemStorage_QNAME, AbstractEnergySystemStorageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSolarEnergySystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractSolarEnergySystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractSolarEnergySystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<AbstractSolarEnergySystemType> createAbstractSolarEnergySystem(AbstractSolarEnergySystemType value) {
        return new JAXBElement<AbstractSolarEnergySystemType>(_AbstractSolarEnergySystem_QNAME, AbstractSolarEnergySystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirCompressorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirCompressorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AirCompressor", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<AirCompressorType> createAirCompressor(AirCompressorType value) {
        return new JAXBElement<AirCompressorType>(_AirCompressor_QNAME, AirCompressorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoilerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoilerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Boiler", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<BoilerType> createBoiler(BoilerType value) {
        return new JAXBElement<BoilerType>(_Boiler_QNAME, BoilerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChillerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChillerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Chiller", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<ChillerType> createChiller(ChillerType value) {
        return new JAXBElement<ChillerType>(_Chiller_QNAME, ChillerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinedHeatPowerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinedHeatPowerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "CombinedHeatPower", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<CombinedHeatPowerType> createCombinedHeatPower(CombinedHeatPowerType value) {
        return new JAXBElement<CombinedHeatPowerType>(_CombinedHeatPower_QNAME, CombinedHeatPowerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalResistanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalResistanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ElectricalResistance", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<ElectricalResistanceType> createElectricalResistance(ElectricalResistanceType value) {
        return new JAXBElement<ElectricalResistanceType>(_ElectricalResistance_QNAME, ElectricalResistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmitterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmitterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Emitter", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConsumer")
    public JAXBElement<EmitterType> createEmitter(EmitterType value) {
        return new JAXBElement<EmitterType>(_Emitter_QNAME, EmitterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyFlowType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergyFlowType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "EnergyFlow", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<EnergyFlowType> createEnergyFlow(EnergyFlowType value) {
        return new JAXBElement<EnergyFlowType>(_EnergyFlow_QNAME, EnergyFlowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergySourceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergySourceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "EnergySource", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemSource")
    public JAXBElement<EnergySourceType> createEnergySource(EnergySourceType value) {
        return new JAXBElement<EnergySourceType>(_EnergySource_QNAME, EnergySourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfEnergySource")
    public JAXBElement<Object> create_GenericApplicationPropertyOfEnergySource(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfEnergySource_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergySystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnergySystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "EnergySystem", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<EnergySystemType> createEnergySystem(EnergySystemType value) {
        return new JAXBElement<EnergySystemType>(_EnergySystem_QNAME, EnergySystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfEnergySystem")
    public JAXBElement<Object> create_GenericApplicationPropertyOfEnergySystem(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfEnergySystem_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GasDistributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GasDistributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "GasDistribution", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemDistribution")
    public JAXBElement<GasDistributionType> createGasDistribution(GasDistributionType value) {
        return new JAXBElement<GasDistributionType>(_GasDistribution_QNAME, GasDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericConversionSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenericConversionSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "GenericConversionSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<GenericConversionSystemType> createGenericConversionSystem(GenericConversionSystemType value) {
        return new JAXBElement<GenericConversionSystemType>(_GenericConversionSystem_QNAME, GenericConversionSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeatExchangerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeatExchangerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "HeatExchanger", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<HeatExchangerType> createHeatExchanger(HeatExchangerType value) {
        return new JAXBElement<HeatExchangerType>(_HeatExchanger_QNAME, HeatExchangerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeatPumpType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeatPumpType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "HeatPump", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<HeatPumpType> createHeatPump(HeatPumpType value) {
        return new JAXBElement<HeatPumpType>(_HeatPump_QNAME, HeatPumpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MechanicalVentilationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MechanicalVentilationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "MechanicalVentilation", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConversion")
    public JAXBElement<MechanicalVentilationType> createMechanicalVentilation(MechanicalVentilationType value) {
        return new JAXBElement<MechanicalVentilationType>(_MechanicalVentilation_QNAME, MechanicalVentilationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "OperationSchedule", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<OperationScheduleType> createOperationSchedule(OperationScheduleType value) {
        return new JAXBElement<OperationScheduleType>(_OperationSchedule_QNAME, OperationScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherEnergyConsumerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherEnergyConsumerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "OtherEnergyConsumer", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemConsumer")
    public JAXBElement<OtherEnergyConsumerType> createOtherEnergyConsumer(OtherEnergyConsumerType value) {
        return new JAXBElement<OtherEnergyConsumerType>(_OtherEnergyConsumer_QNAME, OtherEnergyConsumerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfOtherEnergyConsumer")
    public JAXBElement<Object> create_GenericApplicationPropertyOfOtherEnergyConsumer(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfOtherEnergyConsumer_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherEnergyDistributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherEnergyDistributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "OtherEnergyDistribution", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemDistribution")
    public JAXBElement<OtherEnergyDistributionType> createOtherEnergyDistribution(OtherEnergyDistributionType value) {
        return new JAXBElement<OtherEnergyDistributionType>(_OtherEnergyDistribution_QNAME, OtherEnergyDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfOtherEnergyDistribution")
    public JAXBElement<Object> create_GenericApplicationPropertyOfOtherEnergyDistribution(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfOtherEnergyDistribution_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherEnergyStorageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherEnergyStorageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "OtherEnergyStorage", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemStorage")
    public JAXBElement<OtherEnergyStorageType> createOtherEnergyStorage(OtherEnergyStorageType value) {
        return new JAXBElement<OtherEnergyStorageType>(_OtherEnergyStorage_QNAME, OtherEnergyStorageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfOtherEnergyStorage")
    public JAXBElement<Object> create_GenericApplicationPropertyOfOtherEnergyStorage(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfOtherEnergyStorage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotovoltaicSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotovoltaicSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "PhotovoltaicSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSolarEnergySystem")
    public JAXBElement<PhotovoltaicSystemType> createPhotovoltaicSystem(PhotovoltaicSystemType value) {
        return new JAXBElement<PhotovoltaicSystemType>(_PhotovoltaicSystem_QNAME, PhotovoltaicSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotovoltaicThermalSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotovoltaicThermalSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "PhotovoltaicThermalSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSolarEnergySystem")
    public JAXBElement<PhotovoltaicThermalSystemType> createPhotovoltaicThermalSystem(PhotovoltaicThermalSystemType value) {
        return new JAXBElement<PhotovoltaicThermalSystemType>(_PhotovoltaicThermalSystem_QNAME, PhotovoltaicThermalSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerDistributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerDistributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "PowerDistribution", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemDistribution")
    public JAXBElement<PowerDistributionType> createPowerDistribution(PowerDistributionType value) {
        return new JAXBElement<PowerDistributionType>(_PowerDistribution_QNAME, PowerDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerStorageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerStorageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "PowerStorage", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemStorage")
    public JAXBElement<PowerStorageType> createPowerStorage(PowerStorageType value) {
        return new JAXBElement<PowerStorageType>(_PowerStorage_QNAME, PowerStorageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarThermalSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolarThermalSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "SolarThermalSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSolarEnergySystem")
    public JAXBElement<SolarThermalSystemType> createSolarThermalSystem(SolarThermalSystemType value) {
        return new JAXBElement<SolarThermalSystemType>(_SolarThermalSystem_QNAME, SolarThermalSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyTemperatureControlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupplyTemperatureControlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "SupplyTemperatureControl")
    public JAXBElement<SupplyTemperatureControlType> createSupplyTemperatureControl(SupplyTemperatureControlType value) {
        return new JAXBElement<SupplyTemperatureControlType>(_SupplyTemperatureControl_QNAME, SupplyTemperatureControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalDistributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalDistributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalDistribution", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemDistribution")
    public JAXBElement<ThermalDistributionType> createThermalDistribution(ThermalDistributionType value) {
        return new JAXBElement<ThermalDistributionType>(_ThermalDistribution_QNAME, ThermalDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalDistributionPumpType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalDistributionPumpType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalDistributionPump", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<ThermalDistributionPumpType> createThermalDistributionPump(ThermalDistributionPumpType value) {
        return new JAXBElement<ThermalDistributionPumpType>(_ThermalDistributionPump_QNAME, ThermalDistributionPumpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalStorageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalStorageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ThermalStorage", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractEnergySystemStorage")
    public JAXBElement<ThermalStorageType> createThermalStorage(ThermalStorageType value) {
        return new JAXBElement<ThermalStorageType>(_ThermalStorage_QNAME, ThermalStorageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbsorptanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbsorptanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Absorptance")
    public JAXBElement<AbsorptanceType> createAbsorptance(AbsorptanceType value) {
        return new JAXBElement<AbsorptanceType>(_Absorptance_QNAME, AbsorptanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractConstruction", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<AbstractConstructionType> createAbstractConstruction(AbstractConstructionType value) {
        return new JAXBElement<AbstractConstructionType>(_AbstractConstruction_QNAME, AbstractConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMaterialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractMaterialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractMaterial", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<AbstractMaterialType> createAbstractMaterial(AbstractMaterialType value) {
        return new JAXBElement<AbstractMaterialType>(_AbstractMaterial_QNAME, AbstractMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Construction", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractConstruction")
    public JAXBElement<ConstructionType> createConstruction(ConstructionType value) {
        return new JAXBElement<ConstructionType>(_Construction_QNAME, ConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmissivityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmissivityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Emissivity")
    public JAXBElement<EmissivityType> createEmissivity(EmissivityType value) {
        return new JAXBElement<EmissivityType>(_Emissivity_QNAME, EmissivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GasType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GasType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Gas", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractMaterial")
    public JAXBElement<GasType> createGas(GasType value) {
        return new JAXBElement<GasType>(_Gas_QNAME, GasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageTextureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageTextureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ImageTexture", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<ImageTextureType> createImageTexture(ImageTextureType value) {
        return new JAXBElement<ImageTextureType>(_ImageTexture_QNAME, ImageTextureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Layer", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<LayerType> createLayer(LayerType value) {
        return new JAXBElement<LayerType>(_Layer_QNAME, LayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayerComponentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LayerComponentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "LayerComponent", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<LayerComponentType> createLayerComponent(LayerComponentType value) {
        return new JAXBElement<LayerComponentType>(_LayerComponent_QNAME, LayerComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpticalPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpticalPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "OpticalProperties")
    public JAXBElement<OpticalPropertiesType> createOpticalProperties(OpticalPropertiesType value) {
        return new JAXBElement<OpticalPropertiesType>(_OpticalProperties_QNAME, OpticalPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReflectanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReflectanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Reflectance")
    public JAXBElement<ReflectanceType> createReflectance(ReflectanceType value) {
        return new JAXBElement<ReflectanceType>(_Reflectance_QNAME, ReflectanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReverseConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ReverseConstruction", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractConstruction")
    public JAXBElement<ReverseConstructionType> createReverseConstruction(ReverseConstructionType value) {
        return new JAXBElement<ReverseConstructionType>(_ReverseConstruction_QNAME, ReverseConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidMaterialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidMaterialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "SolidMaterial", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractMaterial")
    public JAXBElement<SolidMaterialType> createSolidMaterial(SolidMaterialType value) {
        return new JAXBElement<SolidMaterialType>(_SolidMaterial_QNAME, SolidMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmittanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransmittanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Transmittance")
    public JAXBElement<TransmittanceType> createTransmittance(TransmittanceType value) {
        return new JAXBElement<TransmittanceType>(_Transmittance_QNAME, TransmittanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "BuildingUnit", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<BuildingUnitType> createBuildingUnit(BuildingUnitType value) {
        return new JAXBElement<BuildingUnitType>(_BuildingUnit_QNAME, BuildingUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DHWFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DHWFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "DHWFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "Facilities")
    public JAXBElement<DHWFacilitiesType> createDHWFacilities(DHWFacilitiesType value) {
        return new JAXBElement<DHWFacilitiesType>(_DHWFacilities_QNAME, DHWFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Facilities", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<FacilitiesType> createFacilities(FacilitiesType value) {
        return new JAXBElement<FacilitiesType>(_Facilities_QNAME, FacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalAppliancesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricalAppliancesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ElectricalAppliances", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "Facilities")
    public JAXBElement<ElectricalAppliancesType> createElectricalAppliances(ElectricalAppliancesType value) {
        return new JAXBElement<ElectricalAppliancesType>(_ElectricalAppliances_QNAME, ElectricalAppliancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenericFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "GenericFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "Facilities")
    public JAXBElement<GenericFacilitiesType> createGenericFacilities(GenericFacilitiesType value) {
        return new JAXBElement<GenericFacilitiesType>(_GenericFacilities_QNAME, GenericFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HouseholdType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Household", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<HouseholdType> createHousehold(HouseholdType value) {
        return new JAXBElement<HouseholdType>(_Household_QNAME, HouseholdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightingFacilitiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LightingFacilitiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "LightingFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "Facilities")
    public JAXBElement<LightingFacilitiesType> createLightingFacilities(LightingFacilitiesType value) {
        return new JAXBElement<LightingFacilitiesType>(_LightingFacilities_QNAME, LightingFacilitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupantsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OccupantsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "Occupants", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<OccupantsType> createOccupants(OccupantsType value) {
        return new JAXBElement<OccupantsType>(_Occupants_QNAME, OccupantsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsageZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "UsageZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<UsageZoneType> createUsageZone(UsageZoneType value) {
        return new JAXBElement<UsageZoneType>(_UsageZone_QNAME, UsageZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VentilationControlType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VentilationControlType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "VentilationControl")
    public JAXBElement<VentilationControlType> createVentilationControl(VentilationControlType value) {
        return new JAXBElement<VentilationControlType>(_VentilationControl_QNAME, VentilationControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractSchedule", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<AbstractScheduleType> createAbstractSchedule(AbstractScheduleType value) {
        return new JAXBElement<AbstractScheduleType>(_AbstractSchedule_QNAME, AbstractScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractTimeSeries", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML")
    public JAXBElement<AbstractTimeSeriesType> createAbstractTimeSeries(AbstractTimeSeriesType value) {
        return new JAXBElement<AbstractTimeSeriesType>(_AbstractTimeSeries_QNAME, AbstractTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractTimeSeriesFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "AbstractTimeSeriesFile", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractTimeSeries")
    public JAXBElement<AbstractTimeSeriesFileType> createAbstractTimeSeriesFile(AbstractTimeSeriesFileType value) {
        return new JAXBElement<AbstractTimeSeriesFileType>(_AbstractTimeSeriesFile_QNAME, AbstractTimeSeriesFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantValueScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstantValueScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "ConstantValueSchedule", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSchedule")
    public JAXBElement<ConstantValueScheduleType> createConstantValueSchedule(ConstantValueScheduleType value) {
        return new JAXBElement<ConstantValueScheduleType>(_ConstantValueSchedule_QNAME, ConstantValueScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyPatternScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyPatternScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "DailyPatternSchedule", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSchedule")
    public JAXBElement<DailyPatternScheduleType> createDailyPatternSchedule(DailyPatternScheduleType value) {
        return new JAXBElement<DailyPatternScheduleType>(_DailyPatternSchedule_QNAME, DailyPatternScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "DailySchedule")
    public JAXBElement<DailyScheduleType> createDailySchedule(DailyScheduleType value) {
        return new JAXBElement<DailyScheduleType>(_DailySchedule_QNAME, DailyScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DualValueScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DualValueScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "DualValueSchedule", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSchedule")
    public JAXBElement<DualValueScheduleType> createDualValueSchedule(DualValueScheduleType value) {
        return new JAXBElement<DualValueScheduleType>(_DualValueSchedule_QNAME, DualValueScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IrregularTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IrregularTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "IrregularTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractTimeSeries")
    public JAXBElement<IrregularTimeSeriesType> createIrregularTimeSeries(IrregularTimeSeriesType value) {
        return new JAXBElement<IrregularTimeSeriesType>(_IrregularTimeSeries_QNAME, IrregularTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IrregularTimeSeriesFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IrregularTimeSeriesFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "IrregularTimeSeriesFile", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractTimeSeriesFile")
    public JAXBElement<IrregularTimeSeriesFileType> createIrregularTimeSeriesFile(IrregularTimeSeriesFileType value) {
        return new JAXBElement<IrregularTimeSeriesFileType>(_IrregularTimeSeriesFile_QNAME, IrregularTimeSeriesFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeasurementPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "MeasurementPoint")
    public JAXBElement<MeasurementPointType> createMeasurementPoint(MeasurementPointType value) {
        return new JAXBElement<MeasurementPointType>(_MeasurementPoint_QNAME, MeasurementPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthlyTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthlyTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "MonthlyTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "IrregularTimeSeries")
    public JAXBElement<MonthlyTimeSeriesType> createMonthlyTimeSeries(MonthlyTimeSeriesType value) {
        return new JAXBElement<MonthlyTimeSeriesType>(_MonthlyTimeSeries_QNAME, MonthlyTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodOfYearType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodOfYearType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "PeriodOfYear")
    public JAXBElement<PeriodOfYearType> createPeriodOfYear(PeriodOfYearType value) {
        return new JAXBElement<PeriodOfYearType>(_PeriodOfYear_QNAME, PeriodOfYearType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "RegularTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractTimeSeries")
    public JAXBElement<RegularTimeSeriesType> createRegularTimeSeries(RegularTimeSeriesType value) {
        return new JAXBElement<RegularTimeSeriesType>(_RegularTimeSeries_QNAME, RegularTimeSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "RegularTimeSeriesFile", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractTimeSeriesFile")
    public JAXBElement<RegularTimeSeriesFileType> createRegularTimeSeriesFile(RegularTimeSeriesFileType value) {
        return new JAXBElement<RegularTimeSeriesFileType>(_RegularTimeSeriesFile_QNAME, RegularTimeSeriesFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeSeriesScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "TimeSeriesSchedule", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", substitutionHeadName = "AbstractSchedule")
    public JAXBElement<TimeSeriesScheduleType> createTimeSeriesSchedule(TimeSeriesScheduleType value) {
        return new JAXBElement<TimeSeriesScheduleType>(_TimeSeriesSchedule_QNAME, TimeSeriesScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeValuesPropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeValuesPropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "TimeValuesProperties")
    public JAXBElement<TimeValuesPropertiesType> createTimeValuesProperties(TimeValuesPropertiesType value) {
        return new JAXBElement<TimeValuesPropertiesType>(_TimeValuesProperties_QNAME, TimeValuesPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherStationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeatherStationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "WeatherStation", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<WeatherStationType> createWeatherStation(WeatherStationType value) {
        return new JAXBElement<WeatherStationType>(_WeatherStation_QNAME, WeatherStationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/2.0", name = "_GenericApplicationPropertyOfWeatherStation")
    public JAXBElement<Object> create_GenericApplicationPropertyOfWeatherStation(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfWeatherStation_QNAME, Object.class, null, value);
    }

}
