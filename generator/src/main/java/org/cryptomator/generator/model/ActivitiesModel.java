package org.cryptomator.generator.model;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ActivitiesModel {

	private final SortedSet<ActivityModel> activities;

	private ActivitiesModel(SortedSet<ActivityModel> activities) {
		this.activities = activities;
	}

	public static ActivitiesModel.Builder builder() {
		return new Builder();
	}

	public Set<ActivityModel> getActivities() {
		return activities;
	}

	public String getJavaPackage() {
		return "org.cryptomator.presentation.ui.activity";
	}

	public String getClassName() {
		return "Activities";
	}

	public static class Builder {

		private final SortedSet<ActivityModel> activities = new TreeSet<>();

		private Builder() {
		}

		public Builder add(ActivityModel activity) {
			activities.add(activity);
			return this;
		}

		public ActivitiesModel build() {
			return new ActivitiesModel(activities);
		}

	}

}
