package org.smartregister.reporting.interfaces;

import android.content.Context;
import android.view.View;

import org.smartregister.reporting.models.ReportingIndicatorVisualization;

public interface IndicatorVisualisationFactory {
    View getIndicatorView(ReportingIndicatorVisualization data, Context context);
}
