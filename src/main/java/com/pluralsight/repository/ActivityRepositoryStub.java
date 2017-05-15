package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepository#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Running");
		activity1.setDuration(30);
		activity1.setId("1");
		activities.add(activity1);

		Activity activity2 = new Activity();
		activity2.setDescription("Biking");
		activity2.setDuration(45);
		activity2.setId("2");
		activities.add(activity2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		Activity activity1 = new Activity();
		activity1.setDescription("Running");
		activity1.setDuration(30);
		activity1.setId("1");
		
		return activity1;
	}

	@Override
	public User findActivityUser(String activityId) {
		Activity activity1 = findActivity(activityId);
		User user = new User();
		user.setId("12");
		user.setName("Pesho");
		activity1.setUser(user);
		
		return activity1.getUser();
	}

	@Override
	public void create(Activity activity) {
		// TODO Auto-generated method stub
	}
}
