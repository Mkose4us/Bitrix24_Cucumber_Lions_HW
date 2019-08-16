package com.bitrix.utilities;

import com.bitrix.pages.activites.CalendarEventsPage;
import com.bitrix.pages.activity_stream.ActivityStreamPage;
import com.bitrix.pages.dashboards.DashboardPage;
import com.bitrix.pages.dashboards.ManageDashboards;
import com.bitrix.pages.fleet.VehiclesPage;
import com.bitrix.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private ActivityStreamPage activityStreamPage;


    public ActivityStreamPage activityStreamPage() {
        if (activityStreamPage == null) {
            activityStreamPage = new ActivityStreamPage();
        }
        return activityStreamPage;
    }



    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


}
