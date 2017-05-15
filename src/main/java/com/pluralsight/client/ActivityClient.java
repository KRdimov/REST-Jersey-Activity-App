package com.pluralsight.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import com.pluralsight.model.Activity;

public class ActivityClient {
	private Client client;
	
	public ActivityClient() {
		client = ClientBuilder.newClient();
	}
	
	public Activity get(String activityId) {
		WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");
		
		Activity response = target.path("activities/" + activityId).request().get(Activity.class);
		
		return response;
	}

	public List<Activity> getList() {
		WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");
		
		List<Activity> response = target.path("activities").request().get(new GenericType<List<Activity>>() {});
		
		return response;
	}
}
