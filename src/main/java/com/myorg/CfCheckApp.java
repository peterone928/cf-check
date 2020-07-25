package com.myorg;

import software.amazon.awscdk.core.App;

public final class CfCheckApp {
    public static void main(final String[] args) {
        App app = new App();

        new CfCheckStack(app, "CfCheckStack");

        app.synth();
    }
}
