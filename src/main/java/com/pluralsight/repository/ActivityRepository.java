package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);
	
	User findActivityUser(String activityId);

	void create(Activity activity);

}