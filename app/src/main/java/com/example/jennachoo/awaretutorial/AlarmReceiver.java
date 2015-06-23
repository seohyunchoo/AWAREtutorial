package com.example.jennachoo.awaretutorial;


import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import com.aware.ESM;

public class AlarmReceiver extends BroadcastReceiver {
    private static final String ONE = "{'esm':{" +
            "'esm_type':" + ESM.TYPE_ESM_RADIO + "," +
            "'esm_title': 'Balanced Campus'," +
            "'esm_instructions': 'How have you been feeling the past few hours?'," +
            "'esm_radios':['happy','sad','neutral','irritated/angry/frustrated', confused']," +
            "'esm_submit': 'Next'," +
            "'esm_expiration_threashold': 60," +
            "'esm_trigger': 'com.aware.plugin.balancedcampus'" +
            "}}";
    private static final String TWO = "{'esm':{" +
            "'esm_type':" + ESM.TYPE_ESM_RADIO + "," +
            "'esm_title': 'Balanced Campus'," +
            "'esm_instructions': 'How energetic have you been the past few hours?'," +
            "'esm_radios':['1 (not at all)', 2 (a little)', '3 (so so)', '4 (a lot)', '5 (very much/extensive)' ]," +
            "'esm_submit': 'Next'," +
            "'esm_expiration_threashold': 60," +
            "'esm_trigger': 'com.aware.plugin.balancedcampus'" +
            "}}";
    private static final String THREE = "{'esm':{" +
            "'esm_type':" + ESM.TYPE_ESM_RADIO + "," +
            "'esm_title': 'Balanced Campus'," +
            "'esm_instructions': 'How productive have you been the past few hours?'," +
            "'esm_radios':['1 (not at all)', 2 (a little)', '3 (so so)', '4 (a lot)', '5 (very much/extensive)' ]," +
            "'esm_submit': 'Next'," +
            "'esm_expiration_threashold': 60," +
            "'esm_trigger': 'com.aware.plugin.balancedcampus'" +
            "}}";
    private static final String FOUR = "{'esm':{" +
            "'esm_type':" + ESM.TYPE_ESM_RADIO + "," +
            "'esm_title': 'Balanced Campus'," +
            "'esm_instructions': 'What was your workload the past few hours?'," +
            "'esm_radios':['1 (not at all)', 2 (a little)', '3 (so so)', '4 (a lot)', '5 (very much/extensive)' ]," +
            "'esm_submit': 'Submit'," +
            "'esm_expiration_threashold': 60," +
            "'esm_trigger': 'com.aware.plugin.balancedcampus'" +
            "}}";

    private static final String COMBINED = "[" + ONE + "," + TWO + "," +  THREE + "," +  FOUR + "]";
    public AlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent queue_esm = new Intent(ESM.ACTION_AWARE_QUEUE_ESM);
        String esmJSON = COMBINED;
        queue_esm.putExtra(ESM.EXTRA_ESM, esmJSON);
        context.sendBroadcast(queue_esm);
    }
}
