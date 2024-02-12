package org.smartregister.reporting.event;

import android.support.annotation.NonNull;

import org.smartregister.reporting.domain.TallyStatus;

public class IndicatorTallyEvent extends BaseEvent {

    private TallyStatus status;
    private String message;

    public IndicatorTallyEvent(@NonNull TallyStatus tallyStatus) {
        this.status = tallyStatus;
    }

    public TallyStatus getStatus() {
        return status;
    }

    public void setStatus(TallyStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
