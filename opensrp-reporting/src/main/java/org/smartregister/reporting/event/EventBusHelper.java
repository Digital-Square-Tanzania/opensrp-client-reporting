package org.smartregister.reporting.event;

import org.greenrobot.eventbus.EventBus;

public class EventBusHelper {

    public static void postEvent(IndicatorTallyEvent event) {
        EventBus.getDefault().post(event);
    }

    public static void postStickyEvent(IndicatorTallyEvent event) {
        EventBus.getDefault().postSticky(event);
    }

    /**
     * Manually clean sticky event
     *
     * @param event The event to be cleaned
     */
    public static void removeStickyEvent(IndicatorTallyEvent event) {
        EventBus.getDefault().removeStickyEvent(event);

    }
}
