package org.ait.project.onboardingtask.shared.openfeign.reqres.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReqresCreateUserRequest{

	@JsonProperty("name")
	private String name;

	@JsonProperty("job")
	private String job;
}