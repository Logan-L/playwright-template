package dev.playwright_template.utils;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

public class TestOptions {
    public static class RunWithGui implements OptionsFactory {
        @Override
        public Options getOptions() {
            return new Options().setHeadless(false);
        }
    }

    public static class OverrideBaseURL implements OptionsFactory {
        @Override
        public Options getOptions() {
            return new Options()
                    .setContextOptions(new Browser.NewContextOptions()
                            .setBaseURL("https://playwright.dev"))
                    .setApiRequestOptions(new APIRequest.NewContextOptions()
                            .setBaseURL("https://playwright.dev"));
        }
    }
}