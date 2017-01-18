package com.jraska.github.client.common;

public final class DeveloperError extends Error {
  public DeveloperError() {
  }

  public DeveloperError(String message) {
    super(message);
  }

  public DeveloperError(String message, Throwable cause) {
    super(message, cause);
  }

  public DeveloperError(Throwable cause) {
    super(cause);
  }
}