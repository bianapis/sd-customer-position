/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyze;

@BianRestController
public class CustomerPositionApiController {

	@Autowired
	CustomerPositionApiService service;
	
	@Analyze.Record
	public BianResponse<CustomerPositionRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerPositionRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.RequestPost
	public BianResponse<CustomerPositionAnalysisWithIdAndRoot> requestPost(@RequestBody BianRequest<CustomerPositionAnalysisBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Analyze.RequestPut
	public BianResponse<CustomerPositionAnalysisWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerPositionAnalysisBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.Retrieve
	public BianResponse<CustomerPositionAnalysisWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Analyze.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Analyze.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("cashflows")
	@Analyze.Retrieve
	public BianResponse<CustomerPositionCashflowWithIdAndRoot> retrieveCashflows(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCashflows(crReferenceId, bqReferenceId));
	}
	
	@BQ("collaterals")
	@Analyze.Retrieve
	public BianResponse<CustomerPositionCollateralWithIdAndRoot> retrieveCollaterals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollaterals(crReferenceId, bqReferenceId));
	}
	
	@BQ("credits")
	@Analyze.Retrieve
	public BianResponse<CustomerPositionCreditWithIdAndRoot> retrieveCredits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCredits(crReferenceId, bqReferenceId));
	}
	
	@Analyze.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
