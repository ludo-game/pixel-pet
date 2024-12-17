package com.ludo.plugin.bundler;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

/** Bundles client code. */
@Mojo(name = "bundle")
final class BundlerMojo extends AbstractMojo {

  @Override
  public void execute() {
    getLog().info("Bundling plugin.");
  }
}
