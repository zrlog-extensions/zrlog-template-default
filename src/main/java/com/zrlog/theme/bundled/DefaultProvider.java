package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.BundledThemeProvider;
/** Registers the default resources bundled in this JAR. */
public final class DefaultProvider implements BundledThemeProvider {
 public String id() { return "default"; }
 public String engine() { return "freemarker"; }
 public String adapter() { return ""; }
 public boolean isDefault() { return true; }
}
