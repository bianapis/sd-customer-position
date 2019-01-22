package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerPositionCollateralWithIdAndRoot
 */
public class CustomerPositionCollateralWithIdAndRoot   {
  private String customerCollateralPositionAnalysisReference = null;

  private String customerPositionAnalysisReference = null;

  private String customerReference = null;

  private String collateralAssetReference = null;

  private String collateralType = null;

  private Object collateralAssetRecord = null;

  private String collateralAssetAllocationProfile = null;

  private String collateralAssetValuation = null;

  private String collateralAssetValuationDate = null;

  private String collateralAssetLoantoValueRatio = null;

  private String collateralAssetAllocationState = null;

  private String customerProductServiceProfile = null;

  private String customerProductServiceTypeUsage = null;

  private String productInstanceReference = null;

  private String reportInstanceReference = null;

  private String reportType = null;

  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private String reportFormatTemplate = null;

  private Object reportRecord = null;

  private Object customerCollateralPositionAnalysisRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the maintained customer collateral position analysis 
   * @return customerCollateralPositionAnalysisReference
  **/

  public String getCustomerCollateralPositionAnalysisReference() {
    return customerCollateralPositionAnalysisReference;
  }

  public void setCustomerCollateralPositionAnalysisReference(String customerCollateralPositionAnalysisReference) {
    this.customerCollateralPositionAnalysisReference = customerCollateralPositionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the tracked consolidated position analysis for a customer - collateral analysis is presented to this position  
   * @return customerPositionAnalysisReference
  **/

  public String getCustomerPositionAnalysisReference() {
    return customerPositionAnalysisReference;
  }

  public void setCustomerPositionAnalysisReference(String customerPositionAnalysisReference) {
    this.customerPositionAnalysisReference = customerPositionAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the customer's collateral asset or collection of collateral assets 
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: the type of collateral asset 
   * @return collateralType
  **/

  public String getCollateralType() {
    return collateralType;
  }

  public void setCollateralType(String collateralType) {
    this.collateralType = collateralType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: reference details and propoerties of the asset 
   * @return collateralAssetRecord
  **/

  public Object getCollateralAssetRecord() {
    return collateralAssetRecord;
  }

  public void setCollateralAssetRecord(Object collateralAssetRecord) {
    this.collateralAssetRecord = collateralAssetRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: lists its allocation to different products 
   * @return collateralAssetAllocationProfile
  **/

  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collateral Asset Valuation 
   * @return collateralAssetValuation
  **/

  public String getCollateralAssetValuation() {
    return collateralAssetValuation;
  }

  public void setCollateralAssetValuation(String collateralAssetValuation) {
    this.collateralAssetValuation = collateralAssetValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Collateral Asset Valuation Date 
   * @return collateralAssetValuationDate
  **/

  public String getCollateralAssetValuationDate() {
    return collateralAssetValuationDate;
  }

  public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
    this.collateralAssetValuationDate = collateralAssetValuationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Collateral Asset Loan to Value Ratio 
   * @return collateralAssetLoantoValueRatio
  **/

  public String getCollateralAssetLoantoValueRatio() {
    return collateralAssetLoantoValueRatio;
  }

  public void setCollateralAssetLoantoValueRatio(String collateralAssetLoantoValueRatio) {
    this.collateralAssetLoantoValueRatio = collateralAssetLoantoValueRatio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: for each allocation of the asset as collateral its state can be earmarked i.e. pending confirmation, allocated or in the process being recalled 
   * @return collateralAssetAllocationState
  **/

  public String getCollateralAssetAllocationState() {
    return collateralAssetAllocationState;
  }

  public void setCollateralAssetAllocationState(String collateralAssetAllocationState) {
    this.collateralAssetAllocationState = collateralAssetAllocationState;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the eligibility profile including in - force product terms for the customer - defining sources for collateral utilization analysis 
   * @return customerProductServiceProfile
  **/

  public String getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(String customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records the sold/in 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the product/service for which transaction activity is to be obtained  
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the product/service activity report 
   * @return reportInstanceReference
  **/

  public String getReportInstanceReference() {
    return reportInstanceReference;
  }

  public void setReportInstanceReference(String reportInstanceReference) {
    this.reportInstanceReference = reportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: type of product/service activity report - transactional activity used for collateral utilization  
   * @return reportType
  **/

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines content/transaction types to be included in extract 
   * @return reportOptionsSelectionCriteria
  **/

  public String getReportOptionsSelectionCriteria() {
    return reportOptionsSelectionCriteria;
  }

  public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
    this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from-to dates covered by the report for analysis 
   * @return reportPeriod
  **/

  public String getReportPeriod() {
    return reportPeriod;
  }

  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines presentation format 
   * @return reportFormatTemplate
  **/

  public String getReportFormatTemplate() {
    return reportFormatTemplate;
  }

  public void setReportFormatTemplate(String reportFormatTemplate) {
    this.reportFormatTemplate = reportFormatTemplate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the product/service activity report 
   * @return reportRecord
  **/

  public Object getReportRecord() {
    return reportRecord;
  }

  public void setReportRecord(Object reportRecord) {
    this.reportRecord = reportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: the customer collateral position analysis - combines collateral vlauation, allocation and associated product utilization  
   * @return customerCollateralPositionAnalysisRecord
  **/

  public Object getCustomerCollateralPositionAnalysisRecord() {
    return customerCollateralPositionAnalysisRecord;
  }

  public void setCustomerCollateralPositionAnalysisRecord(Object customerCollateralPositionAnalysisRecord) {
    this.customerCollateralPositionAnalysisRecord = customerCollateralPositionAnalysisRecord;
  }


}

