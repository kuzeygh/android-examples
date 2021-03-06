/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package example.intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 * @author codeguru<codeguru@users.sf.net>
 */
public class IntentChild extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.child);

        Button launchButton = (Button) this.findViewById(R.id.done_button);
        launchButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                IntentChild.this.finish();
            }
        });
    }
}
